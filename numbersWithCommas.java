/*
Description
Write a program which contains a method called commaNumbers.
This method takes one input to represent a number (an integer).
The method should return a String to represent the same number with appropriate commas in place.

Sample Input 1
    1000
Sample Output 1
    1,000
Sample Input 2
    100000
Sample Output 2
    100,000
Sample Input 3
    20
Sample Output 3
    20
 */
import java.util.Scanner;
import java.text.DecimalFormat;
public class numbersWithCommas
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(commaNumbers(a));
    }
    public static String commaNumbers(int a)
    {
        DecimalFormat df = new DecimalFormat("#,###");
        return df.format(a);
    }
}