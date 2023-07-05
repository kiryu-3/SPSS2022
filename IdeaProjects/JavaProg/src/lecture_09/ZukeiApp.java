package lecture_09;

import java.util.Scanner;

public class ZukeiApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("縦:");
        float tate=input.nextFloat();
        System.out.print("横:");
        float yoko=input.nextFloat();
        float takasa=0;

        Shikaku shikaku = new Shikaku(tate,yoko,takasa);
        Sankaku sankaku = new Sankaku(tate,yoko,takasa);
        shikaku.print();
        sankaku.print();
    }
}
