import java.util.*;
class Prime_palindrome
{
    boolean isPrime(int n)
    {
        int c = 0;
        for (int i = 1; i<=n; i++)
        {
            if (n%i==0)
            c++;
        }
        if (c==2)
        return true;
        else
        return false;
    }
    
    boolean isPalindrome(int n)
    {
        int temp = n;
        int rev = 0;
        while(temp>0)
        {
            int d = temp%10;
            rev = rev*10+d;
            temp=temp/10;
        }
        if (n==rev)
        return true;
        else
        return false;
    }
    
    public static void main(String args[])
    {
        Prime_palindrome obj = new Prime_palindrome();
        for(int i = 100; i<= 500; i++)
        {
            if (obj.isPrime(i) && obj.isPalindrome(i))
            System.out.print(i+", ");
        }
    }
}
