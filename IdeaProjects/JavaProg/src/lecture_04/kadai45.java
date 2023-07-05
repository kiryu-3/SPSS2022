package lecture_04;
import java.util.Scanner;
import java.util.concurrent.Callable;


public class kadai45 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("a=");
        int a=input.nextInt();
        System.out.print("b=");
        int b=input.nextInt();

        Comparison comp=new Comparison(a,b);  //aとbを引数にわたして、getMax,GetMinの引数にして判定させる
        comp.print();

    }
}

