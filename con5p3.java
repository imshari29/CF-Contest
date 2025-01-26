
public class con5p3 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 4, 5};
        int x = 4;

        // Perform binary search for last occurrence
        int result = binarySearchLastOccurrence(arr, x);

        // Output the result
        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Last occurrence of element is at index: " + result);
        }
    }

    // Binary Search for Last Occurrence function
    public static int binarySearchLastOccurrence(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // Store the index of the last occurrence

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == x) {
                result = mid; // Found an occurrence, but continue to search on the right
                // remove is first occurrence
                // use for last occurrences
                left = mid + 1; // Move the left pointer to the right to search for more occurrences
            } else if (arr[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}
