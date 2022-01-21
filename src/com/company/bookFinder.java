package com.company;

import java.util.Locale;
import java.util.Scanner;

class book{
    String bookName, Publisher;
    int noPages;
    float Price;

    book(String _bookName, String _Publisher, int _noPages, float _Price){
        bookName = _bookName;
        Publisher = _Publisher;
        noPages = _noPages;
        Price = _Price;
    }

    boolean nameFinder(String toBeFound){
        String name = bookName.toLowerCase(Locale.ROOT);
        toBeFound = toBeFound.toLowerCase(Locale.ROOT);
        return name.contains(toBeFound);
    }

}

public class bookFinder {
    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        Scanner news = new Scanner(System.in);
        Scanner newf = new Scanner(System.in);
        int size, noPages;
        String bookName, Publisher, toBeSearched;
        float Price;

        System.out.println("Enter number of books:");
        size = newi.nextInt();

        book[] books = new book[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details of book " + (i+1));
            System.out.println("Name:");
            bookName = news.nextLine();
            System.out.println("Publisher:");
            Publisher = news.nextLine();
            System.out.println("No of pages:");
            noPages = newi.nextInt();
            System.out.println("Price:");
            Price = newf.nextFloat();

            books[i] = new book(bookName, Publisher, noPages, Price);
        }

        System.out.println("\n\nEnter what needs to be searched");
        toBeSearched = news.nextLine();

        for (int i = 0; i < size; i++) {
            if (books[i].nameFinder(toBeSearched))
                System.out.println("Name: " + books[i].bookName + " | Price: " + books[i].Price);
        }

    }
}
