package reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	public static void main(String[] args) {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class. 
		 * Use try....catch block to handle Exception.
		 */

		String textFile = System.getProperty("user.dir") + "\\src\\data\\self-driving-car";

		FileReader myFile = null;
        BufferedReader myBR = null;

        try {
            myFile = new FileReader(textFile);
            myBR = new BufferedReader(myFile);
            String lines = " ";
            try {
                while ((lines = myBR.readLine())!= null){
                    System.out.println(lines);
                }
            } catch (IOException e) {
                System.err.println("Buffer Reader can not read the file");
            }
        } catch (FileNotFoundException e) {
            System.out.println("System can not find the file");
        }


        finally {
            try {
                if (myBR!=null)
                        myBR.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (myFile!=null)
                        myFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

}
