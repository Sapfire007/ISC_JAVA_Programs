import java.util.*;
class addDiagonals
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the dimension of your square matrix : ");
        int m = in.nextInt();
        int arr[][] = new int[m][m];
        System.out.println();
        System.out.println("Enter the elements of your square matrix : ");
        for(int i = 0; i < m; i++)
        {
           for(int j = 0; j < m; j++)
           { 
               arr[i][j] = in.nextInt();
           }
        }
        System.out.println("The entered array is : ");
        for(int i = 0; i < m; i++)
        {
           for(int j = 0; j < m; j++)
           {
               System.out.print(arr[i][j]+"\t");
           }   
           System.out.println();
        }
        System.out.println();
        int sumR = 0;
        int sumL = 0;
        for(int i = 0; i < m; i++)
        {
           for(int j = 0; j < m; j++)
           {
               if (i==j)
               {
                 sumL = sumL+arr[i][j]; 
               }
               else if(i+j == m-1)
               {
                 sumR = sumR+arr[i][j];  
               }
           }
        }
        System.out.println("Sum of the left diagonal elements of the array is = "+sumL);
        System.out.println("Sum of the right diagonal elements of the array is = "+sumR);
        System.out.println("Thus total sum of diagonals = "+(sumL+sumR));
}
}
