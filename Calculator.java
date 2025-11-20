import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main (String[]arg)
    {
    Scanner oi = new Scanner (System.in);
    
    System.out.println("Enter First Number");
    int FNumber = oi.nextInt();
    System.out.println("Enter second number");
    int SNumber = oi.nextInt();
    
    int Great= (FNumber>SNumber)?FNumber:SNumber;
    System.out.println("Greater is :" + Great  );
    System.out.println("Sum is :" + (FNumber+SNumber) );
    System.out.println("Sum is :" + (FNumber-SNumber) );
    System.out.println("Multiply is :" + FNumber*SNumber );
    System.out.println("Divide is :" + FNumber/SNumber );
    System.out.println("Modulus is :" + FNumber%SNumber );
    }
}