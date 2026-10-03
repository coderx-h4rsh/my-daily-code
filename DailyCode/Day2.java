public class Day2 {
    public static void main(String[] args) {
           // Integers --> byte, short, int, long
   byte B = 4;
   short S = 16;
   int I = 4444;
   long L = 101108;
   // Floating --> float, double
   float F = 9.08f;
   double D = -4.89993;
   // Character --> char
   char n1 = 'H';
   char n2 = 'A';
   char n3 = 'R';
   char n4 = 'S';
   // Boolean --> boolean
   boolean T = true;
   boolean X = true;
   System.out.println(B + "," + S + "," + I + "," + L);
   System.out.println(F + "," + D);
   System.out.println(n1 + "." + n2 + "." + n3 + "." + n4 + "." + n1);
   System.out.println(T + "," + X);
   System.out.println("All Of The Above Is Written Using Variable Data Types In Java");

   byte b = 0b00011000; // Binary System
   int c = 074521; // Octal System
   short d = 0xAED; // Hexadecimal System

   short s = 0b0001000101011100;
   float f = 0b01000010001100011100001010001111;
   System.out.println(b + " , " + c + " , " + d + " , " + s + " , " + f);
    }
}