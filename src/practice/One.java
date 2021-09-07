package practice;

public class One {
    public int strCount(String string, String subString) {
        int stringLen = string.length();
        int subStringLen = subString.length();

        if (stringLen < subStringLen)
            return 0;

        if (string.substring(0,subStringLen).equals(subString))
            return 1 + strCount(string.substring(subStringLen), subString);
        else
            return strCount(string.substring(1), subString);

    }
    int sum=0;
    public int countX(String string) {
        if(string.isEmpty()){
            return 0;
        }
        if (string.charAt(0)=='x') {
            sum = +1;
        }

        return countX(string.substring(1));
    }
}
