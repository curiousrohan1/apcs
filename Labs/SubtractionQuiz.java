
/**
 * SubtractionQuiz
 */
import java.util.Scanner;

public class SubtractionQuiz {
    public static void main(String[] args) {
        int c = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            int a = (int) (100 * Math.random());
            int b = (int) (100 * Math.random());
            int difference = a - b;
            System.out.print("Please enter the answer to this question: " + a + "-" + b + ". ");
            int answer = input.nextInt();
            input.close();
            if (difference == answer) {
                System.out.println("Congratulations! You have solved number " + i + "!");
                c++;
            } else {
                System.out.println(
                        "Sorry, you answered number " + i + " wrong. The correct answer is " + difference + ".");
            }
        }
        double score = (double) c / 3.0;
        System.out.println("Congratulations! You got a " + c + " out of 3, also known as " + score);

    }
}