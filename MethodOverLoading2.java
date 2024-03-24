/*
Description
Write a Java program, called MethodOverloading that contains 5 static methods called manipulation(). Each of these methods will take in different parameters as below. They should all return a String and achieve the matching description (see below):

manipulation (String) -> Remove all whitespace from the String.
manipulation (String, char) -> Remove all instances of the given character from the String.
manipulation (String, int) -> Remove all instances in the String of the character from the given index from the String.
manipulation (String, int, int) -> Remove all characters between the given indices (exclusive) from the String.
manipulation (String, char, char) -> Remove all characters between the given characters (exclusive) from the String. This should happen between the first instance of the first character and the last instance of the second character in the String and if the characters are the same it should remove everything between the first and last instance of the character.
manipulation (String, char, int) -> Remove all characters from the start of the String up to the xth character given. For example: given manipulation("cuckoo", 'c', 2) the method would remove all characters before the second c that occurs in the string. The output would then be "ckoo".
Each manipulation method should be called from the main method and should work irrespective of case. All output should be printed in lower case. NOTE: Output must match exactly
Input
    n m x x1 c c1

    where n is the number of words in the string, m is the string, x and x1 are
    integer values and c and c1 are characters.

NOTE 2: You are given the number of words for a reason, it would be difficult to take input otherwise. You will need to take the String m in word by word.
Sample Input
    6
    THE CAT SAT ON THE MAT
    1
    12
    a
    m
Output
    A print statement for each method.
Sample Output
    thecatsatonthemat
    the ct st on the mt
    te cat sat on te mat
    thon the mat
    the camat
    at sat on the mat
 */
import java.util.Scanner;
public class MethodOverLoading2
{
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String words = sc.nextLine();
        int word = Integer.parseInt(words);
        String sen = sc.nextLine();
        sen = sen.toLowerCase();
        int x = sc.nextInt();
        int x1 = sc.nextInt();
        char c = sc.next().charAt(0);
        char c1 = sc.next().charAt(0);

        String result1 = manipulation(sen);
        String result2 = manipulation(sen, c);
        String result3 = manipulation(sen, x);
        String result4 = manipulation(sen, x, x1);
        String result5 = manipulation(sen, c, c1);
        String result6 = manipulation(sen, c, x);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

    }

    public static String manipulation(String a)
    {
        return a.replace(" ", "");
    }
    public static String manipulation(String a, char b)
    {
        return a.replace(String.valueOf(b) , "");
    }
    public static String manipulation(String a, int b)
    {
        char c = a.charAt(b);
        return a.replace(String.valueOf(c) , "");
    }
    public static String manipulation(String a,int b, int c)
    {

        String new1 = a.substring(0,b+1);
        String new2 = a.substring(c);
        return new1 + new2;
    }
    public static String manipulation(String a, char b, char c)
    {

        int first = a.indexOf(b);
        int last = a.lastIndexOf(c);

        String new1 = a.substring(0,first+1);
        String new2 = a.substring(last);
        return new1 + new2;

    }

    public static String manipulation(String a,char b, int c)
    {
        int count = 0;
        int index = 0;
        for(int i = 0; i<a.length(); i++)
        {
            if(a.charAt(i) == b)
            {
                count++;
                if(count == c)
                {
                    index = i;
                    break;
                }
            }
        }
        String new1 = a.substring(index);
        return new1;
    }
}