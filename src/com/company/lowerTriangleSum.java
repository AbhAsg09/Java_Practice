package com.company;

import java.util.Scanner;

public class lowerTriangleSum {
    static int sumLowerTriangle(int[][] Matrix, int row){
        int sum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
                if (i>j)
                    sum = (sum + Matrix[i][j]);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        int row = 0, column = 0;
        int check = 1, sum;
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

        sum = sumLowerTriangle(matrix, row);

        System.out.println("\nSum of lower triangle of the Matrix = " + sum);
    }
}
