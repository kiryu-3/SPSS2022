package lecture_09;
import java.util.Random;

public class OmikujiBox {
    private Omikuji[] omikujis;

    public OmikujiBox(){
        omikujis=new Omikuji[5];
        omikujis[0]=new Omikuji("大吉","今日は絶好調");
        omikujis[1]=new Omikuji("吉","嬉しいことが起きるかも");
        omikujis[2]=new Omikuji("中吉","忘れ物に注意");
        omikujis[3]=new Omikuji("小吉","寝坊に注意");
        omikujis[4]=new Omikuji("凶","めげずに頑張ろう");
    }

    public void pickup(){
        Random rand=new Random();
        int n=rand.nextInt(5);
        Omikuji omikuji=omikujis[n];
        omikuji.print();
    }
}
