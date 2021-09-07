package FileOperations;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class Another {
    public static void main(String[] args) throws ParseException, IOException,NullPointerException {
        viewStudent();
    }

    private static void viewStudent() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\FileOperations\\student.txt"));
        List<String> listOfLines = new ArrayList<String>();
        String line = bufferedReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufferedReader.readLine();
            System.out.println(listOfLines);
            listOfLines=new ArrayList<String>();
        }
    }
}

