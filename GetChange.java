/**
 * GetChange
 */
import java.util.Scanner;
public class GetChange {
    public static void main(final String[] args) {
        // Get the cost from the user
        // Then calculate the change
        // Then figure out the breakdown of dollars, quarters, etc. for the change.
        final Scanner input = new Scanner(System.in);
        final int cost = (int) (100 * input.nextDouble()); // e.g. 5414
        final int amtpaid = 10000;
        final int difference = amtpaid - cost; // e.g. 4586
        final int dollars = difference / 100;// e.g. 45
        int remain = difference % 100;// 86
        System.out.println(remain);
        final int quarters = remain / 25;// 3
        remain %= 25;// 11
        final int dimes = remain / 10;// 1
        remain %= 10;// 1
        final int nickels = remain / 5;// 0
        final int pennies = remain % 5;// 1
        System.out.println(difference+"\n"+dollars+" dollars\n"+ quarters+" quarters\n"+dimes+" dimes\n"+nickels+" nickels\n"+pennies+" pennies");
    }    
}