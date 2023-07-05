package lecture_10;

import java.io.IOException;
import java.util.List;

public class Hatten_2 {
    public static void main(String[] args) {
        try{
            FileManager fileManager = new FileManager("students.txt");
            List<String> lists=fileManager.getAsList();
            for (int i=0;i<5;i++){
                String n=lists.get(i);
                System.out.println(n);
            }
        }catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入力してください");
        }catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }



    }
}
