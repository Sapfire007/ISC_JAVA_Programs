import java.util.*;
class charFreq
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = in.nextLine();
        s = s.trim();
        s = s.toLowerCase();
        System.out.println("Character\tFrequency");
        for (char c ='a'; c<='z'; c++)
        {
            int count = 0;
            for (int i = 0; i <s.length(); i++)
            {
                if (c==s.charAt(i))
                {
                    count++;
                }
            }
            if(count!=0)
            System.out.println(c+"\t\t\t"+count);
        }
    }
}