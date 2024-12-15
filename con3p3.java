import java.util.Scanner;

public class con3p3 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();

        int lcm = Math.max(n1, n2);// Start from the larger number

        while(true){
            if(lcm % n1 == 0 && lcm % n2 == 0){
                break; //If divisible by both, it's the LCM
            }
            lcm++; // checks the next number
        }
        System.out.println(lcm);
    }
}
}
