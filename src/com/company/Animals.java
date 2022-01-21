package com.company;

class Animal{
    private  String name;
    private int brain, body, size, weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal eats called");
    }

    public void move(int a) {
        System.out.println("speed = " + a);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}

class Dog extends Animal {

    private int eyes, legs, tail, teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    

    private void chew(){
        System.out.println("Chew called");
    }

    @Override
    public void eat() {
        chew();
        super.eat();
    }

    public void walk(){
        System.out.println("walk called");
        move(5);
    }

    public void run(){
        System.out.println("Run called");
        move(10);
    }
}

public class Animals {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 1, 1, 5, 5);

        Dog dog = new Dog("Wheazy", 5, 10, 2, 4, 1, 32, "short");

//        dog.eat();
        dog.walk();
        dog.run();

    }
}
