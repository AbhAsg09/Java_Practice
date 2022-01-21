package com.company;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] arg){
        Scanner newObj = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = newObj.nextInt();
        if (num%9 == 0){
            System.out.println("Number is divisible by 9");
        } else {
            System.out.println("Number is not divisible by 9");
        }
    }
}
