/**
 * SubtractionQuiz
 */
import java.util.Scanner;
import java.util.Random;

public class SubtractionQuiz {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        final int a = 1125;
        final Random b = new Random(a);
        final int c = b.nextInt(100);
        final Random d = new Random(a);
        final int e = d.nextInt(100);
        final int diff = e - c;
        System.out.println("What is " + e + " minus " + c + "?");
        final int answer = input.nextInt();
        if(diff==answer){
            System.out.println("Congrats! You got it right!");
        }
        else{
            System.out.println("Sorry, that was incorrect. Try again later!");
        }

    }
}