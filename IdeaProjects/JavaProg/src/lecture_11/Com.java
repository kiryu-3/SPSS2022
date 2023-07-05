package lecture_11;

import java.util.Random;

public class Com {
    private int hand;
    private int sum_hand=0;
    Random random = new Random();
    Deck deck = new Deck();
    public int getHand(){
        for(int i=0;i<2;i++){
            int number=random.nextInt(deck.printDeck());
            Card com_card = deck.drawCard(number);
            hand=com_card.getNumber();
            sum_hand=hand+sum_hand;
        }
        return sum_hand;
    }
}
