import java.util.Scanner;

public class con4p2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        // Find and print indices where arr[i] == i
        for (int i = 0; i < n; i++) {
            if (arr[i] == i) {
                System.out.println(i);
            }
        }
    }
}