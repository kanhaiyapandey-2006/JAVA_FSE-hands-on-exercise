package OOPS;

public class Encapsulation {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println(s1.name);
        Student s2 = new Student("kanhaiya");
        System.out.println(s2.name);
        Student s3 = new Student(101);
        System.out.println(s3.roll);
        s1.password = "1234";
        Student s4 = new Student(s1);
        s4.password = "5678";
        System.out.println(s1.password);

    }
}

class Student{ 
    String name;
    int roll;
    String password;


    //copy constructor
    Student(Student s1){ 
        this.name = s1.name;
        this.roll = s1.roll;
        this.password = s1.password;
    }

    Student(){          //Non-parameterized constructor
        System.out.println("Constructor called");
    }

    Student(String name){   //Parameterized constructor
        this.name = name;
    }

    Student(int roll){     //copy of constructor with different parameters
        this.roll = roll;
    }


}
