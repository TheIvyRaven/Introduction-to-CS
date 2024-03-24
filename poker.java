/*
Description
In Poker, a "full house" occurs when your five cards contain three of one card and two of another.
For example: "K", "K", "5", "K", "5" would be a full house as there are 3 Kings and two 5's.

Create a method that determines if a "hand" of 5 cards (which you can take in in your main method,
stored in an array) is a full house. This method should be called fullHouseCheck.
It will take an array as input and will return nothing.
If it is a full house, you should print which card is the 3 of a kind,
and which card is the two of a kind. Otherwise you should print "Not a full house".

Sample Input 1
    A
    A
    A
    K
    K
Sample Output 1
    3 of a kind: A
    2 of a kind: K
Sample Input 2
    3
    J
    3
    J
    3
Sample Output 2
    3 of a kind: 3
    2 of a kind: J
Sample Input 3
    10
    J
    10
    10
    10
Sample Output 3
    Not a full house
 */
import java.util.Scanner;
public class poker
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] a = new String[5];

        for(int i =0; i< 5; i++)
        {
            a[i] = sc.nextLine();
        }

        fullHouseCheck(a);
    }
    public static void fullHouseCheck(String[] a)
    {
        int[] count = new int[13];

        for(String card : a)
        {
            int index = getCardIndex(card);
            count[index]++;
        }
        boolean hasThree = false;
        boolean hasTwo = false;
        String hasThreeKind = "";
        String hasTwoKind = "";

        for(int i =0; i< count.length; i++)
        {
            if(count[i] ==3)
            {
                hasThree = true;
                hasThreeKind = getCardValue(i);
            }
            else if(count[i] == 2)
            {
                hasTwo = true;
                hasTwoKind = getCardValue(i);
            }
        }

        if(hasThree && hasTwo)
        {
            System.out.println("3 of a kind: " + hasThreeKind);
            System.out.println("2 of a kind: " + hasTwoKind);
        }
        else
        {
            System.out.println("Not a full house");
        }
    }

    public static int getCardIndex(String card)
    {
        switch(card)
        {
            case "2": return 0;
            case "3": return 1;
            case "4": return 2;
            case "5": return 3;
            case "6": return 4;
            case "7": return 5;
            case "8": return 6;
            case "9": return 7;
            case "10": return 8;
            case "J": return 9;
            case "Q": return 10;
            case "K": return 11;
            case "A": return 12;
            default: return -1;
        }
    }

    public static String getCardValue(int index)
    {
        switch(index)
        {
            case 0: return "2";
            case 1: return "3";
            case 2: return "4";
            case 3: return "5";
            case 4: return "6";
            case 5: return "7";
            case 6: return "8";
            case 7: return "9";
            case 8: return "10";
            case 9: return "J";
            case 10: return "Q";
            case 11: return "K";
            case 12: return "A";
            default: return "";
        }
    }
}
