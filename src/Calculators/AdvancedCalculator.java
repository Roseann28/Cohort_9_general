package Calculators;

public class AdvancedCalculator extends SimpleCalculator {
    public double power(double a, double b) {
        return Math.pow(a, b);
    }

    public double squareroot(double a) {
        return Math.sqrt(a);
    }

    public double circleArea(double a) {
        return (Math.PI * a * a);
    }

    public double circumfrence(double a) {
        return (Math.PI * a * 2);
    }

    public double cylinder(double a, double b) {
        return Math.PI * a * a * b;
    }

    public double reciprocal(double a) {
        return 1 / a;
    }
    public double exponential(double a) {
        return Math.exp(a);
    }


}
