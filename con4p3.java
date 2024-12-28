import java.util.Scanner;

public class con4p3 {   // question :  product is same return 1 else 0
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of Array : ");
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        // Input the array 1 elements
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        // Input the array 2 elements
        System.out.println("Enter the elements of Array : ");
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }
        //getting prod and check
        int prod1 = 1, prod2 = 1;
        for(int i = 0; i < n; i++){
            prod1 = arr1[i]*prod1;
            prod2 = arr2[i]*prod2;
        }
        if(prod1==prod2){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
