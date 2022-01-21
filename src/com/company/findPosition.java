package com.company;

import java.util.Scanner;

public class findPosition {
    static int[] checkPosition(int[][] Matrix, int row, int column, int Arg){
        int[] position = {-1,-1};
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (Matrix[i][j] == Arg){
                    position[0] = i;
                    position[1] = j;
                    break;
                }
            }
            if (position[0] != -1)
                break;
        }
        return position;
    }

    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        int row = 0, column = 0;
        int check = 1, Arg;
        int[] position;
        System.out.println("Enter number of rows and columns for matrix");
        while (check != 0) {
            row = newi.nextInt();
            column = newi.nextInt();
            if (row == 0 || column == 0) {
                System.out.println("!!Invalid input!!\nPlease make row2 and column1 equal for both matrix:");
            } else {
                check = 0;
            }
        }

        int[][] matrix = new int[row][column];
        System.out.println("Enter matrix");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix[i][j] = newi.nextInt();
            }
        }

        System.out.println("Enter element to be found");
        Arg = newi.nextInt();

        position = checkPosition(matrix, row, column, Arg);

        if (position[0] == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element's position = " + java.util.Arrays.toString(position));
    }
}
