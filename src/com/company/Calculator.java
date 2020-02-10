package com.company;

import calculations.*;


public class Calculator {

    private static double firstNumber;
    private static double secondNumber;

    public static void main(String[] args) {
        MyReader input = new MyReader();

        while (true) {
            System.out.println("Enter operation: (sum,sub,quit)");
            input.readUserInput();
            String operation = input.getInput().trim();
            if (operation.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            }

            try {
                System.out.println("Enter first number:");
                input.readUserInput();
                firstNumber = Double.parseDouble(input.getInput());
                System.out.println("Enter second number:");
                input.readUserInput();
                secondNumber = Double.parseDouble(input.getInput());
            } catch (NumberFormatException e) {
                System.out.println("Not a number entered!");
                break;
            }


            switch (operation) {
                case "sum":
                    calculateSum sum = new calculateSum(firstNumber, secondNumber);
                    System.out.println(sum.calculate());
                    break;
                case "sub":
                    calculateSubtraction sub = new calculateSubtraction(firstNumber, secondNumber);
                    System.out.println(sub.calculate());
                    break;
            }
        }

    }


}

