import java.util.Scanner;

public class EvenNumberSum {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Lower Limit Number : ");
        int lowerLimit = sc.nextInt();
        int startingLimit = lowerLimit;
        System.out.println("Enter the Upper Limit Number : ");
        int upperLimit = sc.nextInt();
        
        int sum = 0;
        
        while (lowerLimit <= upperLimit) {
            if (lowerLimit % 2 == 0) {
                sum += lowerLimit;
            }
            lowerLimit++ ;
        }
        System.out.println("The sum the even numbers from " + startingLimit + " to " + upperLimit + " is : " + sum);
        
        sc.close();
    }
}
