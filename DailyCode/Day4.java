public class Day6 {
   public static void main(String[] args) {
    // Arithmatic Operators

    // Basic
    byte b = 27;
    byte c = 38;

    int i = b + c;
    int a = b - c;
    int d = b*c;
    float e = (float) b/c;
    int f = b%c;

    // Compound
    int g = 49;

    g += 5;
    g -= 7;
    g *= 87;
    g /= 33;

    // Increment & Decrement
    int h = 99;
    System.out.println(i + " , " + a + " , " + d + " , " + e + " , " + f);
    System.out.println(g);
    System.out.println(h++ + " , " + ++h + " , " + --h + " , " + h--);

    // Relational 

    byte x = 21;
    byte y = 69;

    boolean j = x==y;
    boolean k = x!=y;
    boolean l = x>y;
    boolean m = x<y;
    boolean n = x<=y;
    boolean o = x>=y;
    System.out.println(j + "  " + k + "  " + l + "  " + m + "  " + n + "  " + o);

    // Bitwise Operator

    int p = 221;
    int q = 12;

    int r;
    r = p&q;
    int s;
    s = p|q;
    int t;
    t = p^q;
    int u;
    u = ~p;
    System.out.println(t + "  " + s + "  " + t + "  " + u);

    // Shifter Operators

    int v = -70;
    int vv = i << 9;
    int vvv = i >> 2;
    int vvvv = i >>> 2;
    System.out.println(vv + "  " + vvv + "  " + vvvv);

    // Logical Shifters

    int A = 51;
    int B = 83;

    boolean w = (A != B) && (A == B);
    boolean ww = (A > B) || (A < B);
    System.out.println(w + " , " + ww);
   }
}
