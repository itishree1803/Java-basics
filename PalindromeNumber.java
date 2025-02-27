import java.util.Scanner;

public class PalindromeNumber 
{
    public static void main(String[] args) 
   {
        Scanner scanner = new Scanner(System.in);
     
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();

        int originalNum = num;
        int reversedNum = 0;

        do {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        } while (num > 0);

        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}
