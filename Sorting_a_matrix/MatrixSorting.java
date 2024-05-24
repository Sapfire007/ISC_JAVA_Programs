import java.util.*;
class MatrixSorting
{
 public static void main(String[] args)
 {
// Create a 4x4 matrix
 int[][] matrix = new int[4][4];
 // Accept numbers from the user
 Scanner in = new Scanner(System.in);
 System.out.println("Enter numbers for the matrix:");
 for (int i = 0; i < 4; i++)
 {
 for (int j = 0; j < 4; j++)
 {
 matrix[i][j] = in.nextInt();
 }
 }
 // Display the original matrix
 System.out.println("Original matrix:");
 for (int i = 0; i < 4; i++)
 {
 for (int j = 0; j < 4; j++)
 {
 System.out.print(matrix[i][j] + " ");
 }
 System.out.println();
 }
 // Sort each row in ascending order
 for (int i = 0; i < 4; i++)
 {
 Arrays.sort(matrix[i]);
 }
 // Display the sorted matrix
 System.out.println("Matrix sorted in ascending order of each row :");
 for (int i = 0; i < 4; i++)
 {
 for (int j = 0; j < 4; j++)
 {
 System.out.print(matrix[i][j] + " ");
 }
 System.out.println();
 }
 }
}