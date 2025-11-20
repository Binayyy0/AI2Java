import java.util.Scanner;
/**
 * Write a description of class UserInput here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UserInput
{
  public static void main (String[]arg)
  {
      /*
       * we use scanner to take input from user
       * it is built-in type class
       */
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Firstnumber");
    int firstNumber=sc.nextInt();
    
    System.out.println("enter the  SecondNumber");
    int secondNumber=sc.nextInt();
    
    int sum=firstNumber+secondNumber;
    
    System.out.println("Sum is " + sum);
    
    int bigger=(firstNumber>secondNumber)?firstNumber:secondNumber; // ? is true : for false ,,, conditional operator
    System.out.println("Greatest no is " + bigger );
    

    }
}