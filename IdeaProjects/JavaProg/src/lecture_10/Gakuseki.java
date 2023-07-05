package lecture_10;

public class Gakuseki {
    private String number;

    public Gakuseki(String number){
        if(number==null){
            throw new RuntimeException();
        }
        this.number=number;
    }

    public void print(){
        String msg="学籍番号:"+this.number;
        System.out.println(msg);
    }
}
