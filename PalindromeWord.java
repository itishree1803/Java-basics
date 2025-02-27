import java.util.Scanner;

public class PalindromeWord 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word : ");
        String word = scanner.nextLine();
        scanner.close();

        String reversedWord = "";
        int i = word.length() - 1;

        do {
            reversedWord += word.charAt(i);
            i--;
        } while (i >= 0);

        if (word.equalsIgnoreCase(reversedWord)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
