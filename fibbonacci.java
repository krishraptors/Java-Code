import java.util.*;

public class fibbonacci {
    public static void main(String args[]) {
        int n1 = 1, n2 = 2, n3, i, count = 10;
        System.out.print(n1 + " " + n2);
        for (i = 1; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}