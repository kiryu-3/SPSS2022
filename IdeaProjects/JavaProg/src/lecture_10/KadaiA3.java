package lecture_10;

public class KadaiA3 {
    public static void main(String[] args) {
        try{
            String line1="b1970010,千歳光";
            Student s1=new Student(line1);
            s1.print();
            String line2="b1970020,札幌太郎";
            Student s2=new Student(line2);
            s2.print();
        }catch (RuntimeException e){
            System.out.println("不正なインスタンス");
        }
        System.out.println("終了");
    }
}
