public class con2p2 {
    public static void main(String[] args) {
       int n = 3;
       // for upper
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        // for lower
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*n) - (2 * i - 1); j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

    }
}
