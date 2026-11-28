public class Day14 {
    public static void main(String[] args) {
        /*Outer O = new Outer();
        Outer.Inner i = new Outer.Inner();
        i.print(O);
        i.display();*/

        /* Outer2 O = new Outer2();
        Outer2.Inner2 i = O.new Inner2();
        i.show(); */

        // one liner instantiation --> when only inner class object is needed and not to keep outer object reference.
        /* Outer2.Inner2 i = new Outer2().new Inner2();
        i.show(); */

        /* Outer3 O = new Outer3();
        O.show(); */

        Outer4 p1 = new Outer4() { 
        @Override 
            void intro() { 
                String name = "Harsh.";
                System.out.println("Hi, I am " + name); 
            } 
        };

        p1.intro();
    }
}
// Nested Class --> 1) Static Nested Class  2) Inner Class  3) Local Class  4) Anonymous Class

// 1) Static Nested Class
class Outer {
    int x = 100;
        static int y = 18;

        void printx() {
            System.out.println(x);
        }
    static class Inner {

        Inner() {
            this.O = new Outer();
        }

        Outer O;
        Inner(Outer O) {
            this.O = O;
        }

        void print(Outer O) {

            System.out.println("I am " + y + " years old."); // --> can acess static member of the outer class.
            //System.out.println(x); // --> showing error cz static inner class can't access local fields of outer class directly.
            System.out.println(O.x); // accessing local fields using method parameter
        }

            void display() {
                System.out.println(O.x); // --> accesing the outer field using the constructor.
            }
    }
}

// 2) Inner Class
class Outer2 {
    private int x = 10;
    class Inner2 {
        int x = 20;
        void show() {
            int x = 30;
            System.out.println(x); // local field
            System.out.println(this.x); // inner class field
            System.out.println(Outer2.this.x); // outer class field
        }
    }
}

// 3) Local Class 
class Outer3 {
    void show() {
        int fac = 27;
        // fac++;
        class LocalF {
            void print() {
                System.out.println("Factor = " + fac); // only be printed if the local field is final or effectively final(ie. ain't getting modfied).
            }
        }

        LocalF l = new LocalF();
        l.print();
    }
}

// 4) Anonymous Class 
class Outer4 {
    void intro() {
        System.out.println("Hello I'm a Boy.");
    }
}
