package Calculators;

import java.util.Scanner;

public class Main {
    public static void simpleCalculatorMethod() {
        double number1, number2, output;
        Scanner scanner = new Scanner(System.in);
        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println("Enter the first number:");
        number1 = scanner.nextDouble();
        System.out.println("Enter the operator:(+,-,/,*)");
        char operator = scanner.next().charAt(0);
        System.out.println("Enter the second number:");
        number2 = scanner.nextDouble();
        switch (operator) {
            case '+':
                output = simpleCalculator.add(number1, number2);
                System.out.println(output);
                break;
            case '-':
                output = simpleCalculator.subtract(number1, number2);
                System.out.println(output);
                break;
            case '*':
                output = simpleCalculator.multiply(number1, number2);
                System.out.println(output);
                break;
            case '/':
               output = simpleCalculator.divide(number1, number2);
                System.out.println(output);
                break;
            default:
                System.out.println("Incorrect operator");
                break;

        }


    }
    public static void advancedCalculatorMethod(){
        double number1,number2,output;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter operation you would like to carry out:(cylinder,circlearea,circumfrence," +
                "squareroot,power,reciprocal,exponential,sum,subtract,multiply,divide)");
        String operators=scanner.nextLine();
        Operators operators1=Operators.valueOf(operators);

        AdvancedCalculator advancedCalculator=new AdvancedCalculator();
        switch (operators1){
            case cylinder:
                System.out.println("Enter the first number:");
                number1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                number2 = scanner.nextDouble();
                output=advancedCalculator.cylinder(number1,number2);
                System.out.println(output);
                break;
            case power:
                System.out.println("Enter the first number:");
                number1 = scanner.nextDouble();
                System.out.println("Enter the second number:");
                number2 = scanner.nextDouble();
                output=advancedCalculator.power(number1,number2);
                System.out.println(output);
                break;
            case squareroot:
                System.out.println("Enter a number:");
                number1 = scanner.nextDouble();
                output=advancedCalculator.squareroot(number1);
                System.out.println(output);
                break;
            case reciprocal:
                System.out.println("Enter a number:");
                number1 = scanner.nextDouble();
                output=advancedCalculator.reciprocal(number1);
                System.out.println(output);
                break;
            case exponential:
                System.out.println("Enter a number:");
                number1 = scanner.nextDouble();
                output=advancedCalculator.exponential(number1);
                System.out.println(output);
                break;
            case circlearea:
                System.out.println("Enter a number:");
                number1 = scanner.nextDouble();
                output=advancedCalculator.circleArea(number1);
                System.out.println(output);
                break;
            case circumfrence:
                System.out.println("Enter a number:");
                number1 = scanner.nextDouble();
                output=advancedCalculator.circumfrence(number1);
                System.out.println(output);
                break;
                default:
                    simpleCalculatorMethod();

        }



        
    }
    public static void scientificCalculatorMethod(){
        double number,output;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter operation you would like to carry out:(cylinder,circlearea,circumfrence," + "\n"+
                "squareroot,power,reciprocal,exponential,sum,subtract,multiply,divide,sine,cosine,tangent,cotangent,cosec,sec)");
        String operators=scanner.nextLine();
        Operators operators1=Operators.valueOf(operators);
        ScientificCalculator scientificCalculator=new ScientificCalculator();
        System.out.println("Enter a number:");
        number = scanner.nextDouble();
        switch (operators1){
            case sine:
                output=scientificCalculator.sine(number);
                System.out.println(output);
                break;
            case cosine:
                output=scientificCalculator.cosine(number);
                System.out.println(output);
                break;
            case tangent:
                output=scientificCalculator.tangent(number);
                System.out.println(output);
                break;
            case sec:
                output=scientificCalculator.sec(number);
                System.out.println(output);
                break;
            case cosec:
                output=scientificCalculator.cosec(number);
                System.out.println(output);
                break;
            case cotangent:
                output=scientificCalculator.cot(number);
                System.out.println(output);
                break;
                default:
                    advancedCalculatorMethod();
        }

        }
    public static void binaryCalculatorMethod() {
        String number1,number2,output;
        char operator;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = scanner.nextLine();
        System.out.println("Enter the operator:(+,-,/,*)");
        operator= scanner.nextLine().charAt(0);
        System.out.println("Enter the second number:");
        number2 = scanner.nextLine();
        BinaryCalculator binaryCalculator=new BinaryCalculator();
        switch (operator) {
            case '+':
                output = binaryCalculator.add(number1, number2);
                System.out.println(output);
                break;
            case '-':
                output = binaryCalculator.subtract(number1, number2);
                System.out.println(output);
                break;
            case '*':
                output = binaryCalculator.multiply(number1, number2);
                System.out.println(output);
                break;
            case '/':
                output = binaryCalculator.divide(number1, number2);
                System.out.println(output);
                break;
            default:
                System.out.println("Incorrect operator");
                break;


        }
    }
    public static void hexadecimalCalculatorMethod() {
        String number1, number2, output;
        char operator;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1 = scanner.nextLine();
        System.out.println("Enter the operator:(+,-,/,*)");
        operator = scanner.nextLine().charAt(0);
        System.out.println("Enter the second number:");
        number2 = scanner.nextLine();
        Hexadecimal hexadecimal = new Hexadecimal();
        switch (operator) {
            case '+':
                output = hexadecimal.add(number1, number2);
                System.out.println(output);
                break;
            case '-':
                output = hexadecimal.subtract(number1, number2);
                System.out.println(output);
                break;
            case '*':
                output = hexadecimal.multiply(number1, number2);
                System.out.println(output);
                break;
            case '/':
                output = hexadecimal.divide(number1, number2);
                System.out.println(output);
                break;
            default:
                System.out.println("Incorrect operator");
                break;
        }
    }


    public static void main(String[]args){
        System.out.println("Enter the type of calculator you want to use(simple,advanced,scientific,binary,hexadecimal):");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        CalculatorChoice calculatorChoice = CalculatorChoice.valueOf(choice);
        if (calculatorChoice == CalculatorChoice.simple) {
            simpleCalculatorMethod();
        }else if (calculatorChoice==CalculatorChoice.advanced){
            advancedCalculatorMethod();
        }else if (calculatorChoice==CalculatorChoice.scientific){
            scientificCalculatorMethod();
        }else if (calculatorChoice==CalculatorChoice.binary) {
            binaryCalculatorMethod();
        }else {
            hexadecimalCalculatorMethod();
        }

        }

    }
