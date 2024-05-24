import java.util.*;
class MatrixAddition
{
 public static void main(String[] args)
 {
 int[][] matrix1 = new int[3][3]; // First matrix
 int[][] matrix2 = new int[3][3]; // Second matrix
 Scanner in = new Scanner(System.in);
 // Taking input for matrix1
 System.out.println("Enter elements for Matrix 1:");
 for (int i = 0; i < 3; i++)
 {
 for (int j = 0; j < 3; j++)
 {
 matrix1[i][j] = in.nextInt();
 }
 }
 // Taking input for matrix2
 System.out.println("Enter elements for Matrix 2:");
 for (int i = 0; i < 3; i++)
 {
 for (int j = 0; j < 3; j++)
 {
 matrix2[i][j] = in.nextInt();
 }
 }
 int[][] result = new int[3][3]; // Resultant matrix
 // Adding the matrices
 for (int i = 0; i < 3; i++)
 {
 for (int j = 0; j < 3; j++)
 {
 result[i][j] = matrix1[i][j] + matrix2[i][j];
 }
 }
 // Displaying the result
 System.out.println("Sum of the matrices:");
 for (int i = 0; i < 3; i++)
 {
 for (int j = 0; j < 3; j++)
 {
 System.out.print(result[i][j] + " ");
 }
 System.out.println();
 }
 }
}