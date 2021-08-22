package Recursion;

public class Five {
    public String parenBit(String str) {
        if (str.isEmpty())
            return str;
        if (str.charAt(0) == '(') {
            if (str.charAt(str.length()-1) == ')')
                return str;
            else
                return parenBit(str.substring(0, str.length()-1));
        } else
            return parenBit(str.substring(1));
    }
}
