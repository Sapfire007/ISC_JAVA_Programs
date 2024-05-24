package com.company;
import java.util.*;
public class Array_frequency
{
    public static void main(String[] args)
    {
     Scanner in = new Scanner (System.in);
     int marks[]= new int[10];
        int counter=0;
        System.out.println("Enter the marks scored by you in 10 subjects.");
        for (int i =0; i<10 ; i++)
        marks[i]=in.nextInt();
        System.out.println("Enter a to check its frequency");
        int find = in.nextInt();
        for (int i = 0;i<10;i++)
        {
         if (find==marks[i])
         counter++;
        }
        System.out.println("You got "+find+" in "+counter+" subjects." );
    }
}
