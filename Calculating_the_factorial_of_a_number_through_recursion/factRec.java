import java.util.*;
class factRec
{
    public static int factorial(int x)
    {
        if (x == 0)
        return 1;
        else
        return x*factorial(x-1);
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number whose factorial is to be calculated : ");
        int a = in.nextInt();
        int f = factorial(a);
        System.out.println("Factorial of the entered number : "+f);
    }
}