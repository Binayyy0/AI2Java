import java.util.Scanner;

/**
 * Write a description of class workshop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorkShop
{
    public static void main (String[]arg)
    {
        System.out.println ("My Name is:");
        System.out.println ("Binay Man Maharjan");
        
        String name;
        name= "Binay";
        System.out.println (name);
        
       Scanner hi = new Scanner (System.in);
       System.out.println("Enter your name");
       String Name=hi.next();
       
       System.out.println("Enter your Age");
       int Age = hi.nextInt();
       
       System.out.println("enter your gpa");
       float Gpa = hi.nextFloat();
       
       System.out.println("Name is:" + Name);
       System.out.println("Age is : " + Age);
       System.out.println("GPA is : " + Gpa);
    }
    }
