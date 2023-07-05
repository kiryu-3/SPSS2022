package AI;

import java.util.Scanner;
import java.util.Random;

public class janken {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        NeuralNet nn = new NeuralNet(3, 36, 3);

        double knownInputs[][] = {
                {1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1},     //グー、チョキ、パーの順
                {0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0},     //チョキ、パー、グーの順
                {0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 0}      //パー、グー、チョキの順
        };

        int hand;

        //教師データ
        double t[][] = {
                {1, 0, 0},  //これをグー
                {0, 1, 0},  //これをチョキ
                {0, 0, 1}   //これをパー
        };

        //訓練データ
        double unknownInputs[][] = new double[7][3];

        int flag = 0;
        System.out.println("じゃんけんゲーム");
        while (flag != 6) {
            System.out.println(flag+1+"回目");
            System.out.println("手を入力(グー:0,チョキ:1,パー:2)");
            System.out.println("終わらせたいなら3を入力");
            hand = input.nextInt();
            int com_hand = random.nextInt(3);
            switch (hand) {
                case 3:
                    System.out.println("ゲーム終了");
                    return;

                case 0:
                    if (com_hand == 1) {
                        System.out.println("コンピュータの手:チョキ");
                        System.out.println("あなたの勝ち");
                        unknownInputs[0][0] = t[0][0];
                        flag=flag+1;
                        continue;
                    } else if (com_hand == 2) {
                        System.out.println("コンピュータの手:パー");
                        System.out.println("あなたの負け");
                        unknownInputs[0][0] = t[0][0];
                        flag=flag+1;
                        continue;
                    } else {
                        System.out.println("コンピュータの手:グー");
                        System.out.println("あいこ");
                        unknownInputs[0][0] = t[0][0];
                        flag=flag+1;
                        continue;
                    }

                case 1:
                    if (com_hand == 2) {
                        System.out.println("コンピュータの手:パー");
                        System.out.println("あなたの勝ち");
                        unknownInputs[1][0] = t[1][0];
                        flag=flag+1;
                        continue;
                    } else if (com_hand == 0) {
                        System.out.println("コンピュータの手:グー");
                        System.out.println("あなたの負け");
                        unknownInputs[1][0] = t[1][0];
                        flag=flag+1;
                        continue;
                    } else {
                        System.out.println("コンピュータの手:チョキ");
                        System.out.println("あいこ");
                        unknownInputs[1][0] = t[1][0];
                        flag=flag+1;
                        continue;
                    }

                case 2:
                    if (com_hand == 0) {
                        System.out.println("コンピュータの手:グー");
                        System.out.println("あなたの勝ち");
                        unknownInputs[2][0] = t[2][0];
                        flag=flag+1;
                        continue;
                    } else if (com_hand == 1) {
                        System.out.println("コンピュータの手:チョキ");
                        System.out.println("あなたの負け");
                        unknownInputs[2][0] = t[2][0];
                        flag=flag+1;
                        continue;
                    } else {
                        System.out.println("コンピュータの手:パー");
                        System.out.println("あいこ");
                        unknownInputs[2][0] = t[2][0];
                        flag=flag+1;
                        continue;
                    }

                default:
                    System.out.println("正しい数字を入力してください");

            }


        }

        System.out.println("--学習開始--");
        nn.learn(knownInputs, t);
        System.out.println("--学習終了--");

        while (true) {
            System.out.println("手を入力(グー:0,チョキ:1,パー:2)");
            System.out.println("終わらせたいなら3を入力");
            int new_hand = input.nextInt();
            int new_com_hand=0;
            double max=0;


            if (new_hand == 3) {
                System.out.println("終了");
                return;
            }
            //ここから推論//
            double[] AI_hand = nn.compute(t[new_hand]);

            //グー、チョキ、パーの中で大きい値を取り出す
            for (int i=0;i<AI_hand.length;i++) {
                if (max<AI_hand[i]){
                    max=AI_hand[i];
                }
                System.out.println(AI_hand[i]);
            }
            if (max == AI_hand[0]) {
                new_com_hand = 2;
            } else if (max == AI_hand[1]) {
                new_com_hand = 0;
            } else if (max == AI_hand[2]) {
                new_com_hand = 1;
            }

            switch (new_hand) {

                case 0:
                    if (new_com_hand == 1) {
                        System.out.println("コンピュータの手:チョキ");
                        System.out.println("あなたの勝ち");
                        continue;
                    } else if (new_com_hand == 2) {
                        System.out.println("コンピュータの手:パー");
                        System.out.println("あなたの負け");
                        continue;
                    } else {
                        System.out.println("コンピュータの手:グー");
                        System.out.println("あいこ");
                        continue;
                    }

                case 1:
                    if (new_com_hand == 2) {
                        System.out.println("コンピュータの手:パー");
                        System.out.println("あなたの勝ち");
                        continue;
                    } else if (new_com_hand == 0) {
                        System.out.println("コンピュータの手:グー");
                        System.out.println("あなたの負け");
                        continue;
                    } else {
                        System.out.println("コンピュータの手:チョキ");
                        System.out.println("あいこ");
                        continue;
                    }

                case 2:
                    if (new_com_hand == 0) {
                        System.out.println("コンピュータの手:グー");
                        System.out.println("あなたの勝ち");
                        continue;
                    } else if (new_com_hand == 1) {
                        System.out.println("コンピュータの手:チョキ");
                        System.out.println("あなたの負け");
                        continue;
                    } else {
                        System.out.println("コンピュータの手:パー");
                        System.out.println("あいこ");
                        continue;
                    }
                default:
                    System.out.println("正しい数字を入力してください");

            }

        }
    }
}
