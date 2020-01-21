/**
 * SSN
 */
import java.util.Scanner;

public class SSN {
    public static void main(final String[] args) {

        final Scanner input = new Scanner(System.in);
        System.out.println("Enter your social security number.");// 123-45-6789;
        final String SSN = input.nextLine();
        System.out.println(SSN.substring(0, 3) + SSN.substring(4, 6) + SSN.substring(7));
        for (int i = 0; i < 3; i++) {
            System.out.println("SSN[" + i + "]:" + SSN.charAt(i));
        }
        for (int j = 4; j < 6; j++) {
            System.out.println("SSN[" + j + "]:" + SSN.charAt(j));
        }
        for (int k = 7; k < 11; k++) {
            System.out.println("SSN[" + k + "]:" + SSN.charAt(k));
        }

    }
}
