package lecture_11;

public class Player {
    private int hand;
    Deck deck = new Deck();

    public int Number(int number){
        Card card=deck.drawCard(number);
        System.out.print("引いたカード:");
        card.print();
        hand=card.getNumber();

        return hand;
    }

    public int getHand(){
        return this.hand;
    }




}
