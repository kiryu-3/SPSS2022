import java.util.Scanner;

public class SearchMin {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int[] ia=new int[5];

        for(int i=0;i<ia.length;i++){
            System.out.print("整数を入力してください");
            int n=input.nextInt();
            ia[i]=n;
        }

        int min=ia[0];
        for(int j=0;j<ia.length;j++){
            int item=ia[j];
            System.out.println("第"+j+"要素は:"+item);

            if(min>ia[j]){
                min=ia[j];
            }
        }
        System.out.println("最小値は:"+min);
    }
}
