public class functions {
    public static void main(String[] args) {
       // greet();
       // sayHello("Harsh");
       /* int x = age();
       System.out.println(x); */

       // System.out.println(mul(38.990f, 26.442f));
       // System.out.println(div(22.56, 556.998));

       // System.out.println(mul(224, 668, 977));

       A();
       System.out.println("This is how chain function works");

    }

    // no input & no output 

    static void greet() {
        System.out.println("Namaste");
    }

    // input but no output

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    // output but no input

    static int age() {
        return 17;
    }

    // both input and output 


    static float mul(float a, float b) {
        return(a*b);
    }

    static double div(double f, double g) {
        return(f/g);
    }

    static float mul(int x, int y, int z) {
        return( (x*y) / z);
    }
}
    /* function overloading --> by changing 1) no. of parameters 2) order of parameters
                                                 3) type of parameter


// static --> to call the funcion without creating an object 
/* return --> data type of value function will return like n above case its 'int'
                in case of no output we use 'void'*/


