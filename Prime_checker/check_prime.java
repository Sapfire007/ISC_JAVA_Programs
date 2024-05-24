package com.company;
import java.util.*;
public class check_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check whether it is prime or not.");
        int n = in.nextInt();
        int temp=0;
        int i;
        for ( i = 2; i<=temp-1; i++)
        {
            if (n%i==0)
            {
                temp = temp + 1;
            }
        }
        if (temp>0)
        {
            System.out.println("Entered number is not a prime number");
        }
        else
        {
            System.out.println("Entered number is a prime number");
        }
    }
}
