import java.util.Scanner;

public class con3p1 {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the number : ");
            int n = in.nextInt();
            int sum = 0;
            while(n > 0){
                int d = n % 10;
                sum = sum + d;
                n = n / 10;
            }
            System.out.println(sum);
        }
}
