package com.company;
import java.util.*;
public class Index_order_by_while_loop  //program name
{      //start of the class
    public static void main(String[] args)
    {      //start of main
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your string.");
        String s = in.nextLine();                 //accepting string from user
        int i = 0 ; int sn = 1;
        while (i<s.length())
        {             //start of while loop
            System.out.println("Serial_number\tCharAt_position_number\tCharacter");
            System.out.println(sn+"\t\t\t\t\t\t"+i+"\t\t\t\t\t"+s.charAt(i));
            i++;   /** Increases the count of int i to run the while loop*/
            sn++; /** Increases the count of the serial numbers */
        }          //end of while loop
    }             //end of main
}                //end of class
