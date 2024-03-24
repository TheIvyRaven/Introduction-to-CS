/*
In a class, write a method called printStarTriangle() that accepts an integer parameter and returns nothing. This method should print to the screen rows of asterisk characters that form the shape of a triangle. The amount of rows is based on the value of the integer parameter. The first row should start with one * and increment by one * for each row there after.

For example, if the parameter held the value 3 the method would print:

    *
    **
    ***
In the main method you should call the method with a user inputted integer being passed into printStarTriangle().

Sample Input
    3
Sample Output
    *
    **
    ***
 */
import java.util.Scanner;
public class Stars
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = 1;

        printStarTriangle(row,col);
    }

    public static int printStarTriangle(int a , int b)
    {
        int r = 1;

        while(r <= a)
        {
            b = 1;

            while(b <=r)
            {
                System.out.print("*");
                b++;
            }
            System.out.println("");
            r++;
        }
        int result = a + b;
        return result;
    }
}