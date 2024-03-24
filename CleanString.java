/*
Description
Given a user inputted String write a recursive method (no loops) to "clean" the String.
A "cleaned" String is one where only adjacent characters that are the same have been
reduced to a single char. So "yyzzza" yields "yza". You should call your method cleanString.

For Example:

cleanString("yyzzza") -> "yza"
cleanString("ggoonnee") -> "gone"
cleanString("Hello") -> "Helo"
Input
    n, where n is a String
Sample Input
    yyzzza
Output
    A "cleaned" String
Sample Output
    yza
 */
import java.util.Scanner;
public class CleanString
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = new String(sc.nextLine());

        System.out.print(cleanString(input));

    }

    public static String cleanString(String a)
    {

        if(a.length()<=1)
        {
            return a;
        }
        else
        {
            if(a.charAt(0) == a.charAt(1))
            {
                return cleanString(a.substring(1));
            }
            else
            {
                return a.charAt(0) + cleanString(a.substring(1));
            }
        }
    }
}