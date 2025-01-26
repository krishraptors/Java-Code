import java.util.*;

public class O5Pattern {
    public static void main(String args[]) {
        int n = 5;

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop-> space print
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Inner loop -> star print
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
