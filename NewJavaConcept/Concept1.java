package NewJavaConcept;

import java.util.Scanner;

public class Concept1 {
    public static final int number_Of_Restaurant = 100;
    public final String collegeName = "Dtu";
    // compile time constant***********************************
    // compile time constant because compile know it's value and enject at the compile time and also knows that it's value can't be change at run time once initiallize

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of array");
        int n = scan.nextInt(); // run-time-constant;
        String str = scan.nextLine();// run-time-constant;
        // run time constant: which means it's value can't change unless application execute but change for next time execution of application;

        scan.close();
    }
}
