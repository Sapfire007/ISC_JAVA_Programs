package com.company;
import java.util.Scanner;
public class Automorphic_number
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
//reading a number from the user
        int num = in.nextInt();
        int count=0;
//determines the square of the given number
        int square = num*num;
//copying the variable num into temp
        int temp = num;
//iterate over the variable num until the condition become false
        while(temp>0)
        {
            count++;
//removes last digit of the variable num
            temp=temp/10;
        }
//determines the last digit of the variable square
        int lastDigit = (int) (square%(Math.pow(10, count)));
//compare num with last digit of the variable square
        if(num == lastDigit)
            System.out.println(num+ " is an automorphic number.");
        else
            System.out.println(num+ " is not an automorphic number.");
    }
}