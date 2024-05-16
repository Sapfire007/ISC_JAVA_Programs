import java.util.*;
class ArmNum
{
    int n;
    int l;
    ArmNum (int nn)
    {
        n = nn;
        l = 0;
    }
    int sum_pow(int i)
    {
        if (i > 0)
        return (int)(Math.pow(i%10,l)+sum_pow(i/10));
        else
        return 0;
    }
    void isArmstrong()
    {
        int i = n;
        while(i > 0)
        {
          i = i / 10;
          ++l;
        }
        int sum = sum_pow(n);
        if (n == sum)
        System.out.println("Armstrong number.");
        else
        System.out.println("Not an armstrong number.");
    }
    public static void main(String args[])
    {
        ArmNum obj = new ArmNum(371);
        obj.isArmstrong();
    }
}