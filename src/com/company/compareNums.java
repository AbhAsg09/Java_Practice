package com.company;
import java.util.Scanner;

public class compareNums {

    static void sortAscending(int[] Values, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (Values[i] > Values[j]) {
                    Values[i] += Values[j];
                    Values[j] = Values[i] - Values[j];
                    Values[i] -= Values[j];
                }
            }
        }
        System.out.println(java.util.Arrays.toString(Values));
    }

    static void sortDescending(int[] Values, int size) {
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if (Values[i] < Values[j]) {
                    Values[i] += Values[j];
                    Values[j] = Values[i] - Values[j];
                    Values[i] -= Values[j];
                }
            }
        }
        System.out.println(java.util.Arrays.toString(Values));
    }

    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);

        int size;
        System.out.println("Enter size of the Array");
        size = newObj.nextInt();
        int[] Values = new int[size];
        System.out.println("Enter the array : ");
        for (int i = 0; i < size; i++) {
            Values[i] = newObj.nextInt();
        }

        int check = 1;
        int Argument = 0;
        System.out.println("1. Press 1 to sort in ascending order\n2. Press 2 to sort in descending order");
        while (check != 0) {
            Argument = newObj.nextInt();
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
