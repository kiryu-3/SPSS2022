package lecture_09;

public class Sankaku extends Zukei{
    public Sankaku(float tate,float yoko,float takasa){
        super.tate=tate;
        super.yoko=yoko;
        super.takasa=takasa;
    }

    @Override
    protected float calcMenseki(){
        float tate=this.tate;
        float yoko=this.yoko;
        float ans=tate*yoko/2;
        return ans;
    }

}
