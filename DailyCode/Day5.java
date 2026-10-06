public class Day5 {
   public static void main(String[] args) {

   // Basics of Selction Statement.  
       int x = 76;
       int y = 34;

       if(x>y) {
           System.out.println("x is greater than y.");
       } else {
           System.out.println("x is smaller than y.");
       }

       int z = 46;
       if(z == 40) {
           System.out.println("z is 46");
       } else if (z == 43) {
           System.out.println("z is 43");
       } else if (z == 46) {
           System.out.println("z is 46");
       }

       int w = 10;
       switch (w) {
           case 0:
               System.out.println("w is 0");
           break;

           case 10:
               System.out.println("w is 10");
               break;

           case 100:
               System.out.println("w is 100");
               break;
       }
   }
}