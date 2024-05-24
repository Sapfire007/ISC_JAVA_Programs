package com.company;
import java.util.*;
public class Array_sum_and_avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        System.out.println("Enter the numbers.");
        for (int i = 0; i < 10; i++) {
            a[i] = in.nextInt();
        }
            int sum = 0;
        for (int i = 0; i <a.length; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The sum of the entered numbers is : " + sum);
        System.out.println("The avg of the entered numbers is : " + (sum/a.length));
    }
}