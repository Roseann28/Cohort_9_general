package Exceptions;

public class GenderException extends Exception {
    public GenderException() {
        super("Enter either Male or Female");
    }
}
