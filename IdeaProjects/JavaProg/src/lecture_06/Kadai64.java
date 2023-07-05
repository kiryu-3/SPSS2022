package lecture_06;
import  java.util.Scanner;
public class Kadai64 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true){
            System.out.print("上底の入力");
            float t=input.nextFloat();
            System.out.print("下底の入力");
            float b=input.nextFloat();
            System.out.print("高さの入力");
            float h=input.nextFloat();
            if(t==0 || b==0 || h==0){
                System.out.println("終了");
                System.exit(0);
            }

            Daikei d=new Daikei(t,b,h);
            d.print();
        }
    }
}
