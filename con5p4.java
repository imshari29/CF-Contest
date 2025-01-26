import java.util.*;

public class con5p4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // The value of n
        int[] arr = new int[n - 1]; // Array with n - 1 elements

        // Read the array elements
        for (int i = 0; i < n - 1; i++) {
            arr[i] = in.nextInt();
        }

        // Call the method to find the missing number using binary search
        Solution(arr, n);
    }

    public static void Solution(int[] arr, int n) {
        int low = 0;
        int high = n - 2; // Since arr has n-1 elements

        // Binary search for the missing number
        while (low <= high) {
            int mid = low + (high ) / 2;

            // Check if the mid-element matches the expected value (mid + 1)
            if (arr[mid] == mid + 1) {
                low = mid + 1; // Missing number is on the right half
            } else {
                high = mid - 1; // Missing number is on the left half
            }
        }

        // After the loop ends, 'low' will be at the index where the missing number should be
        System.out.println(low + 1); // Output the missing number
    }
}

