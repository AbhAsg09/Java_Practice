package com.company;

import java.util.Scanner;

public class compareString {
    static void sortAscending(String[] Values, int size) {
        String temp;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (Values[i].compareTo(Values[j]) > 0) {
                    temp = Values[i];
                    Values[i] = Values[j];
                    Values[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(Values));
    }

    static void sortDescending(String[] Values, int size) {
        String temp;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (Values[i].compareTo(Values[j]) < 0) {
                    temp = Values[i];
                    Values[i] = Values[j];
                    Values[j] = temp;
                }
            }
        }
        System.out.println(java.util.Arrays.toString(Values));
    }

    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        Scanner Args = new Scanner(System.in);

        int size;
        System.out.println("Enter size of the Array");
        size = Args.nextInt();
        String[] Values = new String[size];
        System.out.println("Enter the array : ");
        for (int i = 0; i < size; i++) {
            Values[i] = newObj.next();
        }

        int check = 1;
        int Argument = 0;
        System.out.println("1. Press 1 to sort in ascending order\n2. Press 2 to sort in descending order");
        while (check != 0) {
            Argument = Args.nextInt();
            if (Argument != 1 && Argument != 2) {
                System.out.println("!!Invalid input!!\nPlease enter again:");
            } else {
                check = 0;

            }
        }

        if (Argument == 1){
            sortAscending(Values, size);
        } else {
            sortDescending(Values, size);
        }

    }
}
