package lecture_06;

public class Target {
    String label;
    int x;
    int y;

    Target(String label,int x,int y){
        this.label=label;
        this.x=x;
        this.y=y;
    }

    void hidari(){
        if(x>0){
            x=x-1;
        }
    }

    void migi(){
        if(x<4){
            x=x+1;
        }
    }

    void ue(){
        if(y>0){
            y=y-1;
        }
    }

    void shita(){
        if(y<4){
            y=y+1;
        }
    }
}
