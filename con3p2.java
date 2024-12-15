import java.util.Scanner;

public class con3p2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int prime = 0;
        // Loop through all numbers from 2 to n
        for (int num = 2; num <= n; num++) {
            boolean isPrime = true;

            // Check divisors from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false; // num is not a prime number
                    break;
                }
            }
            if (isPrime) {
                prime++;
            }
        }
        System.out.println(prime);
    }
}
