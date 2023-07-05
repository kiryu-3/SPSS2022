package lecture_09;

public class Zukei {
    protected float tate;
    protected float yoko;
    protected float takasa;

    protected float calcMenseki(){
        return 0.0f;
    }

    protected float calcTaiseki(){
        return calcMenseki()*takasa;
    }

    public void print(){
        float ans=calcMenseki();
        float ans2=calcTaiseki();
        System.out.print("面積="+ans);
        System.out.println("体積="+ans2);
    }
}
