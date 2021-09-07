package FileOperations;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileOperationsArrayList {
    public static void main(String[] args) throws ParseException, IOException,NullPointerException {
        Scanner scanner=new Scanner(System.in);
        String delete=scanner.nextLine();
        deleteStudentMethod(delete);


    }

    private static void deleteStudentMethod(String delete) throws IOException {
        FileWriter fileWriter=new FileWriter("src\\FileOperations\\student1.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader("src\\FileOperations\\student.txt"));
        File rename=new File("src\\FileOperations\\student.txt");
        File old=new File("src\\FileOperations\\student1.txt");
        String files="student.txt";
        List<String> listOfLines=new ArrayList<String>();
        String line=bufferedReader.readLine();
        while(line !=null){
                listOfLines.add(line);
                String [] splittedLine=line.split(",");
                if (splittedLine[0].equals(delete)){
                    listOfLines.remove(line);
                }
                line=bufferedReader.readLine();
                for (String s: listOfLines){
                    fileWriter.write(s + ('\n'));

                }
                listOfLines=new ArrayList<String>();

        }
        bufferedReader.close();
        fileWriter.close();
        File temp=new File(files);
        rename.delete();
        old.renameTo(temp);
        Files.move(Paths.get("student.txt"),Paths.get("src\\FileOperations\\student.txt"));
    }
}
