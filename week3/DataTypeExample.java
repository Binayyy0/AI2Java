package week3;

/**
 * Write a description of class DataTypeExample here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DataTypeExample
{
    public static void main (String[]arg)
    {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);
        
        byte b=12;
        byte d=13;
        byte e=(byte)(b+d);
        
        float f=233.3f;
        
        long l=200l;
        
        int a=20;
        float g=2.33f;
        double h=2.334;
        
        int x=(int)(a+g+h);
        System.out.println(x);
        
        int c='c';
        System.out.println((int)c);
        
        int length=10;
        int breadth=20;
        
        System.out.println("Area is " + (length*breadth));
        System.out.println ("Perimeter is" + (2*(length+breadth)));
        
        int principle=500;
        int time=2;
        float rate=2.4f;
        
        System.out.println ("SI is" + ((principle*time*rate)/100));
        System.out.println ("CI is" + principle*((1+rate)*Math.pow(time)));
    }
}