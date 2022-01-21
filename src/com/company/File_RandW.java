package com.company;

import java.io.FileOutputStream;

public class File_RandW {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("java.txt");
            String S = "This the FileOutputStream program";
//            Integer S = 65;
            byte[] b = S.getBytes();
            fos.write(b, 0, 7);
            fos.close();
        } catch (Exception e){
            System.out.println("Error:" + e);
        }
    }
}
