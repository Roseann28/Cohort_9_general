package DataStructures;

public class TryOne {

    public int solve(int a, int b) {
        String as=String.valueOf(a);

        if (as.length()==1){
            return Integer.parseInt(as);
        }else{
            String astring=as.repeat(b);
            return Integer.parseInt(superdigit(astring));
        }
    }
    String superdigit(String number) {
        if(number.length() == 1) return number;
        else {
            int sum = 0;

            for(int i = 0; i < number.length(); i++) {
                sum += Character.getNumericValue( number.charAt(i) );
            }

            return superdigit(Integer.toString(sum));
        }
    }
}
