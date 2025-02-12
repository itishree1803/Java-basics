import java.util.Scanner;

public class ExpressionEvaluator
{
    public static void main(String[] args)
    {
//        //Expression 1 : (x - y) / 2
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of x : ");
        double x = sc.nextDouble();

        System.out.print("Enter the value of y : ");
        double y = sc.nextDouble();

        double result1 = (x-y)/2;
        System.out.print("Result of (x-y)/2 = \n" + result1 );

        System.out.println("\n-----------------\n");

//        //Expression 2 : v^2 - u^2
        System.out.print("Enter the value of v : ");
        double v = sc.nextDouble();

        System.out.print("Enter the value of u : ");
        double u = sc.nextDouble();

        double result2 = (v*v) - (u*u);

        System.out.print("Result of v^2 - u^2 = " + result2);

        System.out.println("\n-----------------\n");

        //Expression 3 : a * b - d
        System.out.print("Enter the value of a : ");
        double a = sc.nextDouble();

        System.out.print("Enter the value of b : ");
        double b = sc.nextDouble();

        System.out.print("Enter the value of d : ");
        double d = sc.nextDouble();

        double result3 = a * b - d ;
        System.out.println("Result of a * b - d = " + result3);
    }
}