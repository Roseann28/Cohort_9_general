package Redo;

import java.util.*;

public class Three {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer>size=new ArrayList<>();
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> pairs = new HashSet<String>(t);
        for (int i = 0; i < t; i++) {
            pairs.add("(" + pair_left[i] + ", " + pair_right[i] + ")");
            System.out.println(pairs.size());
            size.add(pairs.size());
        }
        System.out.println(size);

    }
}