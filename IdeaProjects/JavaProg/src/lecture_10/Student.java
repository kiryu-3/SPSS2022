package lecture_10;

public class Student {
    private String number;
    private String name;

    public Student(String arg){
        if(arg==null){
            throw new RuntimeException();
        }
        String[] splitted=arg.split(",");
        this.number=splitted[0];
        this.name=splitted[1];
    }

    public void print(){
        String message="学籍:"+this.number+" 氏名"+this.name;
        System.out.println(message);
    }
}
