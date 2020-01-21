/**
 * SumAvgMaxMin
 */
import java.util.Scanner;

public class SumAvgMaxMin {
    private static final int maxNumbers = 10;

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        int i = 0;
        final int[] numbers = new int[maxNumbers];
        while (i < maxNumbers) {
            System.out.println("Enter number " + i + " : ");
            numbers[i] = input.nextInt();
            input.nextLine();
            System.out.println("Do you want to quit(y/n)?");
            i++;
            if (input.nextLine().equals("y")) {
                break;
            }

        }
        int sum = 0;
        for (int j = 0; j < i; j++) {
            sum += numbers[j];
        }
        final double avg = (double) sum / (double) i;
        int max = Math.max(numbers[0], numbers[1]);
        int min = Math.min(numbers[0], numbers[1]);// 2
        for (int k = 2; k < i; k++) {
            max = Math.max(max, numbers[k]);
            min = Math.min(min, numbers[k]);
        }
        System.out.println("Sum: " + sum + "\nAvg: " + avg + "\nMin: " + min + "\nMax: " + max);
    }
}
