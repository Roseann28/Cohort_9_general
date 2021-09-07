package Assignment_one;

public class One {
    public static void main(String[]args){
        int numofrows=10;
        int numofcols;
        int x=4;
        for (int i=0;i<numofrows;i++){
            if (i<5){
                numofcols=i;
                for (int n=0;n<i;n++){
                    System.out.print(" ");
                }
                for (int j=numofcols;j<5;j++){
                    System.out.print(" *");
                }
            }else {
                numofcols=numofrows-i-1;
                for (int n=x;n>0;n--){
                    System.out.print(" ");
                }
                for (int j=numofcols;j<5;j++){
                    System.out.print(" *");
                }
                x--;

            }


            System.out.println();
        }
    }
}
