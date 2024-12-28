import java.util.Scanner;

public class con4p4 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];

        // Input the array elements
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int mid = n/2;

        int leftSum = 0;
        for(int i = 0; i < mid; i++){
            leftSum = arr[i] + leftSum;
        }
        int rightSum = 0;
        for(int i = mid; i < n; i++){
            rightSum = arr[i] + rightSum;
        }
        int res = leftSum * rightSum;

        System.out.println(res);
    }
}
