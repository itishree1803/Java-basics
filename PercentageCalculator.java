import java.util.Scanner;

public class PercentageCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the results of all the subjects in the CBSE Board");

        System.out.println("Enter the marks secured in the first subject :");
        float a = sc.nextFloat();

        System.out.println("Enter the marks secured in the second subject :");
        float b = sc.nextFloat();

        System.out.println("Enter the marks secured in the third subject :");
        float c = sc.nextFloat();

        System.out.println("Enter the marks secured in the fourth subject :");
        float d = sc.nextFloat();

        System.out.println("Enter the marks secured in the fifth subject :");
        float e = sc.nextFloat();

        float result = ((a + b + c + d + e)/500)*100;

        System.out.println("The secured percentage is :");
        System.out.println(result);

    }
}
