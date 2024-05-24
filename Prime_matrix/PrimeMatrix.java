import java.util.*;
class PrimeMatrix
{
 // Function to check if a number is prime
 public static boolean isPrime(int number)
 {
 if (number <= 1)
 {
 return false;
 }
 for (int i = 2; i <= Math.sqrt(number); i++)
 {
 if (number % i == 0) {
 return false;
 }
 }
 return true;
 }
 // Function to fill the matrix with prime numbers
 public static void fillMatrixWithPrimes(int[][] matrix)
 {
 int number = 2; // Starting number to check for primality
 int rows = matrix.length;
 int cols = matrix[0].length;
 for (int i = 0; i < rows; i++)
 {
 for (int j = 0; j < cols; j++)
 {
 while (!isPrime(number))
 {
 number++;
 }
 matrix[i][j] = number;
 number++;
 }
 }
 }
 // Function to print the matrix
 public static void printMatrix(int[][] matrix)
 {
 System.out.println("Matrix filled with Prime numbers: ");
 for (int[] row : matrix)
 {
 System.out.println(Arrays.toString(row));
 }
 }
 // Main method
 public static void main(String[] args)
 {
 int rows = 3;
 int cols = 3;
 int[][] matrix = new int[rows][cols];
 fillMatrixWithPrimes(matrix);
 printMatrix(matrix);
 }
}