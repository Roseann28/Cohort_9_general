package DataStructures;

import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int min = 50;
        Scanner scan=new Scanner(System.in);
        int size = 4;
        Random random = new Random();
        int[] arrays = new int[size];

        for (int i = 0; i < size; i++) {
            arrays[i] = random.nextInt(50);

        }
        int temp;
        for (int i : arrays) {
            System.out.println(i);

        }
        for (int j = 0; j < size; j++) {
            for (int k = j; k > 0; k--) {
                if (arrays[k] < arrays[k - 1]) {
                    temp = arrays[k];
                    arrays[k] = arrays[k - 1];
                    arrays[k - 1] = temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i : arrays) {
            System.out.println(i);

        }
        String a="me";
        int b=3;
        System.out.println();
    }
}