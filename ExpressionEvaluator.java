import java.util.Scanner;

public class ExpressionEvaluator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter value of x : ");
        double x = sc.nextDouble();

        System.out.print("Enter value of y : ");
        double y = sc.nextDouble();

        double result1 = (x-y)/2;
        System.out.println("Result of (x-y)/2 = " + result1);
    }
}