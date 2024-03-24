/*
Description
Write a recursive method (no loops) which takes a String and reverses it.
You should call this method reverseString. The method should take a String and return the String reversed.

Input
    n, where n is a String
Sample Input
    Hello
Output
    The String reversed
Sample Output
    olleH
 */
import java.util.Scanner;
public class StringReverse
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String n = new String(sc.nextLine());
        sc.close();
        String output = reverseString(n,0);

        System.out.println(output);
    }

    public static String reverseString(String n,int start)
    {
        if(start == n.length()-1)
        {
            return n;
        }
        else{
            return reverseString(n,start+1) + n.charAt(start);
        }
    }
}