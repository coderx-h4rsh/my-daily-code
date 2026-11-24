public class Day11 {
    public static void main(String[] args) {

        // Encapsulation
        /*BankAccount b1 = new BankAccount();
        b1.name = "SBI";
        b1.accHolder = "Harsh";
        //b1.balance = 1969.45;

        b1.deposite(500);
        b1.withdraw(200);
        b1.getBalance();
        System.out.println(b1.setAccHol("Harsh"));*/

        //Inheritance
        /*Car c1 = new Car();
        c1.start();
        c1.setGear();*/

        /*Ferrari f1 = new Ferrari();
        f1.start();
        f1.setGear();
        f1.getModel("GTX 90");*/
        
        /*Bike b1 = new Bike();
        b1.start();
        b1.getModel("Kawasaki Ninja H2r");*/

        // Use of 'Super'
        CseStudnet c1 = new CseStudnet("Harsh", 18, "CTAE", 117);
        //c1.getRollNum();
        c1.show();
    }
}
// Encapsulation
class BankAccount {
    String name;
    private double balance; // only accessible inside this class 
    String accHolder;

    public void deposite(int amount) {
        if (amount > 0)
        balance += amount;
    }

    public void withdraw(int amount) {
        if(amount <= balance && amount > 0)
        balance -= amount;
    }

    public void getBalance() {
        System.out.println(balance);
    }

    protected String setAccHol(String accHolder) {
        this.accHolder = accHolder;
        return accHolder;
    }

} // private, public, protected --> Modifiers

// Inheritance --> Single, Multi-level, Hierarchial {Multiple not supported through classes}
class Vehicle {
    void start() {
        System.out.println("Engine Started...");
    }
}
class Car extends Vehicle { // --> Single Inheritance
    void setGear() {
        System.out.println("Gear changed");
    }
}
class Ferrari extends Car { // --> Multi-Level Inherutance
    void getModel(String model) {
        System.out.println("This is a Ferrari " + model);
    }
}
class Bike extends Vehicle { // --> Hierarchial Inheritance 
    void getModel(String name) {
        System.out.println(name);
    }
}

// Use of 'Super'
class Student { // --> Parent class
    String name;
    int age;
    String clg;
    int rollNum; //= 101

    Student() {}

    Student(String name, int age, String clg) {
        this.name = name;
        this.age = age;
        this.clg = clg;
    }

    void intro() {
        System.out.println(name + " " + age);
    }
}
class CseStudnet extends Student{ // --> Child class
    int rollNum;

    CseStudnet(String name, int age, String clg, int rollNum) {
        super(name, age, clg);
        this.rollNum = rollNum;
    }

    /*int rollNum = 102;
    void getRollNum() {
        System.out.println(rollNum);
        System.out.println(super.rollNum); // --> using to access parent class variable 
    }*/

    void show() {
        super.intro();
        System.out.println("is a student of " + clg + " has RollNo. " + rollNum);
    }
}