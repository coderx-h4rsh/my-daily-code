/*public class Day13 {
    public static void main (String[] args) {
        int x = 53;
        int y = 79;

        System.out.println(x + " , " + y);

        addTen(x,y);
        System.out.println(x + " , " + y);
    }
    static void addTen(int x, int y) {
        x = x + 10;
        y = y + 10;

    }
}*/

public class Day13 {
    public static void main (String[] args) {
    
    Random r1 = new Random(53, 79);

    System.out.println(r1.x + " , " + r1.y);
    mulTen(r1);
    System.out.println(r1.x + " , " + r1.y);
    }
    static void mulTen(Random r) {
        r.x = r.x * 10;
        r.y = r.y * 10;
    }
}
class Random {
    int x;
    int y;

    Random(int x, int y) {
        this.x = x;
        this.y = y;
    }
}