import java.util.Scanner;
public class con1p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the value of N
        int N = scanner.nextInt();

        int sum = 0;

        // Calculate the sum of first N natural numbers using a for loop
        for (int i = 1; i <= N; i++) {
            sum += i;
        }

        // Print the result
        System.out.println(sum);
    }
}
