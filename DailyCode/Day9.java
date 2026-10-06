public class Day9 {
    public static void main(String[] args) {
    int terms = 10;
    for (int i = 0; i < terms; i++) {
        System.out.println(fibonacci(i));
    }
    }

    /*static void recursion(int n) {
    if (n == 0) return;
    recursion(n-1);
    System.out.println(n);
    }*/

    // Fibonacci Series

    static int fibonacci(int n) {
        if (n == 0 || n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2); 
    }
}