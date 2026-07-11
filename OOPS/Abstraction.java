package OOPS;

public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();

        Chicken chicken = new Chicken();
        chicken.eat();
        chicken.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eating...");
    }
    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");
    }
}