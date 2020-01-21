/**
 * RepeatAdditionQuiz
 */
import java.util.Scanner;
import java.util.Random;

public class RepeatAdditionQuiz {
    private final static Scanner input = new Scanner(System.in);
    private final static Random iRandom = new Random(System.currentTimeMillis());
    private static int SUM;
    private static int addendI;
    private static int addendII;
    private static int attempts = 0;
    private static int score;

    private static void QUESTIONaLGORITHM() {
        SUM = addendI + addendII;
        final String question = "What is " + addendI + "+" + addendII + "?";
        System.out.println(question);
        int answer = input.nextInt();
        if (SUM == answer) {
            attempts--;
        }
        while (SUM != answer) {
            System.out.println(question);
            answer = input.nextInt();
            attempts++;
        }
        score = (10 - attempts) * 10;
    }

    public static void main(final String[] args) {
        System.out.println(
                "Welcome to addition quiz! choose your difficulty: Easy(0-9),Medium(0-99), and Hard((-500)-500). Please enter in all caps.");
        final String difficulty = input.nextLine();
        if (difficulty.equals("EASY")) {
            for (int i = 0; i < 6; i++) {
                addendI = iRandom.nextInt(9);
                addendII = iRandom.nextInt(9);
                QUESTIONaLGORITHM();
            }
            System.out.println();
        } else if (difficulty.equals("MEDIUM")) {
            for (int i = 0; i < 11; i++) {
                addendI = iRandom.nextInt(99);
                addendII = iRandom.nextInt(99);
                QUESTIONaLGORITHM();
            }
        } else {
            for (int i = 0; i < 11; i++) {
                addendI = iRandom.nextInt(1000) - 500;
                addendII = iRandom.nextInt(1000) - 500;
                QUESTIONaLGORITHM();
            }
        }
        if (score > 100) {
            score = 100;
        }
        System.out.println("Your score is " + score + " percent.");
    }
}
