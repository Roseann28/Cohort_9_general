package StudentReg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws ParseException {
        String a="10";
        System.out.println(Integer.parseInt(a,2));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Welcome to school");

        System.out.println("Enter your name:");
        String names=scanner.nextLine();

        System.out.println("Enter your registration number:");
        String regNo=scanner.nextLine();

        System.out.println("Enter your Date of birth:");
        String dob =scanner.nextLine();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter your Course:");
        String courses=scanner.nextLine();

        System.out.println("Enter your Date of admission:");
        String doa=scanner.nextLine();


        System.out.println("Enter your gender:");
        Gender genders=Gender.valueOf(scanner.nextLine());

        Object object=new Object(names,regNo,simpleDateFormat.parse(dob),courses,simpleDateFormat.parse(doa),genders);
        System.out.println(object);

    }
}
