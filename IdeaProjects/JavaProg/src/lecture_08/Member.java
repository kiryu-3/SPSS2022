package lecture_08;

public class Member {
    private String gakuseki;
    private String shimei;

    public Member(String gakuseki,String shimei){
        this.gakuseki=gakuseki;
        this.shimei=shimei;
    }

    public void print(){
        if(this.gakuseki!=null && this.shimei!=null){
            System.out.print(this.gakuseki+",");
            System.out.println(this.shimei);
        }
    }
}
