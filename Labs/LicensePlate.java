/**
 * licensePlate
 */

import java.util.Random;

public class LicensePlate {
    public static void main(final String[] args) {
        final Random input = new Random(System.currentTimeMillis());
        final String digOne = "7";// first digit has to be 7
        for (int i = 0; i < 20; i++) {// doing the letters
            String licensePlate = digOne;// to start out
            for (int j = 0; j < 3; j++) {
                while (true) {// forever until broken
                    char dig = (char) (input.nextInt(26) + 'A');// getting a random letter
                    if (licensePlate.indexOf(dig) == -1) {
                        licensePlate += dig;// adding the letter
                        break;
                    }
                }
            }
            for (int k = 0; k < 3; k++) {// doing the numbers
                while (true) {// forever
                    char digInt = (char) (input.nextInt(10) + '0');// getting a random number
                    if (licensePlate.indexOf(digInt) == -1) {
                        licensePlate += digInt;// adding the number
                        break;
                    }
                }
            }
            System.out.println(licensePlate);// finalized product, a work of pure genius on the
                                             // engineer's part! :)
        }
    }
}
