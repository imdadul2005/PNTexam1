package string.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mrahman on 4/9/16.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        st = st.replace('.', ' ');
        String[] stString = st.split(" ");
       // st.r
        Map<String, Integer> wordBank = new HashMap<String, Integer>();
        float averageLPW = 0f;
        int totalWordCount =0;
        int totalCharCount =0;


        for (int i = 0; i < stString.length; i++) {
            // Only add to HashMap if String is not null
            int numOfSameWord;

            if (!stString[i].isEmpty()) {
                String word = stString[i];
                // Need to check if word already exist
                totalCharCount = totalCharCount + word.length();
                totalWordCount ++;
                if (wordBank.containsKey(word)) {
                    numOfSameWord = wordBank.get(word);
                    numOfSameWord++;
                    wordBank.put(word, numOfSameWord);
                } else
                    wordBank.put(word, 1);
            }
        }

        averageLPW = (float) totalCharCount/totalWordCount;
        System.out.println("wordBank = " + wordBank);
        System.out.println("Average lenght of word is : " + averageLPW) ;
    }

    public void timeOfOccurance (Map<String, Integer> wordBank){

    }
}




