import java.util.ArrayList;
import java.util.Scanner;

//sorted alternatives
//n = 4 ip = 3 4 -4 5 ,
// op = 3 -4 4 5
//n = 7 ip = -1 2 3 -5 6 7 8 ,
// op = 2 -1 3 -5 6 7 8
public class con6p3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total number of Array : ");
        int n = in.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements of Array : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        ArrayList<Integer> ans = sortedAlternatives(arr);

        System.out.print("The new sorted alternatives are : ");

        for (int num : ans){
            System.out.print( num +" ");
        }
    }
    public static ArrayList<Integer> sortedAlternatives(int[] arr){
        ArrayList<Integer> positiveArr = new ArrayList<>();
        ArrayList<Integer> negativeArr = new ArrayList<>();
        for (int k = 0; k < arr.length; k++) {
            if(arr[k]>=0){
                positiveArr.add(arr[k]);
            }else {
                negativeArr.add(arr[k]);
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        int posIndex = 0, negIndex = 0;

        // Alternate inserting positive and negative numbers, starting with a positive number
        while (posIndex < positiveArr.size() && negIndex < negativeArr.size()) {
            result.add(positiveArr.get(posIndex++));  // Add positive number
            result.add(negativeArr.get(negIndex++));  // Add negative number
        }

        // If there are remaining positive numbers, insert them
        while (posIndex < positiveArr.size()) {
            result.add(positiveArr.get(posIndex++));
        }

        // If there are remaining negative numbers, insert them
        while (negIndex < negativeArr.size()) {
            result.add(negativeArr.get(negIndex++));
        }

        return result;
    }
}