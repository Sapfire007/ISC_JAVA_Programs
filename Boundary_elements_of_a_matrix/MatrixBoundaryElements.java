import java.util.*;
class MatrixBoundaryElements
{
 public static void main(String[] args)
 {
 Scanner scanner = new Scanner(System.in);
 // Read the number of rows and columns from the user
 System.out.print("Enter the number of rows: ");
 int rows = scanner.nextInt();
 System.out.print("Enter the number of columns: ");
 int columns = scanner.nextInt();
 // Create the matrix
 int[][] matrix = new int[rows][columns];
 // Read matrix elements from the user
 System.out.println("Enter the matrix elements:");
 for (int i = 0; i < rows; i++)
 {
 for (int j = 0; j < columns; j++)
 {
 matrix[i][j] = scanner.nextInt();
 }
 }
 // Print the boundary elements of the matrix
 System.out.println("Boundary elements of the matrix:");
 for (int i = 0; i < rows; i++)
 {
 for (int j = 0; j < columns; j++)
 {
 if (i == 0 || i == rows - 1 || j == 0 || j == columns - 1)
 {
 System.out.print(matrix[i][j] + " ");
 } else {
 System.out.print(" ");
 }
 }
 System.out.println();
 }
 }
}