package lecture_04;

import java.util.Scanner;

public class InputManager {
    Scanner input= new Scanner(System.in);
    int scana() {

        System.out.print("a=");
        int a = input.nextInt();

        return a;

    }

    int scanb(){

        System.out.print("b=");
        int b =input.nextInt();

        return b;

    }
}
