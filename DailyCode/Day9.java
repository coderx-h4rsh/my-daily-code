public class Day9 {
    public static void main(String[] args) {
    recursion(25);
    }

    static void recursion(int n) {
    if (n == 0) return;
    recursion(n-1);
    System.out.println(n);
    }
}