/*public class Day13{
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("Vivo", "S2", 36000.00);
        Smartphone.storage = 8;
        Smartphone.camera = 50;
        s1.print();
    }
}

class Smartphone{
    String brand;
    String model;
    static int storage;
    static int camera;
    double price;

   Smartphone(String brand, String model, double price) {
    this.brand = brand;
    this.model = model;
    this.price = price;
    }

    void print(){
        System.out.println(brand + " , " + model + " , " + storage + "GB, " + camera + "Mp, " + price + "$");
    }
}*/

public class Day13 {
    public static void main(String[] args) {
        Product p1 = new Product("Lamp", 67590, 423.896, 2);
        //Product.website = "Blinkit";
        //Product.tax = 18;
        p1.invoice();
        
    }
}

class Product {
    String name;
    int id;
    double price;
    int qty;
    static String website;
    static final int tax = 18;

    Product(String name, int id, double price,  int qty) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.qty = qty; 
    }

    //Static Block
    static {
        Product.website = "Amazon";
    }

    void invoice() {
        System.out.println(name + " , " + "Product ID#" + id + " , " + price + "$, " + qty + "pieces, " + website + " , " + tax + "% GST");
    }
}