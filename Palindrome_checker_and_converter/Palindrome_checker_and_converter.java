import java.util.*;
public class Palindrome_checker_and_converter
{
    public static int reverseCalculator(int a)
    {
        int reverse=0;
        while (a!=0)
        {
            int remainder = a%10;
            reverse = reverse*10 + remainder;
            a = a/10;
        }
        return reverse;
    }
    public static String palindromeMaker(int b)
    {
        String x = Integer.toString(b);
        int reverse=0;
        while (b!=0)
        {
            int remainder = b%10;
            reverse = reverse*10 + remainder;
            b = b/10;
        }
        String y = Integer.toString(reverse);
        String z = x+y;
        return z;
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is a palindrome number, if the entered number is not a palindrome number it will be returned in palindrome form.");
        int num = in.nextInt();
        int reverse = reverseCalculator(num);
        String palindromeRemake = palindromeMaker(num);
        if (reverse == num)
        {
            System.out.println("The entered number : "+num+", is a palindrome number." );
        }
        else
        {
            System.out.println("The entered number : "+num+", is not a palindrome number, hence its palindrome form is : "+ palindromeRemake);
        }
    }
}