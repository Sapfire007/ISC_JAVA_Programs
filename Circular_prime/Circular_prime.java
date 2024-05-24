package com.company;
import java.util.*;
public class Circular_prime {
    public static boolean isPrime(int a)
    {
        int count = 0;
        for (int i = 1; i <= a; i++)
        {
            if (a % i == 0)
            {
                count++;
            }
        }
        if (count == 2)
        {
            count = 0;
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean isCircular(int b)
    {
        int r = b;
        String s = Integer.toString(r);
        int len = s.length();
        while (isPrime(b))
        {
            int lastnum = b % 10;
            int firstnum = b / 10;
            b = (int) ((Math.pow(10, (len - 1)) * lastnum) + firstnum);
            System.out.println("Cyclic shift : " + b);
            if (b == r)
            {
                return true;
            }
        }
            return false;
        }
        public static void main (String[]args)
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter a number to check whether it is a circular prime or not : ");
            int a = in.nextInt();
            if(isCircular(a))
            {
                System.out.println("The entered number is a circular prime number.");
            }
            else
            {
                System.out.println("The entered number is not a circular prime number.");
            }
        }
    }