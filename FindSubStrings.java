/*
Description
Given a String x, a substring m from x and a number n, write a recursive method
(no loops) to check if at least n copies of the substring m appear in the String x.
You should call your method checkForSub. checkForSub should take in 2 Strings and an
Integer value and return a Boolean.

For Example:

checkForSub("catcowcat", "cat", 2) -> true
checkForSub("catcowcat", "cow", 2) -> false
checkForSub("catcowcat", "cow", 1) -> true
Input
    x, m, n, where x and m are Strings, n is an Integer
Sample Input
    catcowcat cat 2
Output
    A Boolean value
Sample Output
    true
 */
import java.util.Scanner;
public class FindSubStrings
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(checkForSub(a,b,n));
    }
    public static boolean checkForSub(String a , String b,int n)
    {
        if(n == 0)
        {
            return true;
        }
        else if(a.length()< b.length())
        {
            return false;
        }
        else if(a.substring(0,b.length()).equals(b))
        {
            return checkForSub(a.substring(b.length()), b, n-1);
        }
        else
        {
            return checkForSub(a.substring(1),b,n);
        }
    }
}