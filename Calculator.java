/**
 * Calculator
 */
public class Calculator {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Wrong number of args!");;
        }
        int addendi = Integer.parseInt(args[0]);
        int addendii = Integer.parseInt(args[2]);
        if (args[1].equals("+")) {
            int sum = addendi + addendii;
            System.out.println(sum);
        } else if (args[1].equals("-")) {
            int diff = addendi - addendii;
            System.out.println(diff);
        } else if (args[1].equals("*")) {
            int product = addendi * addendii;
            System.out.println(product);
        } else if (args[1].equals("/")) {
            int fract = addendi / addendii;
            System.out.println(fract);
        } else {
            System.out.println(
                    "Calculator.main() failed because you did not enter an operator. This is your fault. I hope this message is never seen.");
        }
        System.out.println(args[0]);
    }
}
