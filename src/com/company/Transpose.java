package com.company;

import java.util.Scanner;

public class Transpose {
    static int[][] matrixTranspose(int[][] Matrix, int row, int column){
        int[][] transposeMatrix = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transposeMatrix[j][i] = Matrix[i][j];
            }
        }
        return transposeMatrix;
    }

    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        int row = 0, column = 0;
        int check = 1;
        int[][] transposeMatrix;
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
        transposeMatrix = matrixTranspose(matrix, row, column);

        System.out.println("\nTranspose of the given matrix is:");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(transposeMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
