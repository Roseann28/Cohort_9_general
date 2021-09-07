package Input_and_output;

import java.io.*;
import java.util.Calendar;

public class ReaderandBuffer {
    private static void simpleFileCopy() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("src\\input_and_output\\10MB.txt"); /// input file
        FileOutputStream fileOutputStream = new FileOutputStream("src\\input_and_output\\dest.txt"); // output file
        int c;
        while ((c = fileInputStream.read()) != -1) // loop through the input file reading it
        {
            fileOutputStream.write(c); // write to the output file for every read
        }
        fileInputStream.close(); //close input
        fileOutputStream.close(); // close output
    }
    private static void advancedFileCopy() throws IOException {
        FileReader fileReader = new FileReader("src\\input_and_output\\10MB.txt");
        FileWriter fileWriter = new FileWriter("src\\input_and_output\\dest_large.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        String s;
        while ((s = bufferedReader.readLine()) != null)
            bufferedWriter.write(s + "\n");
        fileReader.close();
        fileWriter.close();
    }
    public static void main(String[] args) throws IOException {
        // Download large text files 5MB
        // compute the performance difference between simpleFileCopy and advancedFileCopy
        // Take time now - startTime
        // Execute method
        // Take time now - endTime
        // Difference (endTime - startTime)
        Calendar c = Calendar.getInstance();
        long startTime = System.nanoTime();
        simpleFileCopy();
        long endTime = System.nanoTime();
        System.out.println("simpleFileCopy: " + (endTime - startTime));

        startTime = System.nanoTime();
        advancedFileCopy();
        endTime = System.nanoTime();
        System.out.println("AdvanceFileCopy: " + (endTime - startTime));

    }
}

