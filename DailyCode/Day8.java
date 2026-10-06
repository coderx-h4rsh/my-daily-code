public class Day8 {
   public static void main(String[] args) {
   greet();
   sayhello("Harsh");
   System.out.println(num());

   int i = 35; int j = 47; int k = 69;
   System.out.println(mul(35, 47, 69));
   }

   static void greet() {
          System.out.println("Hello");
   return;
   }

   static void sayhello(String name) {
        System.out.println("Hello" + name);
   }

   static int num() {
   return 10;
   }

   static int mul(int a, int b){
   return(a*b);
   }

   static int mul(int x, int y, int z) {
   return(x*y*z);
   }
}
/*public class Day8 {
    public static void main(String[] args) {

    A();
    System.out.println("And this is how Chain Functions work.");
    }

    static void A() {
    B();
    System.out.println("This is string of A");
    }

    static void B() {
    C();
    System.out.println("This is string of B");
    }

    static void C() {
    System.out.println("This is string of C");
    return;
    }
}*/

