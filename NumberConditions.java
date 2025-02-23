import java.util.Scanner;
public class NumberConditions 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = sc.nextInt();
    
        if (number % 3 == 0) {
            System.out.println("The number is divisible by 3.");
        } 
        else {
            System.out.println("The number is not divisible by 3.");
        }
     sc.close();
    }
}
