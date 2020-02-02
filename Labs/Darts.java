/**
 * Darts
 */
import java.util.Random;

public class Darts {
    public static void main(final String[] args) {
        final Random iRandom = new Random(System.currentTimeMillis());
        System.out.println("Darts Results:\n===============================================");
        int scorei = 0;
        final int darts = 3;
        for (int i = 0; i < darts; i++) {
            scorei = dartAlg(iRandom, scorei, i);
        }
        System.out.println("Final score: " + scorei);
        final double avg = (double) scorei / darts;
        System.out.println("Avg score: " + avg);
    }

    private static int dartAlg(final Random iRandom, int scorei, final int i) {
        int x = iRandom.nextInt(80) - 40;
        int y = iRandom.nextInt(80) - 40;
        double pyTheor = Math.sqrt(x * x + y * y);
        int score = 0;
        double m = (double) y / (double) x;
        int k = 0;
        while (x > 0) {
            x--;
            y--;
            k++;
        }
        int b = y;
        x += k;
        y += k;
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
        System.out.println("Y=" + m + "x +" + b);
        return scorei;
    }
}
