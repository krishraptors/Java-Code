import java.util.*; //Floyd's Triangle

public class O8Pattern {
    public static void main(String args[]) {
        int n = 5;
        int number = 1;
        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // number = number+1
            }
            System.out.println();
        }
    }
}
