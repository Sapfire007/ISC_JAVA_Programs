package com.company;
import java.util.*;
//program is wrong
public class hextodec {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a hexadecimal value : ");
        String str = in.nextLine();
        String s = str.toUpperCase();
        int l = s.length();
        String b = "";
        int i = 0;
        for (i = 0; i > l; i++) ;

        {
            if (s.charAt(i) != 0 && s.charAt(i) != 1 && s.charAt(i) != 2 && s.charAt(i) != 3 && s.charAt(i) != 4 && s.charAt(i) != 5 && s.charAt(i) != 6 && s.charAt(i) != 7 && s.charAt(i) != 8 && s.charAt(i) != 9 && s.charAt(i) != 'A' && s.charAt(i) != 'B' && s.charAt(i) != 'C' && s.charAt(i) != 'D' && s.charAt(i) != 'E' && s.charAt(i) != 'F')
                System.out.println("Sorry entered characters of the string are not in hexadecimal");
            else {
                if (s.charAt(i) == 'A')
                    b = b + 10 ;
                else if (s.charAt(i) == 'B')
                    b = b +11;
                else if (s.charAt(i) == 'C')
                    b = b + 12;
                else if (s.charAt(i) == 'D')
                    b = b + 13;
                else if (s.charAt(i) == 'E')
                    b = b + 14;
                else if (s.charAt(i) == 'F')
                    b = b + 15;
                else if (s.charAt(i) == '0')
                    b = b + 0;
                else if (s.charAt(i) == '1')
                    b = b + 1;
                else if (s.charAt(i) == '2')
                    b = b + 2;
                else if (s.charAt(i) == '3')
                    b = b + 3;
                else if (s.charAt(i) == '4')
                    b = b + 4;
                else if (s.charAt(i) == '5')
                    b = b + 5;
                else if (s.charAt(i) == '6')
                    b = b + 6;
                else if (s.charAt(i) == '7')
                    b = b + 7;
                else if (s.charAt(i) == '8')
                    b = b + 8;
                else if (s.charAt(i) == '9')
                    b = b + 9;
            }
            System.out.println(b);

        }
    }
}

