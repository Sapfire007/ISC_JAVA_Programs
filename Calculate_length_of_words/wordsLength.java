import java.util.*;
class wordsLength
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your sentence : ");
        String s = in.nextLine();
        System.out.println("\nWord\t\tWord length\n");
        StringTokenizer st = new StringTokenizer(s);
        String f = "";
        int n = st.countTokens();
        int wl = 0;
        for (int i = 1 ; i <= n ; i++)
        {
            String t = st.nextToken();
            wl = t.length();
            System.out.println(t + "\t\t" + wl);
        }
    }
}