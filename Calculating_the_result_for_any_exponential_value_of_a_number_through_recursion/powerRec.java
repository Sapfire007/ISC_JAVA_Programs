import java.util.*;
class powerRec
{
    public int pow(int a , int b)
    {
        if (b==0)
        return 1;
        else 
        return a*pow(a, b-1);
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the base number : ");
        int n = in.nextInt();
        System.out.println("Enter the exponent number : ");
        int e = in.nextInt();
        int f = 0;
        powerRec obj = new powerRec();
        f = obj.pow(n , e);
        System.out.println("Final result : "+f);
    }
}