import java.util.Scanner;
public class Exampasscheck
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int r[] = new int[10];
        double p[] = new double[10];
        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Enter roll number for student " + (i + 1) + ": ");
            r[i] = in.nextInt();
            System.out.print("Enter percentage for student " + (i + 1) + ": ");
            p[i] = in.nextDouble();
        }
        System.out.println("Students who passed:");
        for (int i = 0; i < 10; i++)
        {
            if (p[i] >= 50.0)
            {
                System.out.println("Roll number: " + r[i] + ", Scored percentage: " + p[i] + "%");
            }
        }
    }
}