package lecture_04;

import java.util.Scanner;

public class kadai47 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        InputManager maneger = new InputManager();

        int a = maneger.scana();
        int b = maneger.scanb();

        Comparison comp = new Comparison(a, b);
        comp.print();
    }
}