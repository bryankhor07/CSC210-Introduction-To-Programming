/*
    Assignment 1
    Description: Compute and display the value of centimeters given by the user in meters.
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.Scanner;

public class CentimetersToMeters {
    public static void main(String[] args) {

        // Create a scanner object to receive user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value in centimeters:");

        // Process the user's input.
        int centimeter = input.nextInt();

        // Convert the value to meters.
        double meter = (double)centimeter / 100;

        System.out.println(centimeter + " centimeters is " + meter + " in meters.");
        input.close();
    }
}
