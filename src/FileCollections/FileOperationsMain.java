package FileCollections;

import Exceptions.DateException;
import Exceptions.GenderException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class FileOperationsMain {
    public static void main(String[] args) throws DateException, GenderException, IOException {
        int choice;
        Scanner scanner;
        System.out.println("Welcome to Student Management System!\n");
        do {
            System.out.println("\n1. Add Student\n" +
                    "2. Search Student\n" +
                    "3. Delete Student\n" +
                    "4. View Students\n" +
                    "0. Exit\n");
            scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    Student s = getStudentDetails(scanner);
                    writeToFile(s);
                    break;
                case 2:
                    System.out.println("Enter registration number");
                    String searchreg = scanner.nextLine();
                    searchFile(searchreg);
                    break;
                case 3:
                    System.out.println("Enter registration number");
                    String delete=scanner.nextLine();
                    deleteStudentMethod(delete);
                    break;
                case 4:
                    viewStudent();
                    break;
            }
        } while (choice != 0);
    }




    private static Student getStudentDetails(Scanner scanner) throws DateException, GenderException {
        System.out.println("Provide student.txt details below:");
        System.out.println("Enter Reg. #: ");
        String regNo = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth: (dd/MM/yyyy)");
        String d = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter gender: (Male or Female)");
        String gender = scanner.nextLine();
        try {
            return new Student(regNo, name, simpleDateFormat.parse(d), gender);
        }catch (ParseException e){
            throw new DateException();
        }catch (IllegalArgumentException e){
            throw new GenderException();
        }

    }

   /** private static Student storeDetails(Scanner scanner) throws ParseException {
        System.out.println("Provide student.txt details below:");
        System.out.println("Enter Reg. #: ");
        String regNo = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter date of birth: (dd/MM/yyyy)");
        String d = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter gender: (Male or Female)");
        String gender = scanner.nextLine();


        /**LinkedList<Student> linkedList = new LinkedList<Student>();
        Student student = new Student(regNo, name, simpleDateFormat.parse(d), gender);
        linkedList.add(student);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());


        return new Student(regNo, name, simpleDateFormat.parse(d), gender);
    }**/

    private static void writeToFile(Student s) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\FileCollections\\student.txt", true); // output file
        for (int i = 0; i < s.toString().length(); i++) // loop through the input file reading it
        {
            fileOutputStream.write(s.toString().charAt(i)); // write to the output file for every read
        }
        char newLine = '\n';
        fileOutputStream.write(newLine);
        fileOutputStream.close(); // close output
    }

    /**private static void readStudents() throws IOException, ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream("src\\FileOperations\\student.txt");
        int c;
        while ((c = fileInputStream.read()) != -1) {
            char ch = (char) c;
            if (ch != '\n')
                stringBuilder.append(ch);
            else {
                Student s = parseStudent(stringBuilder);
                //System.out.println(s.hashCode());
                System.out.println(s);
                stringBuilder = new StringBuilder();
            }
        }
        if (stringBuilder.length() > 0) {
            Student s = parseStudent(stringBuilder);
            System.out.println(s);
        }
        fileInputStream.close();
    }**/

    private static Student parseStudent(StringBuilder stringBuilder) throws DateException, GenderException {
        String[] studentData = stringBuilder.toString().split(",");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            return new Student(studentData[0].trim(), studentData[1].trim(), simpleDateFormat.parse(studentData[3].trim()), studentData[2].trim());
        }catch (ParseException e){
            throw new DateException();
        }catch (IllegalArgumentException e){
            throw new GenderException();

        }

    }

    /**public static void lists(String searchreg) throws IOException, ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream("src\\FileOperations\\student.txt");
        int c;
        LinkedList<Student> linkedList = new LinkedList<Student>();
        while ((c = fileInputStream.read()) != -1) {
            char ch = (char) c;
            if (ch != '\n')
                stringBuilder.append(ch);
            else {
                Student s = parseStudent(stringBuilder);
                linkedList.add(s);
                /**Boolean found=linkedList.contains(searchreg);
                if (found.equals(true)){
                    System.out.println(linkedList);
                }else {
                    System.out.println("UNAVAILABLE");
                }
                stringBuilder = new StringBuilder();
                linkedList = new LinkedList<Student>();
            }
        }

        /**if (stringBuilder.length() > 0) {
            Student s = parseStudent(stringBuilder);
            linkedList.add(s);
            System.out.println(linkedList);
        }

        fileInputStream.close();
    }
    private static void deletemethod(String filename, String deleteregistration) throws IOException {
        String temporaryfile = "src\\FileOperations\\newstudentfile.txt";
        File oldFile = new File(filename);
        File newFile = new File(temporaryfile);
        String regNo = "";
        String name = "";
        String dateOfBirth = "";
        String gender = "";
        Scanner scanner;
        try {
            FileWriter fileWriter = new FileWriter(temporaryfile, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            scanner = new Scanner(new File(filename));
            scanner.useDelimiter("[,\n]");
            while (scanner.hasNext()) {
                regNo = scanner.next();
                name = scanner.next();
                dateOfBirth = scanner.next();
                gender = scanner.next();
                if (!regNo.equals(deleteregistration)) {
                    printWriter.println(regNo + "," + name + "," + dateOfBirth + "," + gender);
                }
                scanner.close();
                printWriter.flush();
                printWriter.close();
                oldFile.delete();
                File dump = new File(filename);
                newFile.renameTo(dump);

            }

        } catch (Exception exception) {


        }
    }**/

    private static void searchFile( String searchreg) throws FileNotFoundException {
        String buffer="";
            Scanner scanner=new Scanner(new File("src\\FileCollections\\student.txt"));
            while (scanner.hasNext()){
                buffer=scanner.nextLine();
                String [] splittedLine=buffer.split(",");
                if (splittedLine[0].equals(searchreg)){
                    System.out.println(buffer);
                }
            }
            scanner.close();

    }/**
    private static void deleterecord( String searchreg) throws FileNotFoundException {
        String buffer="";
        String temporaryfile = "src\\FileOperations\\newstudent.txt";
        try{
            Scanner scanner=new Scanner(new File("src\\FileOperations\\student.txt"));
            FileWriter fileWriter = new FileWriter(temporaryfile, true);
            while (scanner.hasNext()){
                buffer=scanner.nextLine();
                String [] splittedLine=buffer.split(",");
                if (!(splittedLine[0].equals(searchreg))){
                    fileWriter.write(buffer);
                    fileWriter.write('\n');
                    System.out.println(buffer);
                }
            }
            scanner.close();
            fileWriter.close();

        }catch (Exception e){
            System.out.println("ERROR");
        }

    }**/

    private static void viewStudent() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\FileCollections\\student.txt"));
        List<String> listOfLines = new ArrayList<String>();
        String line = bufferedReader.readLine();
        while (line != null) {
            listOfLines.add(line);
            line = bufferedReader.readLine();
            System.out.println(listOfLines);
            listOfLines=new ArrayList<String>();
        }
        bufferedReader.close();

    }
    private static void deleteStudentMethod(String delete) throws IOException {
        FileWriter fileWriter=new FileWriter("src\\FileCollections\\student1.txt");
        BufferedReader bufferedReader=new BufferedReader(new FileReader("src\\FileCollections\\student.txt"));
        File rename=new File("src\\FileCollections\\student.txt");
        File old=new File("src\\FileCollections\\student1.txt");
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
        Files.move(Paths.get("student.txt"),Paths.get("src\\FileCollections\\student.txt"));
    }
}


