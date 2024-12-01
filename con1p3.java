import java.util.Scanner;

    class con1p3 {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);

            int N = in.nextInt();

            for(int i = 2; i <= N; i++){
                System.out.print(i+" ");
            }

        }
    }
