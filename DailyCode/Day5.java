/*public class Day5 {
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
}*/
// Selection statement Questions 

public class Day5 {
    public static void main(String[] args) {

        // leap year calculator

        /*int year = 2008;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }*/

       // Otp verfication

       /*int otp = 101108;
       int time = 24;

       if(otp == 101108 && time <= 30) {
            System.out.println("Access Granted.");
       } else {
            System.out.println("Access Denied.");
            System.out.println("Check your Otp and try again or try to fill it before 30 seconds.");
       }*/

        // Tax evaluator

       int income = 425610;
       double tax;
       if (income < 100000) {
         tax = income * 0;
       } else if (income > 100000 && income < 400000) {
            tax = income * 0.10;
       } else if (income > 400000 && income < 800000) {
            tax =  3000 + (income * 0.20);
       } else {
            tax = 11000 + (income * 0.30);
       }
        System.out.println("Tax = " + tax + "$");


        // E-commerce Price calculator

        /*int weight = 187;
        int volume = 24;
        String destination = "Regional";

        int wtPrice = weight * 2;
        int volPrice = volume * 3;
        int basePrice = wtPrice + volPrice;
        double finalPrice = 0.0;

        if (destination == "Local") {
            finalPrice = basePrice * 1.0;
        } else if (destination == "Regional") {
            finalPrice = basePrice * 2.0;
        } else if (destination == "International") {
            finalPrice = basePrice * 5.0;
        } else {
            System.out.println("Invalid Zone");
        }
        System.out.println("Final Shipping Price is $" + finalPrice);*/

        // Month name finder

        /*int mnth = 11;

        switch(mnth) {
            case 1 :
                System.out.println("January");
                break;
            case 2 :
                System.out.println("February");
                break;
            case 3 :
                System.out.println("March");
                break;
            case 4 :
                System.out.println("April");
                break;
            case 5 :
                System.out.println("May");
                break;
            case 6 :
                System.out.println("June");
                break;
            case 7 :
                System.out.println("July");
                break;
            case 8 :
                System.out.println("August");
                break;
            case 9 :
                System.out.println("September");
                break;
            case 10 :
                System.out.println("October");
                break;
            case 11 :
                System.out.println("November");
                break;
            case 12 :
                System.out.println("December");
                break;
        }*/

       // Restaurent Menu Ordering System

       /*int order = 4;

       switch(order) {
            case 1 :
                System.out.println("You ordered a Cold Coffee.");
                break;
            case 2 :
                System.out.println("You ordered French Fries.");
                break;
            case 3 :
                System.out.println("You ordered a Burger.");
                break;
            case 4 :
                System.out.println("You ordered a Pizza.");
                break;
       }*/
     }
}