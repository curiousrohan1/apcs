import java.util.Scanner;
public class StudentGPA {

    public static void main(final String[] args) {
        final Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        final String name = input.nextLine();
        System.out.println("Please enter your social security number");
        final String ssn = input.nextLine();
        System.out.println("Please enter your address");
        final String address = input.nextLine();
        System.out.println("Please enter your date of birth");
        final String dobString = input.nextLine();
        System.out.println("Please enter your Math grade");
        final double mathGrade = input.nextDouble();
        System.out.println("Please enter your History grade");
        final double histGrade = input.nextDouble();
        System.out.println("Please enter your Physics grade");
        final double physGrade = input.nextDouble();
        System.out.println("Please enter your PE grade");
        final double peGrade = input.nextDouble();
        System.out.println("Please enter your Chemistry grade");
        final double chemGrade = input.nextDouble();
        System.out.println("Please enter your English grade");
        final double englGrade = input.nextDouble();
        final double studentGPA = (mathGrade + histGrade + physGrade + peGrade + chemGrade + englGrade) / 6.0;
        System.out.println("\n\n\n\n\nTheodreoreore Private Prepatory Middle School Term 1 Report Card\n===========================================================================================");
        System.out.println("Name:"+name+"\nSocial Security Number: "+ssn+"\nAddress: "+address+"\nDOB: "+dobString);
        System.out.println("Math: "+mathGrade+"\nHistory: "+histGrade+"\nPhysics: "+physGrade+"\nPE:"+peGrade+"\nChemistry: "+chemGrade+"\nEnglish: "+englGrade+"\nGPA:"+studentGPA);
    }
}