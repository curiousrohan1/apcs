/**
 * question1
 */
public class question1 {
    public static void main(String[] args) {
        int x = 5;
        int y = 3;
        // Use a temp variable to store one of the values
        // so that it's not lost during the swap.
        int temp = x;//5
        x=y;//3
        y=temp;

        // Print the final values.
        System.out.printf("%-5%n",x);
        System.out.printf("%-5%n",y);


    }    
}