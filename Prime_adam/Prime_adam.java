package com.company;
import java.util.*;
public class Prime_adam
{
    public static int reverse(int a)
    {
        int rev = 0;
        int d = 0;
        while (a!=0)
        {
            d = a%10;
            a = a/10;
            rev = rev*10+d;
        }
        return rev;
    }
    public static boolean prime(int b)
    {
        int count = 0;
        for(int i = 1; i <= b; i++)
        {
            if (b%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a Prime-Adam number or not.");
        int num = in.nextInt();
        int rev_num = reverse(num);
        System.out.println("Reverse of the entered number is : "+rev_num);
        System.out.println("Square of the entered number is : "+Math.pow(num, 2));
        System.out.println("Square of the reverse of entered number is : "+Math.pow(rev_num, 2));
        if (prime(num) && prime(rev_num))
        {
            if((num*num)==(reverse(rev_num*rev_num)))
            {
                System.out.println("Entered number is a Prime-Adam number.");
            }
        }
        else
        {
            System.out.println("Entered number is not a Prime-Adam number.");
        }
    }
}
