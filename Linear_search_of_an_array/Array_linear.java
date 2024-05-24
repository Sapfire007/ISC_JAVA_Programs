package com.company;
import java.util.*;
public class Array_linear
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        int marks[]= new int[10];
        System.out.println("Enter the marks scored by you in 10 subjects.");
        for (int i =0; i<10 ; i++) {
            marks[i] = in.nextInt();
        }
        System.out.println("Enter the element to be searched");
        int find = in.nextInt();
        int success=0;
        for (int i = 0;i<10;i++)
        {
            if (marks[i]==find)
            {
                System.out.println("Element is found at index : "+i);
                success=1;
                break;
            }
        }
        if(success==0)
            System.out.println("Element not found");
    }
}
