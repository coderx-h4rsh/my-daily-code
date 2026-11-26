public class Day13 {
    public static void main(String[] args) {
        // Autoboxing & Unboxing
        /*int x = 10;
        Integer y = x; // --> Autoboxing 
        // conceptually --> Integer y = Integer.valueOf(x);
        System.out.println(y); // --> Unboxing 

        Integer p = 20;
        int q = p; // --> Unboxing
        // conceptually --> int q = p.intValue();
        System.out.println(q); // --> Autoboxing

        // using methods
        Integer m = 39;
        printNum(m); // --> unboxing

        int b = 74;
        showNum(b); // --> autoboxing

        // using operations
        Integer u = 44;
        Integer v = 754;

        int sum = (u + v);
        System.out.println(sum); // --> unboxing */

        int a = 1000;
        int b = 1000;

        System.out.println(a == b); // --> for primitives '==' compares the values

        Integer x = 100;
        Integer y = 100;
        
        System.out.println(x == y); // --> True due to caching

        Integer p = 200;
        Integer q = 200;

        System.out.println(p == q); // --> False cz '==' compares refernce variables while comparing objects out of the gaurenteed cache range.
        System.out.println(p.equals(q)); // --> thats why we use .equals() while comparing objects
        // Wrapper classes --> convert primitives into objects
        // Caching
        // POJO --> plain old java objects --> simple jaca class that doesn't depends on any external framework 
    }
    static void printNum(int n) {
        System.out.println(n);
    }
    static void showNum(Integer a) {
        System.out.println(a);
    }
}