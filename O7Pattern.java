import java.util.*;

public class O7Pattern {
    public static void main(String args[]) {
        int n = 5;
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}