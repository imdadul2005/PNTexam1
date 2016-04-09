package math;

import java.util.Scanner;

/**
 * Created by mrahman on 4/9/16.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

        System.out.println("Type a number which you want to fine the factorial for ");
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        System.out.println("factorial of "+ x + " is " + factorial(x));



    }

    public static int factorial(int N) {
        if (N == 1) return 1;
        return N * factorial(N-1);
    }
}