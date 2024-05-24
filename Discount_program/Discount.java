package com.company;
import java.util.*;
public class Discount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your bill amount.");
        double bill = in.nextDouble();
        System.out.println("List Price\t\t\tRate of Discount");
        if (bill > 0 && bill <= 2000 )
            System.out.println(bill+"\t\t\t\t"+"No discount");
        else if (bill >= 2001 && bill <= 5000)
            System.out.println(bill+"\t\t\t\t"+"10%");
        else if (bill >= 5001 && bill <= 10001)
            System.out.println(bill+"\t\t\t\t"+"15%");
        else if (bill > 10001 )
            System.out.println(bill+"\t\t\t\t"+"20%");
        else
            System.out.println("Not a valid purchase !");
    }
}
