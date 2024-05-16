import java.util.*;
class Evil
{
    int num;
    String bin;
    Evil()
    {
      num = 0;
      bin = "";
    }
    
    void acceptNum()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number :");
        num = in.nextInt();
    }
    
    void rec_bin(int x )
    {
        if (x > 0)
        {
        bin = x%2+bin;
        rec_bin(x/2);
        }
    }
    
    void check()
    {
        rec_bin(num);
        int count = 0;
        for (int i = 0; i<bin.length();i++)
        {
            if(bin.charAt(i)=='1')
            count++;
        }
        if (count%2==0)
        System.out.println(num + " is an evil number.");
        else
        System.out.println(num + " is not an evil number.");
    }
    
    public static void main()
    {
        Evil obj = new Evil();
        obj.acceptNum();
        obj.check();
    }
}