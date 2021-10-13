package com.pb.dolgova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("введите целое число от 1 до 100");
        int number = scan.nextInt();

        if (number>=0 && number<=14) {
            System.out.println("range  0-14");
        } else if (number >= 15 && number <= 35) {
            System.out.println("range 15-35");
        } else if (number >= 36 && number <= 50) {
            System.out.println("range 36-50");
        } else if (number >= 51 && number <= 100) {
            System.out.println("range 51-100");
        }
        else{
            System.out.println("мимо, давай по новой");
        }

    }
}

