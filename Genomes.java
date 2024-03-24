/*
Human and all other genomes are made up of sequences of millions of chemicals,
represented by the four letters c, g, a and t.

Description
Write a method that accepts a String as a parameter and returns a boolean.
The method should return true if the String taken as a parameter contains
just the genome's characters and otherwise false.

The method should use the .matches(<...>) method with a regular expression.

In the main method call the method with user input, and print to the screen the method's return value.

Sample Input 1
    tgacagtc
Sample Output 1
    true
Sample Input 2
    agaxatca
Sample Output 2
    false
 */
import java.util.Scanner;
public class Genomes
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String nome = new String("");
        boolean result = genomecheck(nome = sc.nextLine());

        System.out.println(result);


    }

    public static boolean genomecheck(String a)
    {
        boolean condition = true;
        if(a.matches("[cgat]*"))
        {
            condition = true;
        }
        else
        {
            condition = false;
        }
        return condition;
    }
}
