import java.util.Scanner;
public class buzzNum
{
    public static void main() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = in.nextInt();
        if (number % 10 == 7 || number % 7 == 0)
            System.out.println(number + " is a Buzz number.");
        else
            System.out.println(number + " is a not Buzz number.");
    }
}