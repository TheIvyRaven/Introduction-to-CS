/*
Description
Write a recursive method sumTo that accepts an Integer parameter and returns the
sum of the first n reciprocals as a double.

In other words:

sumTo(n) returns: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n

Your answer should be rounded to 2 decimal places. The following code will help:

    Math.round(result * 100.0) / 100.0;

For Example:

sumTo(2) 1 + 1/2 -> 1.5
sumTo(6) -> 1 + 1/2 + 1/3 + 1/4 + 1/5 + 1/6 -> 2.45
Input
    n, where n is an Integer
Sample Input
    6
Output
    The sum of the first 6 reciprocals rounded to 2 decimal places
Sample Output
    2.45
 */
import java.util.Scanner;
public class Reciprocals
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Math.round(sumTo(num) * 100.0) / 100.0);
        ;

    }

    public static double sumTo(int a)
    {
        double num = a * 1.0;
        if(num <= 1.0)
        {
            return 1;
        }
        else
        {
            return 1/ num + sumTo(a-1);
        }
    }
}