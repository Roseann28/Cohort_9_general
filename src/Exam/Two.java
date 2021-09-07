package Exam;

import java.util.*;

public class Two {

    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        Map<String,Integer> contacts=new HashMap<>();
        Integer entries=scanner.nextInt();
        String space=scanner.nextLine();
        for (int i=0;i<entries;i++){
            System.out.println("Contacts");
            System.out.println("Enter name:");
            String name=scanner.nextLine();
            System.out.println("Enter phone number:");
            Integer phoneNumber=scanner.nextInt();
            String space1=scanner.nextLine();
            contacts.put(name,phoneNumber);
        }
        System.out.println(contacts);
        System.out.println("Enter name of person you want to search for");
        String search=scanner.nextLine();
        if (contacts.containsKey(search)){
           System.out.println(contacts.get(search));
        }
    }
}
