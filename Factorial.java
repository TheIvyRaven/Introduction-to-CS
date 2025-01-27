/*Description
        Write a Java program, called Factorial that contains a static method called getFactorial(). The getFactorial() method should accept an integer value x as a parameter. It will return nothing and print the factorial of the input parameter to the screen. The main method should read in user input in the form of two integer numbers, n, and m. When the code executes the factorial of all numbers from n up to m should be printed to the screen each on a new line using a loop. If either of the user inputs is negative, an error message should print to the screen stating “Not Valid!”

        NOTE: Output must match exactly

        Input
        n m , where n and m are integer values
        Sample Input
        2 5
        Output
        The Factorial of all numbers from n up to m
        Sample Output
        2
        6
        24
        120
 */
import java.util.Scanner;
public class Factorial
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n>0 && m>0)
        {
            getFactorial(n,m);
        }
        else
        {
            System.out.println("Not Valid!");
        }

    }

    public static void getFactorial(int a,int b)
    {
        while(a<=b)
        {
            int factorial = 1;
            for(int i = 1; i<=a;i++)
            {
                factorial  *= i;
            }
            System.out.println(factorial);

            a++;
        }
    }
}