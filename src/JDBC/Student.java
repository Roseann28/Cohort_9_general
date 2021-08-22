package JDBC;

import StudentReg.Gender;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String name;
    String regNumber;
    Date dateOfBirth;
    String course;
    Date dateOfAdmission;
    Gender gender;

    public Student(String name, String regNumber, Date dateOfBirth, String course, Date dateOfAdmission, Gender gender) {
        this.name = name;
        this.regNumber = regNumber;
        this.dateOfBirth = dateOfBirth;
        this.course = course;
        this.dateOfAdmission = dateOfAdmission;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }



    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }


    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + ',' + regNumber + ',' + new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth)+ ','
                +course + ',' + new SimpleDateFormat("dd/MM/yyyy").format(dateOfAdmission) +',' + gender;
    }
}
