import java.util.Scanner;

public class AgeGrouping
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        
        if (age <= 12) {
            System.out.println("You are a child! Go and play! :|");
        }
        else if (age >= 13 && age <= 19) {
            System.out.println("You are a teenager! Don't be rude to others. Have fun! ;)");
        }
        else if(age >= 20 && age <60 ) {
            System.out.println("You are an adult! Try not to be stressed! :)");
        }
         else {
             System.out.println("You are a sinior citizen! Enjoy! :)");
         }
        sc.close();
    }
}
