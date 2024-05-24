package com.company;
import java.util.*;
public class Palindrome2 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a string whose reverse is to be displayed");
        String s = in.nextLine();
        char ch = ' ';
        String rev = "";
        for (int i =(s.length()-1);i>=0;i--)
        {
            ch = s.charAt(i);
            rev = rev+ch;
        }
        System.out.println(rev);
        System.out.println("The reverse of the entered string is = "+ rev );
        if (s.equals(rev))
            System.out.println("Yes, the entered string is palindrome");
        else if (s.equalsIgnoreCase(rev))
            System.out.println("Yes, the entered string is palindrome. but the cases of the alphabets in the entered string is different.");
        else
            System.out.println("No, the entered string is not palindrome");
    }
}
