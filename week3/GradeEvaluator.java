package week3;
import java.util.Scanner;


/**
 * Write a description of class GradeEvaluator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeEvaluator
{
    public static void main (String[]arg)
    {
    Scanner ow= new Scanner(System.in);
    String Pass=null;
    String Fail=null;
    System.out.println("Enter grade");
    float Grade=ow.nextFloat();
    
    String f= (Grade>40)?"Pass":"Fail";
    System.out.println(f);
    

    }
}