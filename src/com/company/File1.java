package com.company;
import java.io.*;
public class File1 {
    public static void main(String[] args) {
        try {
            File f = new File("firstfile.txt");
            if (f.createNewFile()) {
                System.out.println("New file is created");
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
