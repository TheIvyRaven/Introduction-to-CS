/*
Description
Write a Java program, called CombineReverse that contains a static method called combine()
that accepts a single non-negative integer as its parameter and returns the long integer
combined with the integer in reverse. The input parameter should be read in from the user
in the main method and passed to the combine() method. The main method should print the
combined integer to the screen. If the input is negative an error message should print
to the screen stating “Not a valid entry!”

Sample Input
    427
Sample Output
    427724
 */
import java.util.Scanner;
public class CombineReverse
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0)
        {
            System.out.println(combine(num));
            //combine(num);
        }
        else
        {
            System.out.println("Not a valid entry!");
        }
    }

    public static int combine(int a)
    {
        String b = Integer.toString(a);
        String c = new String("");
        for(int i = 0; i<b.length(); i++)
        {
            c= b.charAt(i) + c;
        }
        System.out.println(c);


        return Integer.parseInt(b+c);
    }
}