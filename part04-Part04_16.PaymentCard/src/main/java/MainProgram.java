
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        
        PaymentCard pCard = new PaymentCard(20);
        PaymentCard mCard = new PaymentCard(30);
        
        pCard.eatHeartily();
        mCard.eatAffordably();
        System.out.println("Paul: " + pCard);
        System.out.println("Matt: " + mCard);
        pCard.addMoney(20);
        mCard.eatHeartily();
        System.out.println("Paul: " + pCard);
        System.out.println("Matt: " + mCard);
        pCard.eatAffordably();
        pCard.eatAffordably();
        mCard.addMoney(50);
        System.out.println("Paul: " + pCard);
        System.out.println("Matt: " + mCard);
    }
}
