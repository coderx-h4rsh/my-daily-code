public class Day14a {
    public static void main(String[] args) {
        Outer O = new Outer();
        Outer.Inner i = new Outer.Inner();
        i.print(O);

    }
}
// Nested Class --> 1) Static Nested Class  2) Inner Class  3) Local Class  4) Anonymous Class
class Outer {
    int x = 10;
    static int y = 20;

    static void show() {
        System.out.println("Hello");
    }

    static class Inner {

        /*Inner() {
            this.O = new Outer();
        }*/

        /*Outer O;
        Inner(Outer O) {
            this.O = O;
        }*/

        void print(Outer O) {
            //show();
           // System.out.println(x); // --> showing error cz static inner class can't access local fields of outer class directly.
           System.out.println("I am " + y + " years old."); // --> can acess static member of the outer class.
           System.out.println(O.x); // --> accessing local field using constructor
        }
    }
}
