package lecture_05;

import java.util.Scanner;

public class kadai56 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("x=");
        float x=input.nextFloat();
        System.out.print("y=");
        float y= input.nextFloat();
        System.out.print("z=");
        float z= input.nextFloat();

        Square s=new Square();
        s.tate=x;
        s.yoko=y;
        s.takasa=z;
        float sm=s.menseki();
        float sq=s.taiseki();
        System.out.println("四角形の面積は" + sm);
        System.out.println("四角柱の体積は" + sq);

        Triangle t=new Triangle();
        t.tate=x;
        t.yoko=y;
        t.takasa=z;
        float tm=t.menseki();
        float tr=t.taiseki();
        System.out.println("三角形の面積は" + tm);
        System.out.println("三角柱の体積は" + tr);




    }
}
