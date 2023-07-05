package lecture_10;

import java.io.IOException;

public class KadaiA5 {
    public static void main(String[] args) {
        try{
            FileManager fileManager = new FileManager("students.txt");
            String[] lines = fileManager.getAsArray();
            for (int i=0;i<5;i++){
                Student student=new Student(lines[i]);
                student.print();
            }
        }catch (IllegalArgumentException e1){
            System.out.println("ファイル名を正しく入力してください");
        }catch (IOException e2){
            System.out.println("ファイルが読み込めません");
        }



    }
}
