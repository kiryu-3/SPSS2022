import java.util.Scanner;

class AgeChecker {
    public static void main(String[] args){

        while(true){
            Scanner input=new Scanner(System.in);
            System.out.print("年齢を入力してください:");
            int age=input.nextInt();

            if(age>=20 && age<=120){
                System.out.println("成人");
            }else if(age<20 && age>=0){
                System.out.println("未成年");
            }else{
                System.out.println("エラー");
                break;
            }


        }

    }
}
