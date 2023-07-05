package lecture_05;

public class Kadai53 {
    public static void main(String[] args) {
        MultiChecker mc1=new MultiChecker();
        mc1.arg=4;

        MultiChecker mc2=new MultiChecker();
        mc2.arg=5;

        String ans1=mc1.check(225);
        System.out.println(ans1);
        String ans2= mc2.check(225);
        System.out.println(ans2);
    }
}
