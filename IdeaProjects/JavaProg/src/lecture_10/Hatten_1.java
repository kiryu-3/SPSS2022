package lecture_10;

import java.io.IOException;

public class Hatten_1 {
    public static void main(String[] args) {
        try{
            FileManager fileManager = new FileManager("students.txt");
            String[] lines = fileManager.getAsArray();
            for (String str:lines){
                System.out.println(str);
            }
        }catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入力してください");
        }catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }



    }
}
