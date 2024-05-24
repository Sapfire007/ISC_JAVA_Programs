import java.util.*;
class MatrixSwap
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // Create a 3x3 matrix
        int[][] matrix = new int[3][3];
        // Accept input for the matrix
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                matrix[i][j] = in.nextInt();
            }
        }
        // Swap the first row with the last row
        for (int j = 0; j < 3; j++)
        {
            int temp = matrix[0][j];
            matrix[0][j] = matrix[2][j];
            matrix[2][j] = temp;
        }
        // Print the modified matrix
        System.out.println("Modified matrix:");
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
