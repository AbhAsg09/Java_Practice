package com.company;

import java.util.Locale;
import java.util.Scanner;

class filmDetails{
    String filmName, filmID, productionCompany, Language;
    int noFrames;

    filmDetails(String _filmName,String _filmID,String _productionCompany,String _Language, int _noFrames){
        filmName = _filmName;
        filmID = _filmID;
        productionCompany = _productionCompany;
        Language = _Language;
        noFrames = _noFrames;
    }

    boolean findFilm(String language){
        String nLanguage = Language.toLowerCase(Locale.ROOT);
        language = language.toLowerCase(Locale.ROOT);
        return (nLanguage.equals(language));
    }

}

public class Film {

    static void display(String language, int size, filmDetails[] films){
        System.out.print("The movies are : " );
        for (int i = 0; i < size; i++) {
            if (films[i].findFilm(language))
                System.out.print(films[i].filmName + ". ");
        }

    }

    public static void main(String[] args) {
        Scanner newi = new Scanner(System.in);
        Scanner news = new Scanner(System.in);
        String filmName, filmID, productionCompany, Language, language;
        int noFrames, size;

        System.out.println("Enter number of films:");
        size = newi.nextInt();

        filmDetails[] films = new filmDetails[size];

        for (int i = 0; i < size; i++) {
            System.out.println("\nEnter details of film " + (i+1));
            System.out.println("Name:");
            filmName = news.nextLine();
            System.out.println("Film ID:");
            filmID = news.nextLine();
            System.out.println("Production Company:");
            productionCompany = news.nextLine();
            System.out.println("Language of film:");
            Language = news.nextLine();
            System.out.println("No of frames:");
            noFrames = newi.nextInt();

            films[i] = new filmDetails(filmName, filmID, productionCompany, Language, noFrames);

        }

        System.out.println("\nEnter the Language which you want to list ");
        language = news.nextLine();

        display(language, size, films);

    }
}