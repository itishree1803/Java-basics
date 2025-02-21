public class NaturalNumberSum {
    public static void main(String[] args) 
    {
        int sum = 0, i = 1;

        do {
            sum += i;
            i++;
        } while (i <= 100);

        System.out.println("The sum of the first 100 natural numbers is : " + sum);
    }
}
