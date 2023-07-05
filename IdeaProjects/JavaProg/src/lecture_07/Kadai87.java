package lecture_07;

import java.util.Scanner;

public class Kadai87 {
    public static void main(String[] args) {
        Circle c=new Circle();
        Scanner input=new Scanner(System.in);

        for(int i=0;i<3;i++){
            System.out.print("r=");
            float f=input.nextFloat();
            c.setR(f);
            c.ensyu();
            c.menseki();
        }
    }
}
