package Exam;

public class Contact {
    private int phonenumber;
    private String name;

    public Contact(int phonenumber, String name) {
        this.phonenumber = phonenumber;
        this.name = name;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
