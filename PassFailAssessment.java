import java.util.Scanner;

class PassFailAssessment {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter the secured marks in Physics : ");
        int s1 = sc.nextInt();
        
        System.out.print("Enter the secured marks in Mathematics : ");
        int s2 = sc.nextInt();
        
        
        System.out.print("Enter the secured marks in Chemistry : ");
        int s3 = sc.nextInt();
        
        float avg = (s1 + s2 + s3)/3f;
        System.out.println("Your total percentage is : " + avg);
        
        if (avg >= 40 && s1 >= 33 && s2 >= 33 && s3 >= 33) {
            System.out.println("Congratulations! You\'ve been promoted to the next grade!");
        } else {
            System.out.println("Unfortunately, You haven\'t been promoted to the next grade.");
        }
        
        sc.close();
    }
}
