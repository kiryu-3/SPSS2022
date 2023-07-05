package lecture_07;

public class Kadai84 {
    public static void main(String[] args) {
        ExamResult r1=new ExamResult("Hikari",79);
        String kekka1=r1.decide(80);
        System.out.println(kekka1);

        r1.setPoint(81);//pointの値だけ変更
        String kekka2=r1.decide(80);
        System.out.println(kekka2);

        r1.setPoint(-2);//pointの値だけ変更
        String kekka3=r1.decide(80);
        System.out.println(kekka3);

    }
}
