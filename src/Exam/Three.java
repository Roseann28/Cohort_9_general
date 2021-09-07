package Exam;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Three {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<String> concatenation=new ArrayList<String>();
        Set<String> names=new HashSet<String>();
        ArrayList<Integer> setsize=new ArrayList<Integer>();
        System.out.println("Number of entries");
        Integer entries=scanner.nextInt();
        String space=scanner.nextLine();

        for (int i=0;i<entries;i++){
            System.out.println("Enter name");
            for (int j=0;j<2;j++){
                String a=scanner.next();
                concatenation.add(a);
            }
            String c=concatenation.get(0)+concatenation.get(1);
            names.add(c);
            System.out.println(names);
            setsize.add(names.size());
            concatenation=new ArrayList<>();
        }
        System.out.println(setsize);
    }
}
