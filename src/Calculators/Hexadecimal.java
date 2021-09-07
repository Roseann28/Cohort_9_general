package Calculators;

public class Hexadecimal implements BinaryHexadecimalI{
    @Override
    public String add(String a, String b) {
        int a1=Integer.parseInt(a,16);
        int b1=Integer.parseInt(b,16);
        int sum=a1+b1;
        return Integer.toHexString(sum);
    }

    @Override
    public String subtract(String a, String b) {
        int a1=Integer.parseInt(a,16);
        int b1=Integer.parseInt(b,16);
        int difference=a1-b1;
        return Integer.toHexString(difference);
    }

    @Override
    public String multiply(String a, String b) {
        int a1=Integer.parseInt(a,16);
        int b1=Integer.parseInt(b,16);
        int product=a1*b1;
        return Integer.toHexString(product);
    }

    @Override
    public String divide(String a, String b) {
        int a1=Integer.parseInt(a,16);
        int b1=Integer.parseInt(b,16);
        int division=a1/b1;
        return Integer.toHexString(division);
    }
}
