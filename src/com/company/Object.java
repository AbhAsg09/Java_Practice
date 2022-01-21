package com.company;

import java.util.Scanner;

class Student{
    private int regNo, Age;
    private float Marks;
    private String Name;


    public void set(int rno, int age, float marks, String name){
        regNo = rno;
        Age = age;
        Marks = marks;
        Name = name;
    }

    public void get(){
        System.out.println(regNo);
        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Marks);
    }
}

public class Object {
    public static void main(String[] arg){
        Scanner newObj = new Scanner(System.in);
        Scanner newName = new Scanner(System.in);
        Scanner newMarks = new Scanner(System.in);
        Student stud = new Student();

            System.out.println("Enter details of student:");
            System.out.println("Enter name:");
            String name = newName.nextLine();
            System.out.println("Enter registration number:");
            int rno = newObj.nextInt();
            System.out.println("Enter age:");
            int age = newObj.nextInt();
            System.out.println("Enter marks:");
            float marks = newMarks.nextFloat();
            stud.set(rno, age, marks, name);

            System.out.println("Details of student:");
            stud.get();
    }
}