/*
Description
Write a recursive function named powerTo that accepts two integers representing
a base and a power and returns the base raised to that power.

For Example:

powerTo(2, 3) -> 8
powerTo(3, 3) -> 27
powerTo(3, 4) -> 81
Do not use loops or auxiliary data structures; solve the problem recursively.

NOTE: You may not use Math.pow() to solve this question

Input
    x y, where x and y are positive Integer values.
Sample Input
    2 3
Output
    The value of 2 to the power of 3
Sample Output
    8
 */
import java.util.Scanner;
public class Exponent
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int pow = sc.nextInt();

        System.out.println(powerTo(num,pow));
    }

    public static int powerTo(int a, int b)
    {
        if(b==0)
        {
            return 1;
        }
        else
        {
            return a*powerTo(a,b-1);
        }
    }
}