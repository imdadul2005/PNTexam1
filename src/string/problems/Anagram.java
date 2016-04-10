package string.problems;

import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String firstWord;
        String secondWord;

        Scanner Input = new Scanner(System.in);
        System.out.println("Type the First word");
        firstWord = Input.nextLine();
        System.out.println("Type the Second word");
        secondWord = Input.nextLine();

        //Check if the number of two String are same
        if (!isNumberOfCharSame(firstWord,secondWord))
        {
            System.out.println("This two word is not Anaram");
            System.exit(0);
        }

        //Check is the char are same on this two word
        if (!isSameChar(firstWord, secondWord))
            System.out.println("Opes not a Anagram Word");
        else
            System.out.println("You have found an Anagram word");
    }

    public static boolean isNumberOfCharSame(String first, String second){
        return  (first.length()==second.length());
    }

    public static boolean isSameChar(String first, String second) {
        //change first string to an array
        char[] firstCharArray = first.toCharArray();
        boolean result = false;
        for (int i = 0; i < firstCharArray.length; i++) {
            String temp = "" + firstCharArray[i];
            result = second.contains(temp);
        }
        return result;
    }
}
