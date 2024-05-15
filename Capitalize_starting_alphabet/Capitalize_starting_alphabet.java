 import java.util.*;
class Capitalize_starting_alphabet
{
    public static void main()
{
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your sentence : ");
    String s = in.nextLine();
    s = s.trim();
    s = " "+s;
    s = s.toLowerCase();
    String f ="";
    for(int i = 0; i<s.length(); i++)
    {
        char ch = s.charAt(i);
        if(ch == ' ')
        {
            f = f+ch;
            i++;
            ch = s.charAt(i);
            f = f + Character.toUpperCase(ch);
        }
        else
        {
            f = f+ch;
        }
    }
    System.out.println("Final output : "+f.trim());
}
}