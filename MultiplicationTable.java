import java.util.Scanner;

public class MultiplicationTable 
{
    public static void main(String[] arguments) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number to get its multiplication table : ");
       long number = sc.nextLong();
       
       System.out.println("Here is the multiplication table of " + number + " : ");
       for (long i = 1; i <= 10; i++) 
       {
           System.out.println(number + " x " + i + " = " + (number * i));
       }
    }
}
