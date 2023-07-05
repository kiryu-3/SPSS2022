package lecture_09;

import java.sql.Struct;

public class Omikuji {
    private String unsei;
    private String setumei;

    public Omikuji(String unsei,String setumei){
        this.unsei=unsei;
        this.setumei=setumei;
    }

    public void print(){
        String str="今日の運勢:"+unsei+","+setumei;
        System.out.println(str);
    }


}
