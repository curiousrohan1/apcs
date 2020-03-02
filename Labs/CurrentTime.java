/**
 * CurrentTime
 */
public class CurrentTime {
    private static final long MS_IN_YR = 1000L * 60 * 60 * 24 * 365;
    private static final long MS_IN_DAY = MS_IN_YR / 365;
    private static final long MS_IN_MONTH = MS_IN_YR / 12;
    private static final long MS_IN_HR = MS_IN_DAY / 24;
    private static final long MS_IN_MIN = MS_IN_HR / 60;
    private static final int LEAP_YRS = 12;
    private static long millis;

    public static void main(final String[] args) {
        detTime();
    }

    static void detTime() {
        millis = System.currentTimeMillis();
        long years = millis / MS_IN_YR;
        long remainingmillis = millis % MS_IN_YR;
        final int months = (int) (remainingmillis / MS_IN_MONTH);
        remainingmillis %= MS_IN_MONTH;
        int days = (int) (remainingmillis / MS_IN_DAY);
        remainingmillis %= MS_IN_DAY;
        System.out.println(remainingmillis);
        long hours = remainingmillis / MS_IN_HR;// number of hours since (2)
        System.out.println(hours);
        remainingmillis %= MS_IN_HR;
        System.out.println(remainingmillis);
        final long minutes = remainingmillis / MS_IN_MIN;// (1)
        System.out.println(minutes);
        remainingmillis %= MS_IN_MIN;// (5000)
        System.out.println(remainingmillis);
        final long seconds = remainingmillis / 1000;// (5)
        System.out.println(hours + ":" + minutes + ":" + seconds);
        hours -= 8;
        System.out.println(hours + ":" + minutes + ":" + seconds);
        String suffix = "";
        switch (days % 10) {
            case 1: {
                suffix = "st";
                break;
            }
            case 2: {
                suffix = "nd";
                break;
            }
            case 3: {
                suffix = "rd";
                break;
            }
            default: {
                suffix = "th";
                break;
            }
        }
        String montString;
        years += 1970;
        final String[] month = new String[] { "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
        montString = month[months];
        System.out.println("It is the " + days + suffix + " of " + montString + " of " + years);
    }
}