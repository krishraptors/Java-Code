import java.util.*; //0-1 Triangle

public class O9Pattern {
    public static void main(String args[]) {
        int n = 5;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) { // even value
                    System.out.print("1 ");
                } else { // odd value
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}