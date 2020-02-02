import java.util.Scanner;

class CalendarYear {
    public static void main(final String[] arg) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Please enter your DOB.");
        final String date = input.nextLine();
        final int yr = Integer.parseInt(date.substring(date.length() - 4));
        final long millis = System.currentTimeMillis();// the milliseconds from the
                                                       // beginning(7,265,000)
        long hours = millis / 3600000;// number of hours since (2)

        hours %= 24;
        long remainingmillis = millis % 3600000; // millis left after all possible hours are taken
                                                 // away
        final long minutes = remainingmillis / 60000;// integer division, so amout of miutes
        remainingmillis %= 60000;// (5000)
        final long seconds = remainingmillis / 1000;// (5)
        String ampm;
        if (hours < 8) {
            hours += 16;
        } else {
            hours -= 8;
        }
        if (hours > 12) {
            hours -= 12;
            ampm = "PM";
        } else {
            ampm = "AM";
        }
        int i;
        if (yr % 4 == 0) {
            System.out.println("You were born on a leapyear!");
        } else {
            System.out.println("You were not born on a leapyear!");
        }
        System.out.printf("It is %02d:%02d:%02d %s currently.%n", hours, minutes, seconds, ampm);
        i = yr % 12;
        switch (i) {
            case 0: {
                System.out.println("You are a donkey!");
                break;
            }
            case 1: {
                System.out.println("You are a rooster!");
                break;
            }
            case 2: {
                System.out.println("You are a dog!");
                break;
            }
            case 3: {
                System.out.println("You are a pig!");
                break;
            }
            case 4: {
                System.out.println("You are a rat!");
                break;
            }
            case 5: {
                System.out.println("You are an ox!");
                break;
            }
            case 6: {
                System.out.println("You are a tiger!");
                break;
            }
            case 7: {
                System.out.println("You are a rabbit!");
                break;
            }
            case 8: {
                System.out.println("You are a dragon!");
                break;
            }
            case 9: {
                System.out.println("You are a snake!");
                break;
            }
            case 10: {
                System.out.println("You are a horse!");
                break;
            }
            default: {
                System.out.println("You are a sheep!");
                break;
            }
        }
    }
}
