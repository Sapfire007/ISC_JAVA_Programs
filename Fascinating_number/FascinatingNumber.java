import java.util.*;
class FascinatingNumber
{
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter a number to check whether it is Fascinating or not: ");
 int number = in.nextInt();
 if (isFascinating(number))
 {
 System.out.println(number + " is a fascinating number.");
 }
 else
 {
 System.out.println(number + " is not a fascinating number.");
 }
 }
 public static boolean isFascinating(int number)
 {
 // Convert the number to a string
 String numString = Integer.toString(number);
 // Concatenate the number, number multiplied by 2, and number multiplied by 3
 int number2 = number*2;
 int number3 = number*3;
 String concatenated = numString + number2 + number3;
 // Remove all non-digit characters from the concatenated string
 String digitsOnly = concatenated.replaceAll("\\D", "");
 // Check if the digits 1 to 9 appear exactly once each in the resulting string
 for (int i = 1; i <= 9; i++)
 {
 String digit1 = Integer.toString(i);
 int digit2 = digitsOnly.indexOf(digit1);
 int digit3 = digitsOnly.lastIndexOf(digit1);
 if (!digitsOnly.contains(digit1) ||
digitsOnly.indexOf(digit1) != digit2)
 {
 return false;
 }
 }
 return true;
 }
}