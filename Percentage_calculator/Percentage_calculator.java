package com.company;
import java.util.*;
public class Percentage_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your marks for 5 subjects out of 100 marks to calculate its percentage");
        System.out.println("Enter marks for subject 1 :");
        int a = in.nextInt();
        System.out.println("Enter marks for subject 2 :");
        int b = in.nextInt();
        System.out.println("Enter marks for subject 3 :");
        int c = in.nextInt();
        System.out.println("Enter marks for subject 4 :");
        int d = in.nextInt();
        System.out.println("Enter marks for subject 5 :");
        int e = in.nextInt();
        int total = 500;
        int sum = a+b+c+d+e;
        double dsum = Double.valueOf(sum);
        double percentage = (dsum*100/total);
        System.out.println("You scored a percentage of = "+percentage+"%");
    }
}
