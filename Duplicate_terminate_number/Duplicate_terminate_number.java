package com.company;

import java.util.*;
public class Duplicate_terminate_number  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            boolean isDuplicate = false;

            // Check if the number is a duplicate
            for (int j = 0; j < count; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                arr[count] = num;
                count++;
            } else {

                i--;
            }
        }

        System.out.println("Array after eliminating duplicate numbers: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}




