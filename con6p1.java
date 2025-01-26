import java.util.Scanner;
//bi-tonic array - using two pointer
public class con6p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        if (n == 0) {
            System.out.println("Array is empty");
            return;
        }
        int [] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        int ans = bitonictwopointer(arr);
        System.out.println(ans);
    }
    public static int bitonictwopointer(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i <= j) {
            if(arr[i]<arr[i+1]){
                i++;
            }else if(arr[j]<arr[j-1]) {
                j--;
            }else{
                break;
            }
        }
        return arr[i];
    }
}
