import java.util.Scanner;

/**
 * Write a description of class A here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class A
{
        public static void main(String[]arg)
        {
            Scanner hi = new Scanner(System.in);
            
            System.out.println("Enter meds");
            String meds=hi.next();
            System.out.println("Enter Quantity");
            int quantity=hi.nextInt();

            String med1="rhinex";
            int qmed1=200;
            float price1=20;

            String med2="syrup";
            int qmed2=100;
            float price2=30;
            
            String med3="glucose";
            int qmed3=100;
            float price3=20;
            
            float price = (meds==med1)? price1*quantity : (meds==med2) ? price2*quantity: price3*quantity;
            
            System.out.println(" Total price =" + price );
            
        }
}
