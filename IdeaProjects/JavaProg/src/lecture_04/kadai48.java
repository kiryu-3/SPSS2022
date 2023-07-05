package lecture_04;
import java.util.Scanner;

public class kadai48 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        System.out.print("n=");
        int n=input.nextInt();

        Hantei hantei=new Hantei();
        String x= hantei.evenOrOdd(n);

        System.out.println(n+"は"+x);



    }


}
