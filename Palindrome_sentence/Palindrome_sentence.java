import java.util.*;
class Palindrome_sentence
{
public static boolean isPalindrome(String w)
{
    String rev = "";
    for(int i = w.length()-1; i>=0; i--)
    {
        rev = rev+w.charAt(i);
    }
    if (rev.equalsIgnoreCase(w))
    {
        return true;
    }
    else
    return false;
}
public static void main()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your sentence : ");
    String s = in.nextLine();
    s = s.trim();
    s = s.toUpperCase();
    int l = s.length();
    char last = s.charAt(l-1);
    int count = 0;
    if(!(last=='.'||last=='?'||last=='!'))
    {
       System.out.println("Invalid sentence."); 
    }
    else
    {
        StringTokenizer st = new StringTokenizer(s, " .?!");
        while (st.hasMoreTokens())
        {
            String word = st.nextToken();
            if(isPalindrome(word))
            {
              System.out.print(word+".");
              ++count;
            }
        }
        System.out.println();
        System.out.println("Number of palindrome words in the sentence is : "+count);
    }
}
}