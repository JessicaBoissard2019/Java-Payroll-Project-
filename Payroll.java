//Chapter 5 example (page170)

import java.util.Scanner;

public class Payroll {

    public static void main(String[] args) {

        // Variables and constants
        double rate;
        double hoursWorked;
        double regularPay;
        double overtimePay;
        final int FULL_WEEK = 40;
        final double OT_RATE = 1.5;
        Scanner keyboard = new Scanner(System.in);

        // Input phase
        System.out.print("How many hours did you work this week? >>");
        hoursWorked = keyboard.nextDouble();
        System.out.print("What is your regular pay rate? >>");
        rate = keyboard.nextDouble();

        // Processing phase
        if (hoursWorked > FULL_WEEK) {
            regularPay = FULL_WEEK * rate;
            overtimePay = (hoursWorked - FULL_WEEK) * OT_RATE * rate;
        } else {
            regularPay = hoursWorked * rate;
            overtimePay = 0.0;

        } // end of if/else

        // output phase
        System.out.println();
        System.out.println("Regular pay is: " + regularPay + "\nOvertime pay is:" + overtimePay);

    }// end of main

} // end of class block
