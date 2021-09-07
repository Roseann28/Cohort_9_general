package FileCollections;

import FileOperations.Gender;
import FileOperations.Person;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student implements Comparable<Student>{
    private final String registrationNumber;
    Person person;
    Date dateOfAdmission;
    String course;
    public Student(String registrationNumber)
    {
        this.registrationNumber = registrationNumber;
    }
    public Student(String registrationNumber, String name, Date dateOfBirth, String gender) {
        this.registrationNumber = registrationNumber;
        this.person = new Person(name, dateOfBirth, Gender.valueOf(gender));
    }
    public Student(String registrationNumber, String name, Gender gender, Date dateOfBirth) {
        this.registrationNumber = registrationNumber;
        this.person = new Person(name, dateOfBirth, gender);
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return registrationNumber +
                "," + this.person.getName() + ", " + this.person.getGender() + ", " + new SimpleDateFormat("dd-MM-yyyy").format(this.person.getDateOfBirth());
    }

    @Override
    public boolean equals(Object obj) {
        // compare 2 students (this and obj)
        Student s1 = (Student) obj;
        return compareRegistrationNumbers(this.getRegistrationNumber(), s1.getRegistrationNumber());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy of the object
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize(); // called when the object is being destroyed (GC'ed)
    }

    private boolean compareRegistrationNumbers(String first, String second)
    {
        return first.equals(second);
    }

    @Override
    public int compareTo(Student o) { // returns 0 if they are equal, 1 if this is greater than o, -1 if this is less than o
        return this.getRegistrationNumber().compareTo(o.getRegistrationNumber());
    }
}
