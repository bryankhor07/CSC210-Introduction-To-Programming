/*
 *  Assignment: Chapter 5 Lab
 *  Description: This program displays the fibonacci series
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        // Create a Scanner to receive user input
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of terms for Fibonacci series: ");

        int terms = input.nextInt();

        int num1 = 0; // Initialize to zero
        int num2 = 0; // First item in the sequence
        int num3 = 1; // Total of num1 + num2, second

        // Use if-else statement so that user is only able to enter numbers between 1 - 20
        if (terms >= 20 || terms < 0) {
            System.out.println("Please enter a number less than 20 but more than 0");
        } else {
            System.out.println("Fibonacci series is :");


            // Create a for loop to iterate through all items in Fibonacci
            for (int i = 1; i <= terms; i++) {
                num1 = num2;
                num2 = num3;
                num3 = num1 + num2;

                // Display 1 item per iteration
                System.out.print(num1 + " ");
            }
        }
        input.close();
    }
}
