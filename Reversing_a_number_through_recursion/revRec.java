import java.util.*;
class revRec
{
    int ans = 0;
    public int rev(int a)
    {
        
        if (a == 0)
        {
         return a;
        }
        if (a > 0)
        {
            int temp = a %10;
            ans = ans*10+temp;
            rev(a/10);
        }
        return ans;
    }
    
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to be reversed : ");
        int n = in.nextInt();
        revRec obj = new revRec();
        int f = obj.rev(n);
        System.out.println("The reversed number is : "+f);
    }
}