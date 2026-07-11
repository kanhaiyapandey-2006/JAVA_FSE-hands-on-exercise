//when properties and methods of one class are inherited by another class, it is called inheritance. Inheritance is a mechanism in object-oriented programming that allows a new class (subclass or derived class) to inherit the properties and behaviors (methods) of an existing class (superclass or base class). This promotes code reusability and establishes a relationship between classes.

package OOPS;

public class Inheritance {
    public static void main(String[] args){
        // Fish shark = new Fish();
        // shark.eat();
        Dog labrador = new Dog();
        labrador.eat();
        //abrador.legs = 4;
        //System.out.println(labrador.legs);
         
    }
}
class Animal{
    void eat(){
        System.out.println("eating...");
    }
    void breathe(){
        System.out.println("breathing...");
    }
}

class Mammal extends Animal{
    void walk(){
        System.out.println("walking...");
    }
}

class fish  extends Animal{
    void swim(){
        System.out.println("swimming...");
    }
}

class Dog extends Mammal{
    String breed;
}   
 //Derived class
// class Fish extends Animal{
//     void swim(){
//         System.out.println("swimming...");
//     }
// }