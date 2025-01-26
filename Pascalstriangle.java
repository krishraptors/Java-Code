import java.util.Scanner;

public class Pascalstriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int numRows = scanner.nextInt();

        if (numRows <= 0) {
            System.out.println("Number of rows should be a positive integer.");
        } else {
            int[][] triangle = generatePascalsTriangle(numRows);
            printPascalsTriangle(triangle);
        }

        scanner.close();
    }

    // Method to generate Pascal's Triangle
    public static int[][] generatePascalsTriangle(int numRows) {
        int[][] triangle = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            triangle[i] = new int[i + 1]; // Number of columns in row i is i + 1

            triangle[i][0] = 1; // First element of each row is 1
            triangle[i][i] = 1; // Last element of each row is 1

            for (int j = 1; j < i; j++) {
                // Each element is the sum of the two elements above it
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        return triangle;
    }

    // Method to print Pascal's Triangle
    public static void printPascalsTriangle(int[][] triangle) {
        int numRows = triangle.length;

        for (int i = 0; i < numRows; i++) {
            // Print leading spaces for formatting
            for (int j = numRows - i; j > 1; j--) {
                System.out.print(" ");
            }

            // Print elements of the current row
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j] + " ");
            }

            System.out.println();
        }
    }
}