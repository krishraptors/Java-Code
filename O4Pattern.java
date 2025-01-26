import java.util.*;

public class O4Pattern {
  public static void main(String args[]) {
    int n = 5;

    // Outer loop
    for (int i = n; i >= 1; i--) {
      // Inner loop
      for (int j = 1; j <= i; j++) {
        System.out.print("*");

      }
      System.out.println();
    }
  }
}