public class Day5 {
    public static void main (String[] args) {
        // Implicit Conversion
    byte b = 27;
    int i;
    i = b;

    float f = -9.63f;
    double d;
    d = f;

    // Explicit Conversion
    int e = 999;
    byte c;
    c = (byte) e;

    float g = 24.44f;
    int k;
    k = (int) g;
   
    // Character Conversion
    char v = 'h';
    int l;
    l = (int) v;

    int q = 1;
    char w;
    w = (char) q;
   
    System.out.println(i + " , " + d + " , " + c + " , " +  k + " , " + l + " , " + w);
    System.out.println("Boolean data type can't be converted into any other Variable type just by type casting.");
    }
}