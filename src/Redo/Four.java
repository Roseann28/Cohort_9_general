package Redo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Four {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<List<Integer>> finalList=new ArrayList<List<Integer>>();
        List<Integer> numbers=new ArrayList<Integer>();
        System.out.println("Number of entries");
        Integer entries=scanner.nextInt();
        String space=scanner.nextLine();
        for (int i=0;i<entries;i++){
            System.out.println("size");
            Integer sizearraylist=scanner.nextInt();
            String space1=scanner.nextLine();
            System.out.println("inputs");
            for (int j=0;j<sizearraylist;j++){
                Integer inputs=scanner.nextInt();
                numbers.add(inputs);
            }
            finalList.add(numbers);
            numbers=new ArrayList<>();
        }
        String space3=scanner.nextLine();
        System.out.println(finalList);
        System.out.println(finalList.get(0).get(0));
        System.out.println("Number of entries");
        Integer entriesTwo=scanner.nextInt();
        String space2=scanner.nextLine();
        List<ArrayList<Integer>> accesslist=new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> position=new ArrayList<Integer>();
        System.out.println("list and position");
        for (int i=0;i<entriesTwo;i++){
            for (int j=0;j<2;j++){
                int access=scanner.nextInt();
                position.add(access);
            }
            System.out.println(position);
            accesslist.add(position);
            position=new ArrayList<>();

        }
        try {
            System.out.println(finalList.get(accesslist.get(0).get(0) - 1).get(accesslist.get(0).get(1) - 1));
        }catch (Exception e){
            System.out.println("ERROR!");
        }
    }
}
