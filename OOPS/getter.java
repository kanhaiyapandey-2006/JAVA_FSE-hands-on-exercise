package OOPS;

public class getter {
     public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(1);
        System.out.println(p1.tip);

        student s1 = new student();
        s1.setName("Alice");
        s1.setAge(20);
        s1.setPercentage(85, 90, 78);


        BankAccount myAcc = new BankAccount();
        myAcc.username = "Kanhaiya";
        myAcc.username = "Kanhaiya123";
        System.out.println(myAcc.username);
        //System.out.println(myAcc.password); // This will cause an error because password is private
    }
}

class BankAccount{
    public String username;
    private String password;

    public void setPassword(String newPassword){
        password = newPassword;
    }
}

class pen{
    //prop +  function
    String color;
    int tip;

    String getColor(){
        return this.color;
    }

    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}

class student{
    String name;
    int age;
    float percentage;

    void setPercentage(int phy, int chem, int math  ){
        percentage = (phy + chem + math) / 3.0f;
    }

    void setName(String newName){
        name = newName;
    }
    void setAge(int newAge){
        age = newAge;
    }
}
