import java.util.*;
class Reverse 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a string whose reverse is to be displayed");
        String s = in.nextLine();
        char ch = ' ';
        String rev = "";
        for (int i =0;i<s.length();i++)
        {
            ch = s.charAt(i);
            rev = ch + rev;
        }
        System.out.println("The required reverse of the string is = "+ rev);
    }
}
