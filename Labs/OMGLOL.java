package Labs;

/**
 * OMGLOL
 */
public class OMGLOL {
    public static void main(final String[] args) {
        final String original = "Oh my god my life isave no friends. I will always abhor you, in case you didn't know. By the way, you have some guests in the living room talking about how it is better safe than sorry to have a bodyguard in the alleys. Did you or did you not sign up for that summer job?";
        System.out.println("Original: " + original);
        final String firstVar = original.replace("Oh my god", "OMG");
        System.out.println("First Variation: " + firstVar);
        final String secVar = firstVar.replace("in case you didn't know", "INCYDK");
        System.out.println("Second Variation: " + secVar);
        final String thirdVar = secVar.replace("By the way", "BTW");
        System.out.println("Third Variation: " + thirdVar);
        final String fourthVar = thirdVar.replace("about", "ABT");
        System.out.println("Fourth Variation: " + fourthVar);
        final String finVar = fourthVar.replace("better safe than sorry", "BSTS");
        System.out.println("Final Variation: "+finVar);

    }
}