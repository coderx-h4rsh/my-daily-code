public class Day10 {
    public static void main(String[] args) {
        /*Student s1 = new Student("Harsh", "CTAE", 18, 117);
        /*s1.name = "Harsh Sharma";
        s1.clg = "CTAE";
        s1.age = 18;
        s1.rollNum = 117; 

        s1.attendence();
        s1.print(); 
        //System.out.println(s1.clg + " " + s1.name + " " + s1.age + " " + s1.rollNum);

        Student s1 = new Student();
        s1.print();  

        // Shallow and Deep copy
        int x = 53;
        int y = 79;

        System.out.println(x + " , " + y);

        addTen(x,y);
        System.out.println(x + " , " + y); */

        Random r1 = new Random(53, 79); 

        System.out.println(r1.x + " , " + r1.y);
        mulTen(r1);
        System.out.println(r1.x + " , " + r1.y);
    }

    static void addTen(int x, int y) {
        x = x + 10;
        y = y + 10;
    }

    static void mulTen(Random r) {
        r.x = r.x * 10;
        r.y = r.y * 10;
    }
}

/*class Student {
    String name;
     String clg;
     int age;
    int rollNum;

    // constructor
    Student(String name, String clg, int age, int rollNum) {
        this.name = name;
        this.clg = clg;
        this.age = age;
        this.rollNum = rollNum;
    }

    void attendence() {
        System.out.println("Attendence is marked for " + name);
    }

    void print() {
        System.out.println(name + " , " + clg + " , " + age + " , " + rollNum);
    }
} */
    
// constructor overloading and chaining
    class Student {
        String name;
        String clg;
        int age; 
        int rollNum;

        Student () {
            this("Unknown");
            System.out.println("First Constructor.");
        }

        Student(String name) {
            this(name, "Unknown");
            System.out.println("Second Constructor.");
        }

        Student(String name, String clg) {
            this(name, clg, 0);
            System.out.println("Third Constructor.");
        }

        Student(String name, String clg, int age) {
            this(name, clg, age, 0);
            System.out.println("Fourth Constructor.");
        }

        Student(String name, String clg, int age, int rollNum) {
            this.name = name;
            this.clg = clg;
            this.age = age;
            this.rollNum = rollNum;
            System.out.println("Fifth Constructor.");
        }

        void print() {
            System.out.println(name + " , " + clg + " , " + age + " , " + rollNum);
        }
    }

// Shallow and Deep copy
    class Random {
        int x;
        int y;

        Random(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
