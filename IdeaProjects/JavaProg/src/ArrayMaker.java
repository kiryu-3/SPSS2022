import java.util.Scanner;

public class ArrayMaker {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] ia=new int [5];

        for(int i=0;i<ia.length;i++){
            System.out.print("整数を入力してください");
            int n=input.nextInt();
            ia[i]=n;
        }

        for(int j=0;j<ia.length;j++){
            int item=ia[j];
            System.out.println("第"+j+"要素は:"+item);
        }
    }
}
