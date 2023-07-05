import java.util.Scanner;

public class Array2DMap {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        int[][] ia=new int[5][5];
        int x=2;
        int y=2;

        while (true) {

            for(int i=0;i<ia.length;i++){
                for(int k=0;k<ia.length;k++) {
                    if (i == x && k == y) {
                        ia[i][k] = 1;
                    } else {
                        ia[i][k] = 0;
                    }


                    System.out.print(ia[i][k] + " ");
                }
                System.out.println();
            }
            System.out.print("どちらに移動する?");

            String key = input.next();
            switch (key) {
                case "a":
                    if(ia[0][0]==1 || ia[1][0]==1 || ia[2][0]==1 || ia[3][0]==1 || ia[4][0]==1){
                        System.out.println("移動できません");
                        break;
                    }
                    y = y - 1;
                    System.out.println("左に移動");
                    break;

                case "d":
                    if(ia[0][4]==1 || ia[1][4]==1 || ia[2][4]==1 || ia[3][4]==1 || ia[4][4]==1){
                        System.out.println("移動できません");
                        break;
                    }
                    y = y + 1;
                    System.out.println("右に移動");
                    break;

                case "w":
                    if(ia[0][0]==1 || ia[0][1]==1 || ia[0][2] ==1 || ia[0][3]==1 || ia[0][4]==1){
                        System.out.println("移動できません");
                        break;
                    }
                    x = x - 1;
                    System.out.println("上に移動");
                    break;

                case "s":
                    if(ia[4][0]==1 || ia[4][1]==1 || ia[4][2]==1 || ia[4][3]==1 || ia[4][4]==1){
                        System.out.println("移動できません");
                        break;
                    }
                    x = x + 1;
                    System.out.println("下に移動");
                    break;

                case "q":
                    System.out.println("終了");
                    System.exit(0);
            }
        }

    }
}


