package JDBC;

import Exceptions.DateException;
import Exceptions.GenderException;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws SQLException, ClassNotFoundException, GenderException, DateException,NullPointerException{
        RecordOperations recordOperations=new RecordOperations();
        DbUtil dbUtil =new DbUtil();
        Connection connection=dbUtil.writeDataFromObject();
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        List<String> students=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int choice;
        System.out.println("Welcome to Student Management System!\n");
        do {
            System.out.println("\n1. Add Student\n" +
                    "2. Search Student\n" +
                    "3. Delete Student\n" +
                    "4. View Students\n" +
                    "0. Exit\n");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addStudent(recordOperations, connection);
                    break;
                case 2:
                    searchStudent(recordOperations, connection, students);
                    break;
                case 3:
                    deleteStudent(recordOperations, connection);
                    break;
                case 4:
                    viewStudents(dbUtil, students);
                    break;
            }
        } while (choice != 0);
        //recordOperations.getStudentDetails();

       /* dbUtil.writeData("insert into records(registrationnumber,dateofbirth)values('C036',16/07/1999)");
        *//*int done=dbUtil.writeData("create database if not exists studentmanagement");
        dbUtil.writeData("use studentmanagement");*//*
        ResultSet resultSet=dbUtil.readData("select * from records limit 10");
        while (resultSet.next()){
            System.out.println(resultSet.getString("registrationnumber"));
        }*/
        /*dbUtil.writeData("insert into records(registrationnumber,name,dateofbirth,gender,course,dateofadmission)" +
                "values(?,?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);*/
        //System.out.println(done);
        /*dbUtil.writeDataFromObject("insert into records(name,registrationnumber,dateofbirth,course,dateofadmission,gender)" +
                "values(?,?,?,?,?,?))");*/
        /*dbUtil.connectionClosed();*/


    }

    private static void viewStudents(DbUtil dbUtil, List<String> students) throws SQLException {
        ResultSet resultSet;
        resultSet=dbUtil.readData("select * from records");
        while (resultSet.next()){
            students.add(resultSet.getString("name")
                    +" "
                    +resultSet.getString("registrationnumber")
                    +" "
                    +resultSet.getString("dateofbirth")
                    +" "
                    +resultSet.getString("course")
                    +" "
                    +resultSet.getString("dateofadmission")
                    +" "
                    +resultSet.getString("gender"));
        }
        System.out.println(students);
    }

    private static void deleteStudent(RecordOperations recordOperations, Connection connection) throws SQLException {
        PreparedStatement preparedStatement;
        String delete=recordOperations.delete();
        preparedStatement=connection.prepareStatement("delete from records where registrationnumber=?");
        preparedStatement.setString(1,delete);
        int done=preparedStatement.executeUpdate();
        System.out.println(done);
    }

    private static void searchStudent(RecordOperations recordOperations, Connection connection, List<String> students) throws SQLException {
        PreparedStatement preparedStatement;
        ResultSet resultSet;
        String searchedString=recordOperations.search();
        preparedStatement=connection.prepareStatement("select * from records where registrationnumber=?");
        preparedStatement.setString(1,searchedString);
        resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            students.add(resultSet.getString("name")
                    +" "
                    +resultSet.getString("registrationnumber")
                    +" "
                    +resultSet.getString("dateofbirth")
                    +" "
                    +resultSet.getString("course")
                    +" "
                    +resultSet.getString("dateofadmission")
                    +" "
                    +resultSet.getString("gender"));
    }
        System.out.println(students);
    }

    private static void addStudent(RecordOperations recordOperations, Connection connection) throws DateException, GenderException, SQLException {
        PreparedStatement preparedStatement;
        Student objectstudent=recordOperations.getStudentDetails();
        preparedStatement=connection.prepareStatement("insert into records(name,registrationnumber,dateofbirth,course,dateofadmission,gender)" +
                "values(?,?,?,?,?,?)");
        preparedStatement.setString(1, objectstudent.name);
        preparedStatement.setString(2, objectstudent.regNumber);
        preparedStatement.setObject(3, objectstudent.dateOfBirth);
        preparedStatement.setString(4, objectstudent.course);
        preparedStatement.setObject(5, objectstudent.dateOfAdmission);
        preparedStatement.setString(6, String.valueOf(objectstudent.gender));
        preparedStatement.executeUpdate();
    }


}
