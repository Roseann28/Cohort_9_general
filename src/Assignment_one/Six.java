package Assignment_one;

public class Six {
    public static void main(String[] args) {
        int a = 1;
        for (int i = 0; i < 5; i++) {
            for (int k = i; k < 5; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == 0) {
                    a=1;
                } else {
                    a = a * (i - j + 1) / j;
                }
                System.out.printf("%4d",a);
            }
            System.out.println();
        }
    }
}

