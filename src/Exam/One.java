package Exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class One {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> inserting=new ArrayList<Integer>();
        List<Integer> numbers=new ArrayList<Integer>();
        System.out.println("Number of entries");
        Integer entries=scanner.nextInt();
        String space=scanner.nextLine();
        for (int i=0;i<entries;i++){
            int input=scanner.nextInt();
            numbers.add(input);
        }
        int queries=scanner.nextInt();
        if (queries==2){
            System.out.println("Insert");
            for (int j=0;j<2;j++){
                int postion=scanner.nextInt();
                inserting.add(postion);
            }
            numbers.add(inserting.get(0),inserting.get(1));
            System.out.println("Delete");
            int deleteposition=scanner.nextInt();
            numbers.remove(deleteposition);
        }
        System.out.println(numbers);

    }
}
