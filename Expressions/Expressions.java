package com.company;
import java.util.*;
public class Expressions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Here are the following expressions to be calculated :-");
        System.out.println("1. (x-y)/2");
        System.out.println("Enter the value of x");
        double a = in.nextDouble();
        System.out.println("Enter the value of y");
        double b = in.nextDouble();
        double ans1 = (a-b)/2;
        System.out.println("Your answer is : "+ans1);
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("2. (b^2 - 4ac)/2a");
        System.out.println("Enter the value of a");
        double a1 = in.nextDouble();
        System.out.println("Enter the value of b");
        double b1 = in.nextDouble();
        System.out.println("Enter the value of c");
        double c = in.nextDouble();
        double ans2 = ((b1*b1 - 4*a1*c)/(2*a1));
        System.out.println("Your answer is : "+ans2);
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("3. v^2 - u^2 ");
        System.out.println("Enter the value of v");
        double v = in.nextDouble();
        System.out.println("Enter the value of u");
        double u = in.nextDouble();
        double ans3 = v*v - u*u;
        System.out.println("Your answer is : "+ans3);
//----------------------------------------------------------------------------------------------------------------------
        System.out.println("4. a*b-d");
        System.out.println("Enter the value of a");
        double x = in.nextDouble();
        System.out.println("Enter the value of b");
        double y = in.nextDouble();
        System.out.println("Enter the value of d");
        double z = in.nextDouble();
        double ans4 = x*y-z;
        System.out.println("Your answer is : "+ans4);

    }
}
