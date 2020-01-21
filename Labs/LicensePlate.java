/**
 * licensePlate
 */

import java.util.Random;

public class LicensePlate {
    public static void main(final String[] args) {
        final Random input = new Random(System.currentTimeMillis());
        final String digOne = "7";
        for (int i = 0; i < 20; i++) {
            String licensePlate = digOne;
            for (int j = 0; j < 3; j++) {
                while (true) {
                    char dig = (char) (input.nextInt(26) + 'A');
                    if (licensePlate.indexOf(dig) == -1) {
                        licensePlate += dig;
                        break;
                    }
                }
            }
            for (int k = 0; k < 3; k++) {
                while (true) {
                    char digInt = (char) (input.nextInt(10) + '0');
                    if (licensePlate.indexOf(digInt) == -1) {
                        licensePlate += digInt;
                        break;
                    }
                }
            }
            System.out.println(licensePlate);
        }
    }
}
