import java.util.*;
class SpiralMatrix
{
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 System.out.println("To see the matrix in Spiral form, enter size of the matrix (n x n)");
 System.out.print("Enter the size of 'n': ");
 int n = in.nextInt();
 int[][] matrix = generateSpiralMatrix(n);
 System.out.println("Spiral Matrix:");
 displayMatrix(matrix);
 }
 // Function to generate a spiral matrix of size n x n
 public static int[][] generateSpiralMatrix(int n)
 {
 int[][] matrix = new int[n][n];
 int num = 1; // Starting value to be inserted
 int rowStart = 0;
 int rowEnd = n - 1;
 int colStart = 0;
 int colEnd = n - 1;
 while (num <= n * n) {
 // Insert values from left to right
 for (int i = colStart; i <= colEnd; i++)
 {
 matrix[rowStart][i] = num++;
 }
 rowStart++;
 // Insert values from top to bottom
 for (int i = rowStart; i <= rowEnd; i++)
 {
 matrix[i][colEnd] = num++;
 }
 colEnd--;
 // Insert values from right to left
 for (int i = colEnd; i >= colStart; i--)
 {
 matrix[rowEnd][i] = num++;
 }
 rowEnd--;
 // Insert values from bottom to top
 for (int i = rowEnd; i >= rowStart; i--)
 {
 matrix[i][colStart] = num++;
 }
 colStart++;
 }
 return matrix;
 }
 // Function to display the matrix
 public static void displayMatrix(int[][] matrix)
 {
 for (int[] row : matrix)
 {
 for (int value : row)
 {
 System.out.printf("%-3d", value);
 }
 System.out.println();
 }
 }
}