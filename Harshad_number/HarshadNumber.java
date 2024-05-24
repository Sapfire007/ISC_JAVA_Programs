import java.util.*;
class HarshadNumber
{
 public static void printHarshadNum(int m, int n)
 {
 //print all Harshad numbers from starting to ending range
 for (int i = m; i <= n; i++)
 {
 if (isHarshadNumber(i))
 {
 System.out.println(i);
 }
 }
 }
 public static boolean isHarshadNumber(int num)
 {
 int sum = 0;
 int originalNum = num;
 // Calculate the sum of digits
 while (num > 0)
 {
 sum += num % 10;
 num /= 10;
 }
 // Check if the number is divisible by the sum of its digits
 return originalNum % sum == 0;
 }
 public static void main(String[] args)
 {
 Scanner in = new Scanner(System.in);
 System.out.print("Enter starting range: ");
 int m = in.nextInt(); // Starting range
 System.out.print("Enter ending range: ");
 int n = in.nextInt(); // Ending range
 System.out.println("Harshad numbers between " + m + "and " + n + ":");
 printHarshadNum(m, n);
 }
}