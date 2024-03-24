/*
Description
Write a java program that takes in a number N and finds the smallest palindrome prime
greater than or equal to N. This should be done by creating two methods,
one to check if the number is prime and one to check if the number is a palindrome.

Sample Input 1
    8
Sample Output 1
   The next prime palindrome is 11
 */
import java.util.Scanner;
public class PrimePalindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        for(int i = num; num<=10000; i++)
        {
            if (isPrime(i) == true && isPalindrome(i) == true)
            {
                System.out.println("The next prime palindrome is " + i);
                break;
            }
        }
    }


    public static boolean isPalindrome(int a)
    {
        String x = Integer.toString(a);

        String y = new String("");

        char ch;

        for(int i = 0; i <x.length();i++)
        {
            ch = x.charAt(i);
            y = ch+ y;
        }

        if(x.compareTo(y)==0)
        {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int a)
    {
        int count = 0;
        int divisor = 1;

        do
        {
            if(a % divisor == 0)
            {
                count++;
            }
            divisor++;
        }while(divisor <= a);

        if(count == 2)
        {
            return true;
        }
        return false;
    }
}