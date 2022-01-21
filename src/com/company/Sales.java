package com.company;

import java.util.Scanner;

class salesPerson{
    String name;
    int Product1, Product2, Product3;

    salesPerson(String _name, int _Product1, int _Product2, int _Product3){
        name = _name;
        Product1 = _Product1;
        Product2 = _Product2;
        Product3 = _Product3;
    }

    int maxSales(){
        return (Product1 + Product2 + Product3);
    }

}

public class Sales {
    public static void main(String[] args) {
        Scanner news = new Scanner(System.in);
        Scanner newi = new Scanner(System.in);

        String name;
        int Product1, Product2, Product3, size, max = 0, pos = 0;

        System.out.println("Enter number of sales person: ");
        size = newi.nextInt();

        salesPerson[] salesPerson = new salesPerson[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details of Sales Person " + (i+1));
            System.out.println("Name:");
            name = news.nextLine();
            System.out.println("Product 1:");
            Product1 = newi.nextInt();
            System.out.println("Product 2:");
            Product2 = newi.nextInt();
            System.out.println("Product 3:");
            Product3 = newi.nextInt();
            salesPerson[i] = new salesPerson(name, Product1, Product2, Product3);
        }

        for (int i = 0; i < size; i++) {
            if (salesPerson[i].maxSales() > max) {
                max = salesPerson[i].maxSales();
                pos = i;
            }
        }

        System.out.println("\n\nSalesman with the maximum number of products sold is:\nName: " + salesPerson[pos].name + "\nTotal product sold: " + salesPerson[pos].maxSales());

    }
}
