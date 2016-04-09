package math;

import java.util.Arrays;

/**
 * Created by mrahman on 4/9/16.
 */
public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10,2,1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Use some static helper method to find it.
         */
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        Arrays.sort(array);   //Sort the array before checking any values


        for(int i = 0; i<array.length;i++){
            int next = array[i]+1;
            if (i+1!=array.length) {          // case to handle any outofArray
                if (next != array[i + 1]) {
                    System.out.println("Missing number is  " + next);
                    break;
                }
            }
            else
                System.out.println("Missing number is  " + next);
        }

    }
}
