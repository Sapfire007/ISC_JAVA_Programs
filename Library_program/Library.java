import java.util.Scanner;

public class Library
{
    private String name;
    private int price;
    private int day;
    private double fine;
    
    public void input() 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter name of the book: ");
        name = in.nextLine();
        System.out.print("Enter printed price of the book: ");
        price = in.nextInt();
        System.out.print("For how many days fine needs to be paid: ");
        day = in.nextInt();
    }
    
    public void cal() 
    {
        if (day <= 7)
            fine = day * 0.25;
        else if (day <= 15)
            fine = (7 * 0.25) + ((day - 7) * 0.4);
        else if (day <= 30)
            fine = (7 * 0.25) + (8 * 0.4) + ((day - 15) * 0.6);
        else
            fine = (7 * 0.25) + (8 * 0.4) + (15 * 0.6) + ((day - 30) * 0.8);
    }
    
    public void display() 
    {
        System.out.println("Name of the book: " + name);
        System.out.println("Fine to be paid: " + fine);
    }
    
    public static void main(String args[]) 
    {
        Library obj = new Library();
        obj.input();
        obj.cal();
        obj.display();
    }
} 