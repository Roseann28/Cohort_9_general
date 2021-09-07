package Assignment_one;

public class Star {
    public static void main(String[] args) {
        int r=0;
        int k=1;
        int n=6;
        int numofrows=11;
        int space;
        int numofcols;
        for (int i=0;i<numofrows;i++){

            if (i<=5) {
                space = n;
                numofcols=k;
            }else {
                space = i-4;
                numofcols=(numofrows-i-1)*2;
                if (i==10){
                    numofcols=1;
                }
            }
            for (int l=space;l>=0;l--){
                System.out.print(" ");
            }
            for (int j=0;j<numofcols;j++){
                System.out.print(" *");
            }
            n--;
            System.out.println();
            r++;
            k=r*2;


            }
        }
            }


