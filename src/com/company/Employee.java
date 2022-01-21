package com.company;

import java.util.Scanner;

public class Employee {
    static float grossPay(float Basicpay){
        float DA, HRA, gross;
        DA = (float) (Basicpay*0.1);
        HRA = (float) (Basicpay*0.04);
        gross = (Basicpay+DA+HRA);
        return gross;
    }
    static float deduction(float gross){
        float PF, net;
        PF = (float) (gross*0.03);
        net = (gross - PF);
        return net;
    }

    public static void main(String[] arg){
        String Name, EmpID;
        float basicPay, gross, net;
        Scanner newf = new Scanner(System.in);
        Scanner news = new Scanner(System.in);
        System.out.println("Enter name:");
        Name = news.nextLine();
        System.out.println("Enter employee id");
        EmpID = news.nextLine();
        System.out.println("Enter basic pay");
        basicPay = newf.nextFloat();

        gross = grossPay(basicPay);
        net = deduction(gross);

        System.out.println("Gross and Net pay for " + Name + " Employee ID " + EmpID + " is " + gross + " and " + net + " respectively!");
    }

}
