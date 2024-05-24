package com.company;
import java.util.*;
class DigitToWord
{
    public static void main(String[] args)
    {
        int r, n, num;
        String digitWords = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number=");
        n = sc.nextInt();
        num = n;
        while (num > 0)
        {
            r = num % 10;
            switch (r)
            {
                case 0:
                    digitWords = "Zero " + digitWords;
                    break;
                case 1:
                    digitWords = "One " + digitWords;
                    break;
                case 2:
                    digitWords = "Two " + digitWords;
                    break;
                case 3:
                    digitWords = "Three " + digitWords;
                    break;
                case 4:
                    digitWords = "Four " + digitWords;
                    break;
                case 5:
                    digitWords = "Five " + digitWords;
                    break;
                case 6:
                    digitWords = "Six " + digitWords;
                    break;
                case 7:
                    digitWords = "Seven " + digitWords;
                    break;
                case 8:
                    digitWords = "Eight " + digitWords;
                    break;
                case 9:
                    digitWords = "Nine " + digitWords;
                    break;
            }
            num = num / 10;
        }
        System.out.println("Digit=" + n);
        System.out.println("Words=" + digitWords);
    }
}