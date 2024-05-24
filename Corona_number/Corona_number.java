package com.company;
import java.util.*;
public class Corona_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            System.out.println("Enter a number");
            int num = in.nextInt();
            String s = Integer.toString(num);
            int length = s.length();
            int arr[] = new int[length];
            int d1=0;
            for (int i = 0; i < arr.length; i++)
            {
               while (num != 0) {
                    d1 = num % 10;
                    num = num / 10;
                    arr[i] = d1;
                   i++;
                }
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++)
            {
                if(arr[i]%2!=0)
                {
                    count++;
                }
                else
                {
                count = 0;
                break;
                }
            }
            if(count!=0)
            {
                System.out.println("Corona number.");
            }
            else
            {
                System.out.println("Not a corona number.");
            }
        }
    }
}