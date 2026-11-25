public class Day12 {
    public static void main(String[] args) {
    
    // Abstraction
    /*Car c1 = new ElectricCar(); // --> reference type is car but object is EC amd FC in below case.
    Car c1 = new FuelCar();
        c1.start();
        c1.accelerate();
        c1.brake(); */

    // Interface
    /*Flyable f1 = new Birds();
        f1.fly();
    Flyable f2 = new Aeroplane();
        f2.fly();
        f1.altitude();*/

    // Polymorphism
    Animal x = new Cat();//new Dog();
        x.sound();
    }   
}
// Abstraction --> separating what from how
abstract class Car{
    void start() {
        System.out.println("Car starts...");
    }

    abstract void accelerate(); // must be defined by the child class 
    abstract void brake();
}
class FuelCar extends Car {
    void accelerate() {
        System.out.println("FuelCar is accelerating.");
    }

    void brake() {
        System.out.println("Brakes applied on FuelCar.");
    }
}
class ElectricCar extends Car {
    void accelerate() {
        System.out.println("ElectricCar is accelerating.");
    }

    void brake() {
        System.out.println("Brakes applied on ElectricCar.");
    } 
}

// Interface --> works as a conntract all declared methods must be defined by the child class 
interface Flyable {
    void fly();
    void altitude();
}
class Birds implements Flyable {
    public void fly() {
        System.out.println("Birds are flying...");
    }
    public void altitude() {
        System.out.println("Birds generaly flies at a low altitude.");
    }
}
class Aeroplane implements Flyable {
    public void fly() {
        System.out.println("Aeroplane is flying...");
    }
    public void altitude() {
        System.out.println("Aeroplanes flies at high altitudes.");
    }
}

//Polymorphism --> allows some methods to behave differently in different situation
// compile-time --> overload mthds     run-time --> override mthds
class Animal {
    void sound() {
        System.out.println("Animal Sound.");
    }
}
class Dog extends Animal {
    @Override 
    void sound() {
        System.out.println("Dog Barks.");
    }
}
class Cat extends Animal {
    @Override 
    void sound() {
        System.out.println("Cat Meows.");
    }
}