package Assignment_one;

public class Three {
    public static void main(String[] args) {
        int numofrows=9;
        int decrease=(numofrows+1)/2;

        for (int i = 0; i < numofrows; i++) {
            if (i<5){
                for (int s = i; s < 5; s++) {
                    System.out.print(" ");
                }

                for (int j = 0; j <= i; j++) {
                    if (j == 0 || j == i) {
                        System.out.print("*");
                        System.out.print(" ");

                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }else{
                for (int s = decrease-1; s <=i; s++) {
                    System.out.print(" ");
                }

                for (int t=numofrows-1;t>=i;t--){
                    if (t ==8 || t== i) {
                        System.out.print("*");
                        System.out.print(" ");

                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();


            }
            }

            }

        }


