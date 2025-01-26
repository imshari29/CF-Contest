import java.util.Scanner;

public class con5p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // Array size
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // Array elements
        }
        int x = in.nextInt(); // Number to find

        // Find the first and last occurrences of x
        findFirstAndLastOccurrence(arr, x);
    }

    public static void findFirstAndLastOccurrence(int[] arr, int x) {
        int first = binarySearch(arr, x, true);
        int last = binarySearch(arr, x, false);

        if (first == -1) {
            System.out.println(-1); // If x is not found, print -1
        } else {
            System.out.println(first); // Print first occurrence
            System.out.println(last); // Print last occurrence
        }
    }

    // Binary search for first or last occurrence
    public static int binarySearch(int[] arr, int x, boolean findFirst) {
        int low = 0, high = arr.length - 1, result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;
                if (findFirst) {
                    high = mid - 1; // Move left to find the first occurrence
                } else {
                    low = mid + 1; // Move right to find the last occurrence
                }
            } else if (arr[mid] < x) {
                low = mid + 1; // Search the right half
            } else {
                high = mid - 1; // Search the left half
            }
        }

        return result;
    }
}
