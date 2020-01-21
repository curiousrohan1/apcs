/**
 * Darts
 */
import java.util.Random;

public class Darts {
    public static void main(final String[] args) {
        final Random iRandom = new Random(System.currentTimeMillis());
        System.out.println("Darts Results:\n===============================================");
        int scorei = 0;
        int darts = 3;
        for (int i = 0; i < darts; i++) {
            int x = iRandom.nextInt(80) - 40;
            int y = iRandom.nextInt(80) - 40;
            double pyTheor = Math.sqrt(x * x + y * y);
            int score = 0;
            if (pyTheor < 11) {
                score += 3;
            } else if (pyTheor < 21) {
                score += 2;
            } else if (pyTheor < 31) {
                score += 1;
            }
            scorei += score;
            System.out.println("Throw[" + i + "](" + x + ", " + y + "):\n  Distance:" + pyTheor
                    + "  Score: " + score);
        }
        System.out.println("Final score: " + scorei);
        double avg = (double) scorei / darts;
        System.out.println("Avg score: " + avg);
    }
}
