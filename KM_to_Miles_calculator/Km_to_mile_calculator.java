package com.company;
import java.util.*;
public class Km_to_mile_calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your distance in Km");
        double km = in.nextDouble();
        double a = 1.609;
        double miles = (km/a);
        System.out.println("Your entered Km distance in miles is = "+miles+" miles.");
    }
}
