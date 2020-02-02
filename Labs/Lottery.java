/**
 * Lottery
 */
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final Random random = new Random(System.currentTimeMillis());
        int score = 0;
        final int numQuestions = input.nextInt();
        for (int i = 0; i < numQuestions; i++) {
            score = numberAlg(input, random, score);
        }
        final int percent = score * 100 / numQuestions;
        System.out.println("You got " + percent + "%!");
    }

    private static int numberAlg(final Scanner input, final Random random, int score) {
        int answer;
        char dig;
        answer = input.nextInt();
        String strdig = "";
        for (int i = 0; i < 4; i++) {
            dig = (char) (random.nextInt(10) + '0');
            strdig += dig;
        }
        final int intdig = Integer.parseInt(strdig);
        if (intdig == answer) {
            System.out.println("You got it correct!");
            score++;
        } else {
            System.out.println("Sorry. you got it wrong");
        }

        return score;
    }
}
