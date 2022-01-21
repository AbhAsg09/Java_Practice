package com.company;

import java.util.Scanner;

public class matrix_addition {
    static void addMatrix(int[][] matrix1, int[][] matrix2, int row, int column){
        int[][] matrix3 = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix3[i][j] = (matrix1[i][j] + matrix2[i][j]);
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        int row, column, row2 = 0, column2 = 0;
        int check = 1;
        System.out.println("Enter number of rows and columns for matrix 1");
        row = newi.nextInt();
        column = newi.nextInt();
        
        System.out.println("Enter number of rows and columns for matrix 2");
        while (check != 0) {
            row2 = newi.nextInt();
            column2 = newi.nextInt();
            if (row != row2 && column !=column2) {
                System.out.println("!!Invalid input!!\nPlease make rows and column equal for both matrix:");
            } else {
                check = 0;
            }
        }

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row2][column2];
        System.out.println("Enter matrix 1");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix1[i][j] = newi.nextInt();
            }
        }

        System.out.println("Enter matrix 2");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                matrix2[i][j] = newi.nextInt();
            }
        }

        addMatrix(matrix1, matrix2, row, column);

    }
}
