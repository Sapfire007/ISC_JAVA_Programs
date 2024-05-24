import java.util.*;
class MagicNumber
{
 int n; // store the number
 // Constructor to assign 0 to n
 MagicNumber()
 {
 n = 0;
 }
 // Method to assign the parameter value to n
 void getnum(int num)
 {
 n = num;
 }
 // Method to calculate the sum of digits of a number
 int Sum_of_digits(int num)
 {
 int sum = 0;
 while (num != 0)
 {
 sum += num % 10;
 num /= 10;
 }
 return sum;
 }
 // Method to check if the given number is a magic number
 void ismagic()
 {
 int sumOfDigits = Sum_of_digits(n);
 if (sumOfDigits == 1)
 {
 System.out.println(n + " is a magic number.");
 }
 else 
 {
 while (sumOfDigits > 9)
 {
 sumOfDigits = Sum_of_digits(sumOfDigits);
 }
 if (sumOfDigits == 1)
 {
 System.out.println(n + " is a magic number.");
 } 
 else
 {
 System.out.println(n + " is not a magic number.");
 }
 }
 }
 // Main method to get user input and check if the number is magic
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter a number: ");
 int number = in.nextInt();
 MagicNumber magic = new MagicNumber();
 magic.getnum(number);
 magic.ismagic();
 }
}