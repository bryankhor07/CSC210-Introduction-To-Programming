/*
    Assignment 1
    Description: Compute and display the average of three numbers provided by the user.
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {

        // Create a scanner object to receive user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three whole numbers:");

        // Process the user's input.
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        // Compute the average.
        double average = (double)(number1 + number2 + number3) / 3;

        System.out.println("You entered " + number1 + " " + number2 + " " + number3 + " and the average of them is " + average);

        input.close();

    }
}