/*
Description
In a java program, write a method called isPalindrome() that accepts a String parameter and returns a Boolean. This method should check if the String is a Palindrome and return an appropriate boolean value. Your method should work irrespective of case. In the main method, you should call the method with a user inputted String being passed into isPalindrome().

Sample Input 1
    NaVAn
Sample Output 1
    NAVAN is a Palindrome
Sample Input 2
    Cavan
Sample Output 2
    Cavan is NOT a Palindrome
 */
import java.util.Scanner;
public class Palindromes
{
    public static void main(String [] args)
    {
        isPalindrome();
    }
    public static void isPalindrome()
    {
        Scanner sc = new Scanner(System.in);
        String text = new String(sc.nextLine());
        String textR = new String("");

        int len = text.length();

        for(int pos = len-1; pos>= 0; pos--)
        {
            textR = textR + text.charAt(pos);
        }

        if(text.equalsIgnoreCase(textR) == true)
        {
            System.out.println(text.toUpperCase() + " is a Palindrome");
        }
        else
        {
            System.out.println(text.toUpperCase() + " is NOT a Palindrome");
        }
    }
}