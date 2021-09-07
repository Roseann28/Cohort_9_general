package FileOperations;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {/**
    public static void main(String[] args) throws IOException, ParseException {
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
            switch (choice)
            {
                case 1:
                    Student s = getStudentDetails(scanner);
                    writeToFile(s);
                    break;
                case 2:
                    String filename="student.txt";
                    String searchreg="C026-01-1767/2018";
                    searchFile(filename,searchreg);
                    break;
                case 3:
                    break;
                case 4:
                    readStudents();
                    break;
            }
        } while (choice != 0);
        Student s = new Student("S13/20011/06");
        Student s1 = new Student("S13/20011/07");
        // compare two students?

        //hashing odd + mod
        //Student s2 = (Student) s.clone();
        System.out.println();
        System.out.println(s1.hashCode());
        if (s.equals(s1))
            System.out.println("objects are same");
        else
            System.out.println("objects are different");
    }

    private static void searchFile(String filename,String searchreg) {
        String tempfile="temp.txt";
        File oldfile= new File(filename);
        File newfile=new File(tempfile);
        try {
            FileOutputStream fileOutputStream=new FileOutputStream(tempfile,false);

        }

    }

    private static void readStudents() throws IOException, ParseException {
        StringBuilder stringBuilder = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream("src\\FileOperations\\student.txt");
        int c;
        while ((c = fileInputStream.read()) != -1)
        {
            char ch = (char) c;
            if (ch != '\n')
                stringBuilder.append(ch);
            else
            {
                Student s = parseStudent(stringBuilder);
                System.out.println(s.hashCode());
                System.out.println(s);
                stringBuilder = new StringBuilder();
            }
        }
        if (stringBuilder.length() > 0)
        {
            Student s = parseStudent(stringBuilder);
            System.out.println(s);
        }
        fileInputStream.close();
    }

    private static Student parseStudent(StringBuilder stringBuilder) throws ParseException {
        String[] studentData = stringBuilder.toString().split(",");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        return new Student(studentData[0].trim(), studentData[1].trim(), simpleDateFormat.parse(studentData[3].trim()), studentData[2].trim());
    }

    private static Student getStudentDetails(Scanner scanner) throws ParseException {
        System.out.println("Provide student.txt details below:");
        System.out.println("Enter Reg. #: ");
        String regNo = scanner.nextLine();
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        // Capture date
        System.out.println("Enter date of birth: (dd/MM/yyyy)");
        String d = scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Gender
        System.out.println("Enter gender: (Male or Female)");
        String gender = scanner.nextLine();
        //....
        return new Student(regNo, name, simpleDateFormat.parse(d), gender);
    }

    private static void writeToFile(Student s) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("src\\FileOperations\\student.txt", true); // output file
        for (int i = 0; i < s.toString().length(); i ++) // loop through the input file reading it
        {
            fileOutputStream.write(s.toString().charAt(i)); // write to the output file for every read
        }
        char newLine = '\n';
        fileOutputStream.write(newLine);
        fileOutputStream.close(); // close output
    }
}**/
}
