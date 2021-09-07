package Assignment_one;

public class Twelve {
    public static void main(String[] args) {
        char sequence = 'A';
        int numofrows = 11;
        int decrease = (numofrows + 1) / 2;
        int k;
        for (int i = 0; i < numofrows; i++) {
            if (i < 6) {
                for (int s = i; s < 6; s++) {
                    System.out.print(" ");
                }

                for (int j = 0; j <6; j++) {
                    if (j == 0 || j == i) {
                        System.out.print(sequence);
                        System.out.print(" ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
                sequence++;
                if (i==5){
                    sequence--;
                }

            }

            else{

                for (int s = decrease-1; s <=i; s++) {
                    System.out.print(" ");
                }
                sequence--;

                for (int t=numofrows-1;t>=i;t--){
                    if (t ==10 || t== i) {
                        System.out.print(sequence);
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
