package com.company;
import java.util.*;
public class Array_Max {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number[] = new int[10];
        System.out.println("Enter your marks in 10 subjects.");
        for (int i=0;i<10;i++) {
            number[i] = in.nextInt();
        }
        int max = number[0];
        for (int i=0;i<10;i++)
        {
            if(number[i]>max)
                max = number[i];
        }
        System.out.println("The maximum obtained marks is = "+max);
    }
}
