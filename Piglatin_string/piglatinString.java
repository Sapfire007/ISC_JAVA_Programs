import java.util.*;
class piglatinString
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s = in.nextLine();
        s = s.trim();
        s = s.toUpperCase();
        int l = s.length();
        String w ="";
        int vindex = 0;
        for (int i=0; i<l; i++)
        {
            if (s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
            {
                vindex = i;
                break;
            }
            else
            continue;
        }
        w = s.substring(vindex)+s.substring(0,vindex)+"AY";
        System.out.println(w);
    }
}