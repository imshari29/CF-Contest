import java.util.Scanner;
public class con4p1 { // EVEN ARRAY

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            // Input the size of the array
            System.out.print("Enter the size of Array : ");
            int n = in.nextInt();
            int[] arr = new int[n];

            // Input the array elements
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }

            int sum = 0;

            // Calculate the sum of even elements
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
            }

            // Print the result
            System.out.println(sum);
        }
}
