/*
Description
Write a recursive method (no loops) which takes in a non-negative integer and
returns the sum of all the digits in a number. You should call this method recursiveSum.

For Example: recursiveSum(126) would return 9 as 1 + 2 + 6 = 9

Input
    n, where n is a non-negative integer
Sample Input
    126
Output
    The sum of all single digits in a number
Sample Output
    Result = 9
 */
import java.util.Scanner;
public class SumDigits
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = recursiveSum(n);
        System.out.println(sum);
    }

    public static int recursiveSum(int n)
    {
        if(n < 10)
        {
            return n;
        }
        else
        {
            return n%10 + recursiveSum(n/10);
        }
    }
}