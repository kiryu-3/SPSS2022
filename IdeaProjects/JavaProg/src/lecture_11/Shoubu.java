package lecture_11;

public class Shoubu {
    private int my_hand;
    private int com_hand;

    public Shoubu(int hand1,int hand2,int com_hand){
        this.my_hand=hand1+hand2;
        this.com_hand=com_hand;
    }

    public void battle(){
        if(my_hand>com_hand && my_hand<21 && com_hand<21){
            System.out.println("あなた"+my_hand);
            System.out.println("com"+com_hand);
            System.out.println("あなたの勝ち");
        } else if (my_hand<com_hand && my_hand<21 && com_hand<21) {
            System.out.println("あなた"+my_hand);
            System.out.println("com"+com_hand);
            System.out.println("computerの勝ち");
        } else if (my_hand>=21 && com_hand<21) {
            System.out.println("あなた"+my_hand);
            System.out.println("com"+com_hand);
            System.out.println("21を超えたのでcomputerの勝ち");
        } else if (my_hand<21 && com_hand>=21) {
            System.out.println("あなた"+my_hand);
            System.out.println("com"+com_hand);
            System.out.println("21を超えたのであなたの勝ち");
        } else if (my_hand>=21 || com_hand>=21) {
            System.out.println("あなた"+my_hand);
            System.out.println("com"+com_hand);
            System.out.println("お互いに21を超えたので引き分け");

        }
    }
}
