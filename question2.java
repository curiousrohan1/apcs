/**
 * question2
 */
public class question2 {

    public static void main(final String[] args) {
        final String string = "I go to google web-site to search for a ticket for that we can go to a movie together.";
        final String str = string;
        final String string2 = "go";
        final int instOne = str.indexOf(string2);
        final int instTwo = str.indexOf(string2, instOne + 1);
        final int instThree = str.lastIndexOf(string2);
        final String string3 = "\n";
        System.out.println(instOne+string3+instTwo+string3+instThree);
    }
}