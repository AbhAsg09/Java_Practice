package com.company;

import java.util.Scanner;

public class matrix_multiplication {
    static void mulMatrix(int[][] matrix1, int[][] matrix2, int row1, int column1, int row2, int column2){
        int[][] matrix3 = new int[row1][column2];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
                matrix3[i][j] = 0;
                for (int k = 0; k < column1; k++) {
                    matrix3[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column2; j++) {
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
            if (row2!= column) {
                System.out.println("!!Invalid input!!\nPlease make row2 and column1 equal for both matrix:");
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
        for (int i = 0; i < row2; i++) {
            for (int j = 0; j < column2; j++) {
                matrix2[i][j] = newi.nextInt();
            }
        }

        mulMatrix(matrix1, matrix2, row, column, row2, column2);

    }
}
