package com.company;
import java.util.*;
public class Date_calculator
{
    public static int dateCounter(int a, int b)
    {
        String s = "";
        int d = 0;
        int jan = 31;
        int febnonlp = 28;
        int feblp = 29;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;
        if (b%4==0) //leap year
        {
            if (a <= 31)
            {
                s = "January";
                d = a;
            }
            else if (a>(jan) && a<=(jan+feblp))
            {
                s = "February";
                d = a-jan;
            }
            else if (a>(jan+feblp) && a<=(jan+feblp+mar))
            {
                s = "March";
                d = a-(jan+feblp);
            }
            else if (a>(jan+feblp+mar) && a<=(jan+feblp+mar+apr))
            {
                s = "April";
                d = a-(jan+feblp+mar);
            }
            else if (a>(jan+feblp+mar+apr) && a<=(jan+feblp+mar+apr+may))
            {
                s = "May";
                d = a-(jan+feblp+mar+apr);
            }
            else if (a>(jan+feblp+mar+apr+may) && a<=(jan+feblp+mar+apr+may+jun))
            {
                s = "June";
                d = a-(jan+feblp+mar+apr+may);
            }
            else if (a>(jan+feblp+mar+apr+may+jun) && a<=(jan+feblp+mar+apr+may+jun+jul))
            {
                s = "July";
                d = a-(jan+feblp+mar+apr+may+jun);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul) && a<=(jan+feblp+mar+apr+may+jun+jul+aug))
            {
                s = "August";
                d = a-(jan+feblp+mar+apr+may+jun+jul);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug) && a<=(jan+feblp+mar+apr+may+jun+jul+aug+sep))
            {
                s = "September";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug+sep) && a<=(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct))
            {
                s = "October";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug+sep);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct) && a<=(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct+nov))
            {
                s = "November";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct+nov) && a<=(366))
            {
                s = "December";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct+nov);
            }
            else
            {
                s = "Invalid input";
            }
        }
        else //non leap year
        {
            if (a <= 31)
            {
                s = "January";
                d = a;
            }
            else if (a>(jan) && a<=(jan+febnonlp))
            {
                s = "February";
                d = a-jan;
            }
            else if (a>(jan+febnonlp) && a<=(jan+febnonlp+mar))
            {
                s = "March";
                d = a-(jan+febnonlp);
            }
            else if (a>(jan+febnonlp+mar) && a<=(jan+febnonlp+mar+apr))
            {
                s = "April";
                d = a-(jan+febnonlp+mar);
            }
            else if (a>(jan+febnonlp+mar+apr) && a<=(jan+febnonlp+mar+apr+may))
            {
                s = "May";
                d = a-(jan+febnonlp+mar+apr);
            }
            else if (a>(jan+febnonlp+mar+apr+may) && a<=(jan+febnonlp+mar+apr+may+jun))
            {
                s = "June";
                d = a-(jan+febnonlp+mar+apr+may);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun) && a<=(jan+febnonlp+mar+apr+may+jun+jul))
            {
                s = "July";
                d = a-(jan+febnonlp+mar+apr+may+jun);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug))
            {
                s = "August";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug+sep))
            {
                s = "September";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug+sep) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct))
            {
                s = "October";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug+sep);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct+nov))
            {
                s = "November";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct+nov) && a<=(365))
            {
                s = "December";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct+nov);
            }
            else
            {
                s = "Invalid input";
            }
        }
        return d;
    }
    public static String monthCounter(int a, int b)
    {
        String s = "";
        int d = 0;
        int jan = 31;
        int febnonlp = 28;
        int feblp = 29;
        int mar = 31;
        int apr = 30;
        int may = 31;
        int jun = 30;
        int jul = 31;
        int aug = 31;
        int sep = 30;
        int oct = 31;
        int nov = 30;
        int dec = 31;
        if (b%4==0) //leap year
        {
            if (a <= 31)
            {
                s = "January";
                d = a;
            }
            else if (a>(jan) && a<=(jan+feblp))
            {
                s = "February";
                d = a-jan;
            }
            else if (a>(jan+feblp) && a<=(jan+feblp+mar))
            {
                s = "March";
                d = a-(jan+feblp);
            }
            else if (a>(jan+feblp+mar) && a<=(jan+feblp+mar+apr))
            {
                s = "April";
                d = a-(jan+feblp+mar);
            }
            else if (a>(jan+feblp+mar+apr) && a<=(jan+feblp+mar+apr+may))
            {
                s = "May";
                d = a-(jan+feblp+mar+apr);
            }
            else if (a>(jan+feblp+mar+apr+may) && a<=(jan+feblp+mar+apr+may+jun))
            {
                s = "June";
                d = a-(jan+feblp+mar+apr+may);
            }
            else if (a>(jan+feblp+mar+apr+may+jun) && a<=(jan+feblp+mar+apr+may+jun+jul))
            {
                s = "July";
                d = a-(jan+feblp+mar+apr+may+jun);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul) && a<=(jan+feblp+mar+apr+may+jun+jul+aug))
            {
                s = "August";
                d = a-(jan+feblp+mar+apr+may+jun+jul);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug) && a<=(jan+feblp+mar+apr+may+jun+jul+aug+sep))
            {
                s = "September";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug+sep) && a<=(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct))
            {
                s = "October";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug+sep);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct) && a<=(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct+nov))
            {
                s = "November";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct);
            }
            else if (a>(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct+nov) && a<=(366))
            {
                s = "December";
                d = a-(jan+feblp+mar+apr+may+jun+jul+aug+sep+oct+nov);
            }
            else
            {
                s = "Invalid input";
            }
        }
        else //non leap year
        {
            if (a <= 31)
            {
                s = "January";
                d = a;
            }
            else if (a>(jan) && a<=(jan+febnonlp))
            {
                s = "February";
                d = a-jan;
            }
            else if (a>(jan+febnonlp) && a<=(jan+febnonlp+mar))
            {
                s = "March";
                d = a-(jan+febnonlp);
            }
            else if (a>(jan+febnonlp+mar) && a<=(jan+febnonlp+mar+apr))
            {
                s = "April";
                d = a-(jan+febnonlp+mar);
            }
            else if (a>(jan+febnonlp+mar+apr) && a<=(jan+febnonlp+mar+apr+may))
            {
                s = "May";
                d = a-(jan+febnonlp+mar+apr);
            }
            else if (a>(jan+febnonlp+mar+apr+may) && a<=(jan+febnonlp+mar+apr+may+jun))
            {
                s = "June";
                d = a-(jan+febnonlp+mar+apr+may);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun) && a<=(jan+febnonlp+mar+apr+may+jun+jul))
            {
                s = "July";
                d = a-(jan+febnonlp+mar+apr+may+jun);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug))
            {
                s = "August";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug+sep))
            {
                s = "September";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug+sep) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct))
            {
                s = "October";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug+sep);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct) && a<=(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct+nov))
            {
                s = "November";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct);
            }
            else if (a>(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct+nov) && a<=(365))
            {
                s = "December";
                d = a-(jan+febnonlp+mar+apr+may+jun+jul+aug+sep+oct+nov);
            }
            else
            {
                s = "Invalid input";
            }
        }
        return s;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the nth day of a year. (where 0<n<366 for a normal year and 0<n<367 for a leap year  ");
        int n = in.nextInt();
        System.out.println("Enter the year whose nth day you want to find.");
        int year = in.nextInt();
        System.out.println("Enter the value of N days. (where N is the date which comes after the adding the days to the nth date previously taken and 1<=N<=100.) ");
        int N = in.nextInt();
        String s = "";
        if (n>0 && n<367)
        {
            if (N >= 1 && N <= 100)
            {
                int date = dateCounter(n, year);
                String month = monthCounter(n, year);
                int futureDate = dateCounter(n + N, year);
                String futureMonth = monthCounter(n + N, year);
                System.out.println("Entered date : " + month + " " + date + "," + " " + year);
                System.out.println(N + " days later : " + futureMonth + " " + futureDate + "," + " " + year);
            }
        }
            else
            {
                System.out.println("Sorry, invalid input.");
            }
    }
}