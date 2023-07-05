package lecture_06;

import java.util.Random;
import java.util.Scanner;

public class Kadai65 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Random rand=new Random();

        Target tA=new Target("A",4,4);
        Target tE=new Target("E",1,1);

        int gx=rand.nextInt(4);
        int gy=rand.nextInt(4);
        Target tG=new Target("G",gx,gy);

        while(true){
            for(int y=0;y<5;y++){
                for(int x=0;x<5;x++){
                    if(x==tA.x && y== tA.y){
                        System.out.print("A");
                    }else if(x== tG.x && y== tG.y){
                        System.out.print("G");
                    }else if(x==tE.x && y==tE.y){
                        System.out.print("E");
                    }
                    else{
                        System.out.print(".");
                    }
                }
                System.out.println(" ");
            }
            System.out.print("どちらに移動する?:");
            String key=input.next();
            if(key.equals("w")){
                tA.ue();
            }else if(key.equals("a")){
                tA.hidari();
            }else if(key.equals("s")){
                tA.shita();
            }else if(key.equals("d")){
                tA.migi();
            }else{
                System.out.println("もう一度入力");
            }

            if(tA.x==tG.x && tA.y== tG.y){
                System.out.println("Goal!");
                System.exit(0);
            }

            int position_E= rand.nextInt(4);
            if(position_E==0){
                tE.ue();
            }else if(position_E==1){
                tE.shita();
            }else if(position_E==2){
                tE.migi();
            }else{
                tE.hidari();
            }

            if(tA.x==tE.x && tA.y==tE.y){
                System.out.println("You Lose...");
                System.exit(0);
            }

            int position_G=rand.nextInt(4);
            if(position_G==0){
                tG.ue();
            }else if(position_G==1){
                tG.shita();
            }else if(position_G==2){
                tG.migi();
            }else{
                tG.hidari();
            }
        }
    }

}
