package lecture_05;
import java.util.Scanner;

public class Kadai55 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("x=");
        float x=input.nextFloat();
        System.out.print("y=");
        float y= input.nextFloat();

        Square s=new Square();
        s.tate=x;
        s.yoko=y;
        float sm=s.menseki();
        System.out.println("四角形の面積は" + sm);

        Triangle t=new Triangle();
        t.tate=x;
        t.yoko=y;
        float tm=t.menseki();
        System.out.println("三角形の面積は" + tm);

    }
}
