package lecture_11;

import java.util.Scanner;

public class DeckCheck {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.printCardList();
        Scanner input=new Scanner(System.in);
        try{
            System.out.print("何番目のカードを引く?");
            int num=input.nextInt();
            Card card=deck.drawCard(num);
            System.out.print("引いたカード:");
            card.print();
        }catch (IndexOutOfBoundsException e){
            System.out.println("正しい数字を入力してください");
        }


    }
}
