/*
Description
Write a Java program, called MethodOverload that contains 5 static methods called area().
Each of these methods will calculate the area of a user inputted shape;
they will take in different parameters as below.
They should all return a double and calculate the area of the corresponding shape (formulas given):

area(int) -> Area of a Square = len^2. len is the length of a side.

area(int, int) -> Area of a Rectangle = w*h. w is the width of a side and h is the height.

area(double, int) -> Area of an Triangle = (1/2)*b*h. b is the base and h is the height.

area(double) -> Area of a Circle = pi*r^2. r is the radius of the circle.

area(double, double) -> Area of an Ellipse = pi*a*b. a is (1/2) the length of the major axis
and b is (1/2) the length of the minor axis. The major and minor axis will be given in the question.
The main method should take in user input to determine what shape the area needs to be calculated for.
 Depending on the shape given the program should then take in the correct parameters from the user
 (see Example below). Each input will be given in the order given in the descriptions above.
 You should also have an output if a non valid shape was entered. use "Not a valid shape!" as this message.

NOTE: you can use Math.PI to get the value of pi in Java, and Math.pow(x,y)
can be used for x to the power of y.

Example

"Square 4" would determine that you are required to find the area of a square with a side length of 4.

"Rectangle 4 4" would determine that you are required to find the area of a rectangle with width and height 4.

Input
  n
  x
  where n is a String representing the shape, x is the number to go with the shape.
Sample Input
  Square
  4
Output
    The area of a square with side of length 4
Sample Output
    Area: 16.0
 */
import java.util.Scanner;
public class MethodOverload1
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        if(shape.equalsIgnoreCase("square"))
        {
            int length = Integer.parseInt(sc.nextLine());
            double area = area(length);

            System.out.println("The area of a square with side of length " + length);
            System.out.println("Area: " + area);
        }

        if(shape.equalsIgnoreCase("rectangle"))
        {
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());

            double area = area(a,b);

            System.out.println("The area of a rectangle with side of length " + a +" and width " + b);
            System.out.println("Area: " + area);
        }

        if(shape.equalsIgnoreCase("triangle"))
        {
            double b = Double.parseDouble(sc.nextLine());
            int h = Integer.parseInt(sc.nextLine());

            double area = area(b,h);

            System.out.println("The area of a triangle with base " + b +" and height " + h);
            System.out.println("Area: " + area);
        }

        if(shape.equalsIgnoreCase("circle"))
        {
            double r = Double.parseDouble(sc.nextLine());

            double area = area(r);

            System.out.println("The area of a circle with radius " + r);
            System.out.println("Area: " + area);
        }

        if(shape.equalsIgnoreCase("ellipse"))
        {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());

            double area = area(a,b);

            System.out.println("The area of an elipse with major axis " + a +" and minor axis " + b);
            System.out.println("Area: " + area);
        }
        else
        {
            System.out.println("Not a valid shape!");
        }
    }

    public static double area(int a)
    {
        int area = a*a;
        return area;
    }

    public static double area(int a , int b)
    {
        int area = a*b;
        return area;
    }

    public static double area(double b , int h)
    {
        double area = (0.5*b*h);
        return area;
    }

    public static double area(double a)
    {
        double area = Math.PI*Math.pow(a,2);
        return area;
    }

    public static double area(double a , double b)
    {
        double area = Math.PI*(a*0.5)*(b*0.5);
        return area;
    }
}