package JDBC;

import Exceptions.DateException;
import Exceptions.GenderException;
import StudentReg.Gender;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class RecordOperations {
    Scanner scanner=new Scanner(System.in);
    public Student getStudentDetails() throws DateException, GenderException {
        System.out.println("Provide student details below:");
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Reg. #: ");
        String regNo = scanner.nextLine();
        System.out.println("Enter date of birth: (dd/MM/yyyy)");
        String d = scanner.nextLine();
        System.out.println("Enter your Course:");
        String courses=scanner.nextLine();
        System.out.println("Enter your Date of admission:");
        String doa=scanner.nextLine();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Enter gender: (Male or Female)");
        Gender gender = Gender.valueOf(scanner.nextLine());
        try {
            return new Student(name,regNo,simpleDateFormat.parse(d),courses,simpleDateFormat.parse(doa),gender);
        }catch (Exception e) {
            throw new DateException();
        }

    }
    public String search(){
        System.out.println("Enter registration number");
        String searchreg = scanner.nextLine();
        return searchreg;
    }

    public String delete() {
        System.out.println("Enter registration number");
        String delete=scanner.nextLine();
        return delete;
    }
}
