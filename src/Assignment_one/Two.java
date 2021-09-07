package Assignment_one;

public class Two {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int s = i; s < 5; s++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= (2*i); j++) {
                if (i<4){
                    if (j == 0 || j == (i*2)) {
                        System.out.print("*");

                    } else {
                        System.out.print(" ");
                    }

                }else {
                    System.out.print("*");
                }


            }
            System.out.println();
        }

    }
}

