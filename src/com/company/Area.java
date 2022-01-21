package com.company;

import java.util.Scanner;

class Shape {
    private final int length, width;

    Shape(int _length, int _width){
        length = _length;
        width = _width;
    }

    Shape(int _length){
        length = _length;
        width = length;
    }

    public void area(){
        System.out.println("Area of shape is: " + (length*width));
    }
}

public class Area {
    public static void main(String[] arg){
        Scanner newObj = new Scanner(System.in);

        int check = 1;
        int def = 0;
        System.out.println("1. Press 1 for Rectangle\n2. Press 2 for Square");
        while (check != 0) {
            def = newObj.nextInt();
            if (def != 1 && def != 2) {
                System.out.println("!!Invalid input!!\nPlease enter again:");
            } else {
                check = 0;
            }
        }

        if (def == 1){
            int length, width;
            System.out.println("Enter Length:");
            length = newObj.nextInt();
            System.out.println("Enter width:");
            width = newObj.nextInt();
            Shape newShape = new Shape(length, width);
            newShape.area();
        } else {
            int length;
            System.out.println("Enter Length:");
            length = newObj.nextInt();
            Shape newShape = new Shape(length);
            newShape.area();
        }
    }
}
