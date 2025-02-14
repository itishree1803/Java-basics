import java.util.Scanner;

public class EvenOddNumber
{
    public static void main(String[] arguments)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("The number is Even.");
        }
        else {
            System.out.println("The number is Odd.");
        }

        scanner.close();
    }
}