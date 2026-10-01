public class Day10 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.age  = 17;
        s1.rollNumber = 1017;
        s1.college = "CTAE"; 

        s1.markAttendence();
        s1.print();

        Student s2 = new Student();
        s2.name = "Amit";
        s2.age = 19;
        s2.rollNumber = 1003;
        s2.college = "CTAE";

        s2.markAttendence();
        s2.print();
    }
}

class Student{
    String name;
    int age;
    int rollNumber;
    String college;

    void markAttendence() {
    System.out.println("Attendence is Marked.");
    }

    void print() {
        System.out.println(name + " , " + age + " , " + rollNumber + " , " + college);
    }
}