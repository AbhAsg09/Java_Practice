package com.company;
import java.util.*;

public class squareroot {

    static boolean sqrt1(float a){
        float b = (float) Math.sqrt(a);
        return (Math.pow(b, 2)) == a;
    }

    public static void main(String[] args)
    {
        Scanner newf = new Scanner(System.in);
        float a;
        System.out.println("Enter a number:");
        a = newf.nextFloat();
        if (sqrt1(a)){
            System.out.println("Perfect square.");
        } else {
            System.out.println("Not a perfect square.");
        }
    }
}