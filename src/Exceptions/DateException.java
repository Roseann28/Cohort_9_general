package Exceptions;

public class DateException extends Exception {
    public DateException() {
        super("Invalid date format input the dd/MM/yyyy format");
    }
}
