/**
 * Lottery
 */
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final Random random = new Random(System.currentTimeMillis());
        int answer;
        char one;
        char two;
        char three;
        char four;
        for (int i = 0; i < 3; i++) {
            System.out.println(
                    "I am thinking of a four-digit number. It can contain 0 in it. Guess it.");
            answer = input.nextInt();
            one = (char) (random.nextInt(10) + '0');
            two = (char) (random.nextInt(10) + '0');
            three = (char) (random.nextInt(10) + '0');
            four = (char) (random.nextInt(10) + '0');
            String strdig = "";
            strdig += one;
            strdig += two;
            strdig += three;
            strdig += four;
            final int intdig = Integer.parseInt(strdig);
            if (intdig == answer) {
                System.out.println("You got it correct!");
            } else {
                System.out
                        .println("Sorry. you got it wrong. The correct answer was " + intdig + ".");
            }
        }
    }
}
