package com.company;

import java.util.Scanner;

public class unit_Matrix {

    static boolean checkUnity(int[][] Matrix, int row){
        boolean Check = true;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i != j){
                    if (Matrix[i][j] != 0)
                        Check = false;
                } else {
                    if (Matrix[i][i] != 1)
                        Check = false;
                }
            }
        }
        return Check;
    }

    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        int row = 0, column = 0;
        int check = 1;
        boolean Check;
        System.out.println("Enter number of rows and columns for matrix");
        while (check != 0) {
            row = newi.nextInt();
            column = newi.nextInt();
            if (row != column || row == 0) {
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

        Check = checkUnity(matrix, row);

        if (Check){
            System.out.println("Matrix is unit");
        } else {
            System.out.println("Matrix is not unit");
        }
    }
}
