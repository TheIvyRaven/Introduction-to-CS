/*
Description
Write a recusrive method (no loops), called moreAs, which takes a String.
This method should add in 2 more a's every time an a is found in the String.

Sample Input 1
    catalogue
Sample Output 1
    caaataaalouge
Sample Input 2
    anagram
Sample Output 2
    aaanaaagraaam
 */
import java.util.Scanner;
public class AddAs
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(moreAs(input));
    }

    public static String moreAs(String input)
    {
        if(input.length()==0)
        {
            return "";
        }
        else
        {
            return input.replace("a","aaa");
        }
    }
}

