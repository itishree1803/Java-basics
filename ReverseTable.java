import java.util.Scanner;

public class ReverseTable 
{
    public static void main(String[] arguments) 
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number to get its Reverse Multiplication Table : ");
       long number = sc.nextLong();
       
       System.out.println("Here is the reverse multiplication table of " + number + " : ");
       for (long i = 10; i >= 1; i--) 
       {
           System.out.println(number + " x " + i + " = " + (number * i));
       }
    }
}
