package lecture_07;

public class Circle {
    private float r;

    Circle(){
        this.r=1;
    }

    public void ensyu(){
        System.out.println("円周の長さは"+r*2.0*3.14);
    }

    public void menseki(){
        System.out.println("円の面積は"+r*r*3.14);
    }

    public void setR(float r){
        if(r<=0){
            this.r=1;
        }else {
            this.r=r;
        }
    }


}
