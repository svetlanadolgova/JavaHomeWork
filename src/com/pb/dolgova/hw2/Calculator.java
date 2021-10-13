package com.pb.dolgova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int  operand1;
        int operand2;
// c форматом double не играюсь тк resalt = Infinity для /0
        System.out.println("введите operand1 в формате х");
        operand1 = scan.nextInt();

        System.out.println("введите operand2 в формате x");
        operand2 = scan.nextInt();

        System.out.println("введите операцию + - / * ");
        String sign= scan.next();

        switch(sign)
        {
            case "+" :
                System.out.println("resalt = " + (operand1+operand2));
                System.out.println("это сумма операндов");
                break;
            case "-" :
                System.out.println("resalt = " + (operand1-operand2));
                System.out.println("это разница операндов");
                break;
            case "*" :
                System.out.println("resalt = " + (operand1*operand2));
                System.out.println("это произведение операндов");
                break;
            case "/" :
                try {
                    int operand3 = operand1/operand2;
                    System.out.println("resalt = " + operand3);
                    System.out.println("деление операндов");
                }catch (ArithmeticException e){
                    System.out.println("Найн, делить на 0 - низзя");
                }

                break;
            default :
                System.out.println("натупила, давай по новой");
        }
                    }
}




