/**
 * Calculator
 */
import java.util.Scanner;
public class BinaryCalculator {
    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println(
                "Please enter a number in binary(consisting of only ones and zeros). Then, we will translate the number into decimal.");
        final String binary = input.nextLine();// 10
        int  number=0;
        for(int at = binary.length()-1;at>=0;at--){//at=1,1>0, at--//at=0
            int addend=binary.charAt(at)-'0';//0//;`1
            addend*=Math.pow(2, binary.length()-1-at);//0//2
            number+=addend;//0//2
        }        
        System.out.println(number);
    }
}