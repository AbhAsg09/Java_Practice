package com.company;

import java.util.Scanner;

public class Calculate {
    static void Total(int num1, int num2){
        System.out.println("Sum = " + (num1+num2));
        System.out.println("Difference = " + (num1-num2));
        System.out.println("Product = " + (num1*num2));
        System.out.println("Division = " + (num1/num2));
    }
    static void Total(float num1, float num2){
        System.out.println("Sum = " + (num1+num2));
        System.out.println("Difference = " + (num1-num2));
        System.out.println("Product = " + (num1*num2));
        System.out.println("Division = " + (num1/num2));
    }

    public static void main(String[] arg){
        Scanner newi = new Scanner(System.in);
        Scanner newf = new Scanner(System.in);
        int num1, num2, type;
        float numf1, numf2;
        System.out.println("1. Press 1 for integer\n2. Press 2 for float");
        type = newi.nextInt();

        if (type == 1){
            System.out.println("Enter num 1");
            num1 = newi.nextInt();
            System.out.println("Enter num 2");
            num2 = newi.nextInt();
            Total(num1, num2);
        } else {
            System.out.println("Enter num 1");
            numf1 = newf.nextFloat();
            System.out.println("Enter num 2");
            numf2 = newf.nextFloat();
            Total(numf1, numf2);
        }
    }
}
