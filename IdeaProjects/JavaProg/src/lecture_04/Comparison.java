package lecture_04;

public class Comparison {

    int a;
    int b;

    Comparison(int x, int y) {
        this.a = x;
        this.b = y;
    }

    int getMax(int a, int b) {
        if (a >= b) {
            return a;
        }
        return b;
    }

    int getMin(int a, int b) {
        if (a <= b) {
            return a;
        }
        return b;
    }

    void print() {
        System.out.println("大きいのは" + getMax(a, b));
        System.out.println("小さいのは" + getMin(a, b));
    }
}
