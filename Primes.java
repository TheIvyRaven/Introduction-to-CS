/*
Description
Write a java program called Primes. This program should contain a method called isPrime() that accepts an integer parameter and returns a boolean value. This method should check if the integer is a prime number or not and return an appropriate boolean value. The main method should call the isPrime() method and print an appropriate messge to the screen.

Sample Input 1
    12
Sample Output 1
    12 is NOT a Prime number
Sample Input 2
    13
Sample Output 2
    13 is a Prime number
 */
import java.util.Scanner;
public class Primes
{
    public static void main(String [] args)
    {

        isPrime();
    }

    public static void isPrime()
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count = 0;
        int divisor = 1;

        do
        {
            if(num % divisor == 0)
            {
                count++;
            }
            divisor++;
        }

        while(divisor <= num);

        if(count >= 3)
        {
            System.out.println(num + " is NOT a Prime number");
        }
        else if(count ==2)
        {
            System.out.println(num + " is a Prime number");
        }
    }
}