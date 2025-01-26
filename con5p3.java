
public class con5p3 {


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            int [] arr = {1,2,3,4,4,4,5};
            int x = 5; // target
            Solution(arr,x);

        }
        public static void Solution(int[] arr,int x){
            int count = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[i]==x){
                    count++;
                }
            }
            System.out.print(count);
        }
    }
