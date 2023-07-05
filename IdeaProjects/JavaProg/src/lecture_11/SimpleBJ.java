package lecture_11;
import java.util.Scanner;

public class SimpleBJ {
    public static void main(String[] args) {
        Deck deck=new Deck();
        Scanner input=new Scanner(System.in);
        try{
            System.out.println("ゲームスタート");

            System.out.print("何番目のカードを引く?");
            int number1=input.nextInt();
            Player hand1=new Player();
            hand1.Number(number1);

            System.out.print("何番目のカードを引く?");
            int number2=input.nextInt();
            Player hand2=new Player();
            hand2.Number(number2);
            System.out.println("コンピュータがドロー");
            Com com=new Com();
            Shoubu battle=new Shoubu(hand1.getHand(),hand2.getHand(),com.getHand());
            battle.battle();
        }catch (IndexOutOfBoundsException e){
            System.out.println("正しい数字を入力してください");
            System.exit(0);
        }

        }
    }

