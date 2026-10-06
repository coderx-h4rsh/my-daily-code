public class Day11 {
    public static void main(String[] args) {
        Car c1 = new Car("Ford", "Mustang GT", 2025, 293743.887);
        //Car c1 = new Car();
        c1.carSpecs();
        c1.engineCheck();
    }
}

class Car {
    String brand;
    String model;
    int year;
    double price;

    Car() {
        this("Unknown");
        System.out.println("This is constructor first");
    }

    Car(String brand) {
        this(brand, "Unknown");
        System.out.println("This is second constructor");
    }

    Car(String brand, String model) {
        this(brand, model, 0);
        System.out.println("This is third constructor");
    }

    Car(String brand, String model, int year) {
        this(brand, model, year, 0.0);
        System.out.println("This is fourth constructor");
    }

    Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        System.out.println("This is the main Constructor");
    }

    void engineCheck() {
        System.out.println("Engine Starts...");
    }

    void carSpecs() {
        System.out.println(brand + " , " + model + " , " + year + " , " +  price + "$");
    }
}