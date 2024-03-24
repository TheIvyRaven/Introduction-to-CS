/*
Description
Write a Java program, called VariousArrayTasks that has 4 static methods called
fillArray(), sumArray(), avgArray(), and printArray().

The fillArray() method should use a Scanner to take in a number representing
the length of the array and then read in numbers to fill the array.
This array will be an int array.

The fillArray() method should take no input and return an int array.
It should be called from the main method.

The sumArray() method should take an int array as its input parameter
and returns an integer value that is the sum of all the elements in the array.

The avgArray() method should take an int array as its input parameter
and return a double value that is the average of all the elements in the array.

The printArray() method should take an int array as its input parameter
and has no return value. It should then print out the elements of the array on the
same line separated by a space (“ “). All methods should work for integer arrays.

Input
    n , where n is the length of the array, followed by n numbers
Sample Input
    3 2 3 4
Output
    The program should print to the screen the sum of all the elements in the
    array, and the average of all the elements in the array followed by the array
    elements printed to the screen separated by a space.
Sample Output
    Sum = 9
    Average = 3.0
    2 3 4
Note: In the fillArray method you should close your Scanner
when you are finished taking input. Please ask your demonstrator to explain this.
The Message for sum is: “Sum = “ and the message for average is: “Average = “.
In your code these should match EXACTLY to pass all test cases
 */
import java.util.Scanner;
public class VariousArrayTasks
{
    public static void main(String [] args)
    {
        int [] array = fillArray();

        int sum = sumArray(array);
        System.out.println("Sum = "+ sum);

        double avg = avgArray(array);

        System.out.println("Average = "+ avg);

        printArray(array);

    }

    public static int[] fillArray()
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0; i <size; i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        return arr;
    }

    public static int sumArray(int [] array)
    {
        int sumarr = 0;
        for(int i = 0; i<array.length;i++)
        {
            sumarr += array[i];
        }
        return sumarr;
    }

    public static double avgArray(int [] array)
    {
        int addition = 0;
        for(int i = 0; i<array.length;i++)
        {
            addition += array[i];
        }
        //double average = addition/array.length;
        return (double) addition/array.length;
    }

    public static void printArray(int [] array)
    {
        //System.out.println();
        for(int i = 0; i<array.length;i++)
        {

            System.out.print(array[i] + " ");
        }
    }
}