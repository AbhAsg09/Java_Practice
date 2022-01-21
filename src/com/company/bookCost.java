package com.company;

import java.util.Scanner;

class Book{
    int price;
    String bookid, name;
    Book(int _price, String _bookid, String _name){
        price = _price;
        bookid = _bookid;
        name = _name;
    }
}

public class bookCost {
    public static void main(String[] args) {
        Scanner newObj = new Scanner(System.in);
        Scanner news = new Scanner(System.in);
        int size, costliest = 0, pos = 0;
        System.out.println("Enter no of books");
        size = newObj.nextInt();

        Book[] books;
        books = new Book[size];
        String bookid, name;
        int price;

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details of book " + (i+1));
            System.out.println("Book id : ");
            bookid = news.nextLine();
            System.out.println("Book Name :");
            name = news.nextLine();
            System.out.println("Price :");
            price = newObj.nextInt();
            books[i] = new Book(price, bookid, name);
        }

        for (int i = 0; i < size; i++) {
            if (books[i].price > costliest){
                costliest = books[i].price;
                pos = i;
            }
        }

        System.out.println("\nDetails of costliest book is = \nName: " + books[pos].name + "\nBook ID: " + books[pos].bookid + "\nPrice: " + books[pos].price);
    }
}
