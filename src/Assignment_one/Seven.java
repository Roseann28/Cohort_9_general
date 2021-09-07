package Assignment_one;

public class Seven {
    public static void main(String[] args) {
        int numofrows=7;
        int space =numofrows/2;
        int a=1;
        for (int i=1;i<=numofrows;i++){
            for (int n = 1; n <=space; n++) {
                System.out.print(" ");
            }
            int count=a/2+1;
            for (int j=1;j<=a;j++) {
                System.out.print(count);
                if (j <= a / 2) {
                    count--;
                } else {
                    count++;
                }
            }
                System.out.println();
                if (i<=numofrows/2){
                    space=space-1;
                    a=a+2;

                }else {
                    space=space+1;
                    a=a-2;
                }

            }
        }
    }

