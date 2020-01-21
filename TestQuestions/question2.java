/**
 * question2
 */
public class question2 {

    private static void rohan() {
        final String str = "I go to google web-site to search for a ticket for that we can go to a movie together.";
        final String string2 = "go";
        final int instOne = str.indexOf(string2);
        final int instTwo = str.indexOf(string2, instOne + 1);
        final int instThree = str.lastIndexOf(string2);
        final String string3 = "\n";
        System.out.println(instOne+string3+instTwo+string3+instThree);
    }

    private static void baba() {
        final String str = "I go to google web-site to search for a ticket for that we can go to a movie together.";
        int lastIndex = -1;
        for (int i = 0; i < 3; i++) {
            int newIdx = str.indexOf("go", lastIndex+1);
            System.out.println("index #" + i + ": " + newIdx);
            lastIndex = newIdx;
        }
    }
    public static void main(final String[] args) {
        rohan();
        baba();
    }

}