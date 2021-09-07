package Calculators;

public class BinaryCalculator implements BinaryHexadecimalI {
    @Override
    public String add(String a, String b) {
        int len1 = a.length();
        int len2 = b.length();
        int carry = 0;
        String res = "";

        int maxLen = Math.max(len1, len2);
        for (int i = 0; i < maxLen; i++) {

            int p = i < len1 ? a.charAt(len1 - 1 - i) - '0' : 0;
            int q = i < len2 ? b.charAt(len2 - 1 - i) - '0' : 0;
            int tmp = p + q + carry;
            carry = tmp / 2;
            res = tmp % 2 + res;
        }
        return (carry == 0) ? res : "1" + res;
    }

    @Override
    public String subtract(String a, String b) {
        int a1=Integer.parseInt(a,2);
        int b1=Integer.parseInt(b,2);
        int difference=a1-b1;

        return Integer.toBinaryString(difference);
    }

    @Override
    public String multiply(String a, String b) {
        int a1=Integer.parseInt(a,2);
        int b1=Integer.parseInt(b,2);
        int product=a1*b1;
        return Integer.toBinaryString(product);
    }

    @Override
    public String divide(String a, String b) {
        int a1=Integer.parseInt(a,2);
        int b1=Integer.parseInt(b,2);
        int division=a1/b1;
        return Integer.toBinaryString(division);
    }
}