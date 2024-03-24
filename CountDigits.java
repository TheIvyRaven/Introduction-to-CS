/*
Description
Given a user inputted non-negative integer write a recursive method (no loops)
to count the number of occurrences of 8 as a digit, except that an 8 with another
8 immediately to its left counts double, so 8818 yields 4. You should call your method countEights.
Your method should take an integer as its parameter and return an integer that is the
result of counting the eights.

For Example:

countEights(8) -> 1
countEights(8818) -> 4
countEights(888) -> 5
Input
    n, where n is an integer value
Sample Input
    8818
Output
    8's in n
Sample Output
    Result = 4
 */
import java.util.Scanner;
public class CountDigits
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Result = " + countEights(n));

    }


    public static int countEights(int n)
    {
        int count = 0;
        if(n<=0)
        {
            return 0;
        }
        else if(n%100 == 88)
        {
            count = count +2;
            return count + countEights(n/10);
        }
        else if(n%10 == 8)
        {
            count++;
            return count + countEights(n/10);
        }
        else
        {
            return countEights(n/10);
        }


    }
}