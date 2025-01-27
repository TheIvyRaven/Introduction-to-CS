/*
Description
Write a method that takes a String as a parameter and prints to the screen which of the
regular expressions shown below is satisfied by the String. The String can only contain
the characters a and b and you must use the .matches(<...>) method with a regular expression.
The method doesn't have to return anything.

Regular Expression No.	Regular Expression
1:	a(b|a)b
2:	(ab)*b
3:	a(b|a)*
4:	((a|b)a)*
If the String satisfies more than one regular expression print it on a new line.
See output. If the String does not satisfy any expression have a valid print statement
in your main method call the method with user input.

Sample Input 1
    abb
Sample Output 1
    1
    2
    3
Sample Input 2
    ababad
Sample Output 2
    Not in the language
 */
import java.util.Scanner;
public class WhichExpression
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int count = 0;

        if(input.matches("a(b|a)b"))
        {
            System.out.println("1");
            count++;
        }

        if(input.matches("(ab)*b"))
        {
            System.out.println("2");
            count++;
        }

        if(input.matches("a(b|a)*"))
        {
            System.out.println("3");
            count++;
        }

        if(input.matches("((a|b)a)*"))
        {
            System.out.println("4");
            count++;
        }

        if(count==0)
        {
            System.out.println("Not in the language");
        }
    }


}