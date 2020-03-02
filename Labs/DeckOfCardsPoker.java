
/**
 * DeckOfCardsPoker
 */
import java.util.Random;

public class DeckOfCardsPoker {
    public static void main(final String[] args) {
        strInitializer();
    }

    private static void strInitializer() {
        final Random rand = new Random(System.currentTimeMillis());
        final String[] suits = new String[] { "Spades", "Clubs", "Diamonds", "Hearts" };
        final String[] nums = new String[] { "Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine",
                "Ten", "Jack", "Queen", "King" };
        final String[][] cards = new String[4][13];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                cards[i][j] = nums[j] + " of " + suits[i];
            }
        }
        System.out.println(cards[rand.nextInt(4)][rand.nextInt(13)]);
        System.out.println(cards[rand.nextInt(4)][rand.nextInt(13)]);
        System.out.println(cards[rand.nextInt(4)][rand.nextInt(13)]);
        System.out.println(cards[rand.nextInt(4)][rand.nextInt(13)]);
        System.out.println(cards[rand.nextInt(4)][rand.nextInt(13)]);
    }
}