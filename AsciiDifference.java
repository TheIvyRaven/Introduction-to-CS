/*
Description
Write a Java program, called AsciiDifference that contains a static method called difference()
that accepts two Strings as the input parameters and returns the difference in the sum of
ASCII values of the two Strings as an integer value. The input parameters should be read in
from the user in the main method and passed to the difference() method. The main method should
print returned integer to the screen.

Sample Input
    ireland
    IRELAND
Sample Output
    224
Explanation
String s1 = "ireland"; String s2 = "IRELAND"; The sum of ASCII Values for s1 = 735
The sum of ASCII Values for s2 = 511 The difference between s1 and s2 = 224
 */
import java.util.Scanner;
public class AsciiDifference
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();

        String input2 = sc.nextLine();

        System.out.println(difference(input1, input2));
    }

    public static int difference(String a, String b)
    {
        int c = 0;
        int d = 0;

        for(int i = 0; i< a.length(); i++)
        {
            c += (int) a.charAt(i);
        }

        for(int i =0; i< b.length(); i++)
        {
            d += (int) b.charAt(i);
        }

        if(c < d)
        {
            return d - c;
        }
        else
        {
            return c - d;
        }
    }
}