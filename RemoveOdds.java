/*
Description
Write a recursive method evenDigits that accepts an integer parameter and
returns the integer that is formed by taking out the odd digits.
If there are only odd digits in the input number your method should return 0.

NOTE: You may not use Strings to solve this question

For Example:

evenDigits(123456) -> 246
evenDigits(4109) -> 40
evenDigits(8268) -> 8268
evenDigits(351) -> 0
Input
    n, where n is an Integer
Sample Input
    123456
Output
    The integer number that is formed by taking out the odd digits
Sample Output
    246
 */
import java.util.Scanner;
public class RemoveOdds
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenDigits(n));
    }

    public static int evenDigits(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int end = n% 10;
        if(end % 2 ==0)
        {
            return 10 * evenDigits(n/10) + end;
        }
        return evenDigits(n/10);

    }
}