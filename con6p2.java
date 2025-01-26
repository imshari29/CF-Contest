import java.util.Scanner;
//transition point 0 0 0 1 1 - ans 3
// cause 3  after 3 zeros one occurs
public class con6p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int ans =transitionPoint(arr);
        System.out.println(ans);
    }
    public static int transitionPoint(int[]arr){
        int i = 0, j = arr.length - 1;
        while (i <= j){
            // If arr[left] == 1, we've found the transition point
            if(arr[i]==1){
                return i;//possible first occurrence of 1
            }else{
                // Increment left
                i++;
            }
            //If arr[right] == 0, decrement right
            if(arr[j]==0){
                j--;
            }

        }
        return -1;
    }
}

