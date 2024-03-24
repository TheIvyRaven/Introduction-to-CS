/*
Description
Write a Java program, called FiveOrMore that takes a String as user input.
The program should then reverse every word in the String that has a
length greater than or equal to five.

Sample Input
    Just keep swimming
Sample Output
    Just keep gnimmiws
 */
import java.util.Scanner;
public class FiveOrMore
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        System.out.println(FiveString(a));
    }

    public static String FiveString(String a)
    {
        String [] words = a.split(" ");
        String result = "";

        for(int i =0; i< words.length; i++)
        {
            if(words[i].length() >= 5)
            {
                for(int j = words[i].length()-1; j>=0; j--)
                {
                    result += words[i].charAt(j);
                }
                words[i] = result;
                result = "";
            }
        }
        return result = String.join(" ", words);
    }
}
