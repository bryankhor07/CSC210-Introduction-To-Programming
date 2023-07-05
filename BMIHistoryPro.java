/*
    Assignment: 3
    Description: This program computes the history of the user's BMI by asking for their height and their lowest and heaviest weight
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.Scanner;

public class BMIHistoryPro {

    public static void main(String[] args) {

        // Greet the user
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^ Welcome to:");
        System.out.println("^    BODY MASS INDEX (BMI) Computation PRO");
        System.out.println("^               by BRYAN KHOR");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");

        // Create a Scanner to receive user's height and weight
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter their height
        System.out.println("Enter your height in feet and inches: ");
        int feet = input.nextInt();
        int inches = input.nextInt();

        // Prompt the user to enter their lowest and heaviest weight
        System.out.println("Enter your lowest weight in pounds: ");
        int lowestWeight = input.nextInt();

        System.out.println("Enter your heaviest weight in pounds: ");
        int highestWeight = input.nextInt();

        // Convert the feet to inches to get the value of height in inches
        int totalInches = feet * 12 + inches;

        // Print out the header
        System.out.println(" ");
        System.out.println("WEIGHT" + "   " + "BMI" + "          " + "CONDITION");

        // Use a for loop to print a table of Body Mass Index based on the weight and height of the user
        for (int i = lowestWeight; i <= highestWeight; i += 5) {
            System.out.print(i + "      " );
            float BMI = (float) (i / Math.pow(totalInches,2) * 703);
            if (BMI > 25) {
                System.out.printf("%4.4f %s\n", BMI,  "     overweight");
            } else {
                System.out.printf("%4.4f %s\n", BMI,  "     not overweight");
            }
        }

        // Thank the user for using your program
        System.out.println(" ");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        System.out.println("^   Thank you for using my program.");
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        input.close();
    }
}