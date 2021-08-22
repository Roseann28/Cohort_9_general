package Recursion;

public class Three {
    public int countX(String string) {
        if(string.isEmpty())
            return 0;

        if (string.charAt(0) == 'x')
            return 1 + countX(string.substring(1));
        else
	      return countX(string.substring(1));

    }
    public String parenBit(String str) {
        if (str.charAt(0)=='('&&str.charAt(0)!=')'){
            return str+ parenBit(str.substring(1));
            }
        else
            return parenBit(str.substring(1));
        }
}
