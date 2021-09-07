package StudentReg;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Object {
    private String name;
    String RegNumber;
    private Date DateOfBirth;
    String course;
    Date dateOfAdmission;
    private Gender gender;

    public Object(String registrationNumber)
    {
        this.RegNumber = registrationNumber;
    }

    public Object(String name, String regNumber, Date dateOfBirth, String course, Date dateOfAdmission, Gender gender) {
        this.name = name;
        RegNumber = regNumber;
        DateOfBirth = dateOfBirth;
        this.course = course;
        this.dateOfAdmission = dateOfAdmission;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getRegNumber() {
        return RegNumber;
    }

    public void setRegNumber(String regNumber) {
        RegNumber = regNumber;
    }

    public Date getDateOfBirth() {
        return DateOfBirth;
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


    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", RegNumber='" + RegNumber + '\'' +
                ", DateOfBirth=" + new SimpleDateFormat("dd/MM/yyyy").format(DateOfBirth)  +
                ", course='" + course + '\'' +
                ", dateOfAdmission=" + new SimpleDateFormat("dd/MM/yyyy").format(dateOfAdmission) +
                ", gender=" + gender +
                '}';
    }
}
