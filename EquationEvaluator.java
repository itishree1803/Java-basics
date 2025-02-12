import java.util.Scanner;

public class EquationEvaluator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the initial velocity (u) : ");
        double u = sc.nextDouble();

        System.out.print("Enter the final velocity (v) : ");
        double v = sc.nextDouble();

        System.out.print("Enter acceleration (a) : ");
        double a = sc.nextDouble();

        System.out.print("Enter displacement (s) : ");
        double s = sc.nextDouble();

        double result = ((v*v) - (u*u)) / (2*a*s);
        System.out.println("The result of (v^2-u^2)/2as is = \n" + result);

        System.out.println("\n-------------------\n");
    }
}
