import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main (String[]arg)
    {
    Scanner re = new Scanner (System.in);
    int Lev,Leve;
    System.out.println("Enter water level in Litres");
    int WLevel = re.nextInt();
    
    System.out.println("Water level is" + WLevel + "Litres");
    if(WLevel>1000)
    {
    System.out.println("WARNINGGGGG!!!");
    }
    else{
    System.out.println("Normal");
    }
}
}