package Calculators;

public class ScientificCalculator extends  AdvancedCalculator {
    public double sine(double a) {
        double b=Math.toRadians(a);
        double result1=Math.sin(b);
        return Math.round(result1*100.0)/100.0;
    }
    public double cosine(double a) {
        double b=Math.toRadians(a);
        double result1=Math.cos(b);

        return Math.round(result1*100.0)/100.0;
    }
    public double tangent(double a) {
        double b=Math.toRadians(a);
        double result1=Math.tan(b);
        return Math.round(result1*100.0)/100.0;
    }
    public double sec(double a) {
        double b=Math.toRadians(a);
        double result1=1/(Math.sin(b));
        return Math.round(result1*100.0)/100.0;
    }
    public double cosec(double a) {
        double b=Math.toRadians(a);
        double result1=1/(Math.cos(b));
        return Math.round(result1*100.0)/100.0;
    }
    public double cot(double a) {
        double b=Math.toRadians(a);
        double result1=1/(Math.tan(b));
        return Math.round(result1*100.0)/100.0;
    }
}
