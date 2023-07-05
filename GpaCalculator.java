/*
 *  Assignment: Chapter 3 Lab
 *  Description: This program calculates the Gpa of a single semester based on the overall scores of one course.
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class GpaCalculator {

    public static void main(String[] args) {

        // Prompt the user to enter their percentage for a single class
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your overall percentage for a single class: ");
        double percentage = input.nextDouble();

        // Create a variable to store the letter grade
        String grade;

        // Create a variable to store the gpa
        double gpa;

        // Input the grade and gpa when percentage is >= 97.0
        if (percentage >= 97.0) {
            grade = "A+";
            gpa = 4.0;
        }
        // Input the grade and gpa when percentage is >= 93.0 & percentage < 97.0
        else if (percentage >= 93.0 && percentage < 97.0) {
            grade = "A";
            gpa = 4.0;
        }
        // Input the grade and gpa when percentage is >= 90.0 & percentage < 93.0
        else if (percentage >= 90.0 && percentage < 93.0) {
            grade = "A-";
            gpa = 3.7;
        }
        // Input the grade and gpa when percentage is >= 87.0 & percentage < 90.0
        else if (percentage >= 87.0 && percentage < 90.0) {
            grade = "B+";
            gpa = 3.3;
        }
        // Input the grade and gpa when percentage is >= 83.0 & percentage < 87.0
        else if (percentage >= 83.0 && percentage < 87.0) {
            grade = "B";
            gpa = 3.0;
        }
        // Input the grade and gpa when percentage is >= 80.0 & percentage < 83.0
        else if (percentage >= 80.0 && percentage < 83.0) {
            grade = "B-";
            gpa = 2.7;
        }
        // Input the grade and gpa when percentage is >= 77.0 & percentage < 80.0
        else if (percentage >= 77.0 && percentage < 80.0) {
            grade = "C+";
            gpa = 2.3;
        }
        // Input the grade and gpa when percentage is >= 70.0 & percentage < 77.0
        else if (percentage >= 70.0 && percentage < 77.0) {
            grade = "C";
            gpa = 2.0;
        }
        // Input the grade and gpa when percentage is >= 67.0 & percentage < 70.0
        else if (percentage >= 67.0 && percentage < 70.0) {
            grade = "D+";
            gpa = 1.7;
        }
        // Input the grade and gpa when percentage is >= 60.0 & percentage < 67.0
        else if (percentage >= 60.0 && percentage < 67.0) {
            grade = "D";
            gpa = 1.0;
        }
        // Input the grade and gpa when percentage is < 60.0
        else {
            grade = "F";
            gpa = 0.1;
        }

        // Print user's percentage, grade and gpa
        System.out.println("Your percentage is " + percentage + "% and you got grade " + grade + " with a gpa of " + gpa);
        input.close();
    }
}
