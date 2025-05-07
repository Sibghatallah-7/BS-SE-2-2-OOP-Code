import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner dd = new Scanner(System.in);

        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = dd.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = dd.nextInt();

        int[][] table_data = new int[rows][cols];

        System.out.println("Please enter the elements for the 2D array.");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter element for row " + (i + 1) + ", column " + (j + 1) + ": ");
                table_data[i][j] = dd.nextInt();
            }
        }

        System.out.println("\nArray elements are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(table_data[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nReverse of the array elements are:");
        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(table_data[i][j] + " ");
            }
            System.out.println();
        }
    }
}
