import java.util.*;
class dictionary
{
    public void arrange(String temp[])
    {
        for (int i = 0; i<temp.length; i++)
        {
            for (int j = i+1; j<temp.length; j++)
            {
                if (temp[i].compareToIgnoreCase(temp[j])>0)
                {
                    String t1 = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t1;
                }
            }
            System.out.print(temp[i] + " ");
        }
    }
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        dictionary obj = new dictionary();
        System.out.println("Enter your sentence to be sorted : ");
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s," .");
        int n = st.countTokens();
        String arr[] = new String[n];
        while(st.hasMoreTokens())
        {
            for (int i = 0; i<n; i++)
            {
                arr[i] = st.nextToken();
            }
        }
        obj.arrange(arr);
    }
}