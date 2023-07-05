/*
 *  Assignment: Chapter 2 Lab
 *  Description: This program calculates the bmi for users.
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {

        // Greet the user.
        System.out.println("Welcome to my BMI calculator!");
        System.out.println(" ");

        // Create a scanner to receive user's weight and height.
        Scanner input = new Scanner(System.in);
        System.out.println("Input your weight in kilogram:");
        int weight = input.nextInt();

        System.out.println("Input your height in meters:");
        double height = input.nextDouble();

        // Print out the user's input
        System.out.println("Your Weight is : " + weight + "kg");
        System.out.println("Your Height is : " + height + "m");

        // Compute the BMI
        double BMI = weight / (height * height);

        // Print user's  ("Your bmi is : " + BMI + " kg/m2");

        System.out.println("-------------------------------------------------------");

        // Convert double BMI into an int
        int bmiCast = (int)(BMI);

        // Print user's BMI in int
        System.out.println("Your BMI casted into an int is : " + bmiCast + " kg/m2");
        input.close();
    }

}

