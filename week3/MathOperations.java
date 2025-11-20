package week3;
import java.util.Scanner;


/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main (String[]arg)
    {
        Scanner hi= new Scanner (System.in);
        
        System.out.println("Enter first num");
        int FNum=hi.nextInt();
        
        System.out.println("Enter second num");
        int SNum=hi.nextInt();
        
        System.out.println("Add is:" + "\n"+(FNum+SNum));
        System.out.println("Subtract is:" +"\n"+ (FNum-SNum));
        System.out.println("Multiply is:" +"\n"+ (FNum*SNum));
        System.out.println("Divide is:" + "\n"+(float)(FNum/SNum));
    }
}