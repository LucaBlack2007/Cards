import java.util.List;
import java.util.Random;
// rand between 0 and bound-1


public class Main {
    public static Card generateRandomCard() {
        Random rand = new Random();
        int r = rand.nextInt(13) + 2;

        Suit suit;
        Random randSuit = new Random();
        int s = randSuit.nextInt(4);
        switch (s) {
            case 0: suit = Suit.CLUB; break;
            case 1: suit = Suit.DIAMOND; break;
            case 2: suit = Suit.HEART; break;
            case 3: suit = Suit.SPADE; break;
            default: suit = null; break;
        }

        return new Card(r, suit);
    }

    public static void findHand(List<Card> cards) {

    }


    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Card card = generateRandomCard();
            System.out.println(card.print());
        }
    }
}