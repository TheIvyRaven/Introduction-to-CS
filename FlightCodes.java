/*
Description
Write a Java program that requests a user to enter a flight code.
The program should verify that the user enters a valid flight code.
A valid flight code begins with 2 or 3 capital letters and is followed by 3 or 4 digits.

This program should use the .matches(<...>) method with a regular expression.

If the user does not enter a valid code, your program should continually request
that they enter a valid flight code until a valid code is entered.

NOTE: Your output should exactly match the expected output.

Sample Run of Program 1
    EI320                      //user input
    Flight code is valid       //output based on value of code
Sample Run of Program 2
    rea4121                    //user input
    Flight code is NOT valid   //output based on value of code
    REA4121                    //user input
    Flight code is valid       //output based on value of code
 */
import java.util.Scanner;
public class FlightCodes
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        boolean condition = true;

        while(condition)
        {
            String code = new String(sc.nextLine());

            if(code.matches("^[A-Z]{2,3}[0-9]{3,4}$"))
            {
                System.out.println(code);
                System.out.println("Flight code is valid");

                condition = false;
            }
            else
            {
                System.out.println(code);
                System.out.println("Flight code is NOT valid");
            }
        }
    }
}
