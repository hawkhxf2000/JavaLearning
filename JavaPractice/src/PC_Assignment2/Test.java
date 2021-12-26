package PC_Assignment2;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        CPU intel1 = new CPU();
        CPU intel2 = new CPU(10,"i9",449.00,3.1,"Q2'19",true);

        System.out.println("Welcome to the simple class example!");
        System.out.println();
        System.out.println("CPU 1: " + intel1);
        System.out.println("CPU 2: " + intel2);
        System.out.println("CPU 1 series: " + intel1.getSeries());
        System.out.println("CPU 1 Suggested price: " + String.format("%.2f",intel1.getPrice()) +" USD");
        intel1.setPrice(110.0);
        System.out.println("CPU 1 Suggested price (after mutator call): " + String.format("%.2f",intel1.getPrice())
                + " USD");
        System.out.println("Are CPU 1 and CPU 2 equal? " + (intel1.equals(intel2)?"YES":"NO"));
        System.out.println("Is CPU 1 of higher generation than CPU 2? " + (intel1.isHigherGeneration(intel2)?
        "YES":"NO"));
        System.out.println("COU 1 Price at " + String.format("%.2f",intel1.priceNow("Q3'19")) + " USD");
        System.out.println("COU 1 Price at " + String.format("%.2f",intel2.priceNow("Q3'19")) + " USD");

        System.out.println();
        System.out.println("Thank you for testing the simple class example!");
    }
}
