
/**
 * CurrentTime
 */
public class CurrentTime {

    public static void main(final String[] args) {
        final long millis = System.currentTimeMillis();// the milliseconds from the beginning(7,265,000)
        long hours = millis / 3600000;// number of hours since (2)
        hours %= 24;
        long remainingmillis = millis % 3600000; // int (65,000)
        final long minutes = remainingmillis / 60000;// (1)
        remainingmillis %= 60000;// (5000)
        final long seconds = remainingmillis / 1000;// (5)
        System.out.println(hours+":"+minutes+":"+seconds);
        hours-=8;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}