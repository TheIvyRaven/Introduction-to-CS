/*
Description
Write a method that returns the number of vowels in a string recursively.
You should call your method vowelCount

Sample Input 1
apple

Sample Output 1
2

Sample Input 2
Computer science

Sample Output 2
6
 */
import java.util.Scanner;
public class Vowels
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String in = new String(sc.nextLine());
        System.out.println(vowelCount(in));


    }

    public static int vowelCount(String a)
    {
        int count =0;
        if(a.length() <=0)
        {
            return 0;
        }
        if((a.charAt(0) == 'a') || (a.charAt(0) == 'e') || (a.charAt(0) == 'i') || (a.charAt(0) == 'o') || (a.charAt(0) == 'u') || (a.charAt(0) == 'A'))
        {
            count++;

        }
        return count + vowelCount(a.substring(1));


    }
}
