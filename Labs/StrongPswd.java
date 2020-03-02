
/**
 * StrongPswd
 */
import java.util.Scanner;

public class StrongPswd {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println(" Enter your password to see if it is safe. ");
        final String password = input.nextLine();
        input.close();
        if (password.length() < 8) {
            System.out.println("Sorry, that's not a good password.");
        } else if (password.equalsIgnoreCase(password)) {
            System.out.println("Sorry, that's not a good password.");
        } else if (password.indexOf('!') == -1 || password.indexOf('@') == -1 || password.indexOf('#') == -1
                || password.indexOf('$') == -1 || password.indexOf('%') == -1 || password.indexOf('^') == -1
                || password.indexOf('&') == -1 || password.indexOf('*') == -1 || password.indexOf('(') == -1
                || password.indexOf(')') == -1 || password.indexOf('-') == -1 || password.indexOf('+') == -1
                || password.indexOf('`') == -1 || password.indexOf('~') == -1 || password.indexOf('_') == -1
                || password.indexOf('=') == -1 || password.indexOf('{') == -1 || password.indexOf('}') == -1
                || password.indexOf('[') == -1 || password.indexOf(']') == -1 || password.indexOf(';') == -1
                || password.indexOf(':') == -1 || password.indexOf('\'') == -1 || password.indexOf('\"') == -1
                || password.indexOf('\\') == -1 || password.indexOf('|') == -1 || password.indexOf('<') == -1
                || password.indexOf(',') == -1 || password.indexOf('>') == -1 || password.indexOf('.') == -1
                || password.indexOf('/') == -1 || password.indexOf('?') == -1) {
            System.out.println("Sorry, that's not a good password.");

        } else if (password.indexOf('1') == -1 || password.indexOf('0') == -1 || password.indexOf('2') == -1
                || password.indexOf('3') == -1 || password.indexOf('4') == -1 || password.indexOf('5') == -1
                || password.indexOf('6') == -1 || password.indexOf('7') == -1 || password.indexOf('8') == -1
                || password.indexOf('9') == -1) {

        } else {
            System.out.println("Congratulations! You have a good password!");
        }
    }
}
