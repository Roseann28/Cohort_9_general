package Practice_Exam;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Expenses systems");
        System.out.println("Enter your spending for today ");
        System.out.println("food");
        double food=scanner.nextDouble();

        System.out.println("transport");
        double transport=scanner.nextDouble();

        System.out.println("health");
        double health=scanner.nextDouble();

        System.out.println("shopping");
        double shopping=scanner.nextDouble();

        System.out.println("rent");
        double rent=scanner.nextDouble();

        Expenditure expenditure=new Expenditure(food,transport,health,shopping,rent);
        double amount=expenditure.total(food,transport,health,shopping,rent);
        System.out.println(amount);

        //reverse string
        String sentence="My name is Roseann";
        StringBuilder stringBuilder=new StringBuilder(sentence);
        System.out.println(stringBuilder.reverse());

        //Input from file
        FileReader fileReader=new FileReader("src\\FileCollections\\student.txt");
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        int c;
        StringBuilder stringBuilders=new StringBuilder();
        while ((c=bufferedReader.read())!=-1){
            char ch=(char)c;
            if (ch!='\n')
                stringBuilders.append(ch);
            else{
                System.out.println(stringBuilders);
                stringBuilders=new StringBuilder();

            }




        }

        //Output
        /**
        FileWriter fileWriter=new FileWriter("src\\studentout.txt");
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.write(String.valueOf(expenditure));
         **/




    }
}
