import java.util.*;
class Array_greatest_and_smallest_number
{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of elements in an array: ");
        int min,max;
        int n=scan.nextInt();//get input from user for array length
        int arr[]=new int[n]; //declaring an array of n elements
//for loop takes input from user
        for(int i=0; i<n; i++){
            System.out.print("Enter the element "+(i+1)+": ");
            arr[i]=scan.nextInt();//takes input from user for array
        }
        min=arr[0];//assume first element as smallest value
        max=arr[0];//assume first element as largest value
        for(int i=0; i<n; i++){
            if(min>arr[i])
            {//loop for find minimum elements
                min=arr[i];
            }
            if(max<arr[i])
            {
                max=arr[i];  //loop for find maximum elements
            }
        }
        System.out.print("\nThe smallest value is: "+min);
        System.out.print("\nThe largest value is: "+max);
    }//display result on the result
}



