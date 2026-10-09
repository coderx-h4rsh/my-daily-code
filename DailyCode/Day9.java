public class recursion {
    public static void main(String[] args) {

        // recursion

        // printnum(25);
        // even(100);

        A();
        System.out.println("This is how Chain Function works");
    }
    static void printnum(int n) {
        if (n == 0) return;
        printnum(n-1);
        System.out.print(n + " "); 
    }

    static void even(int i) {
        if(i == 22) return;
        even (i - 2);
        System.out.println(i);
    }

    // function chaining

    static void A() {
        B();
        System.out.println("This is function A");
    }

    static void B() {
        C();
        System.out.println("This is function B");
    }

    static void C() {
        System.out.println("This is function C");
    }
}