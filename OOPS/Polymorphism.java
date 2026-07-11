package OOPS;

//method overloading is a feature that allows a class to have multiple methods with the same name but different parameters (different type, number, or both). It enables you to define multiple behaviors for a method based on the arguments passed to it. This is a form of compile-time polymorphism.

public class Polymorphism {
    public static void main(String[] args){
        calculator calc = new calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2.5f, 3.5f));
        System.out.println(calc.sum(1, 2, 3));  

        Deer deer = new Deer();
        deer.eat();
    }
}

//method overriding
class Animal{
    void eat(){
        System.out.println("eating...");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("eating grass...");
    }
}

//method overloading
class calculator{
    int sum(int a, int b){
        return a + b;
    }
    float sum(float a, float b){
        return a + b;
    }
    int sum(int a, int b, int c){
        return a + b + c;
    }
}

//method overriding is a feature that allows a subclass to provide a specific implementation of a method that is already defined in its superclass. The overridden method in the subclass should have the same name, return type, and parameters as the method in the superclass. This is a form of runtime polymorphism.
