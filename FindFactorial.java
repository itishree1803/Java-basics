import java.util.Scanner;

public class FindFactorial 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
      
        System.out.print("Enter the number to get its Factorial: ");
        int number = sc.nextInt();
        sc.close();

        int i = 1;
        int factorial = 1;

        while (i <= number) {
            factorial *= i;
            i++;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);
    }
}
