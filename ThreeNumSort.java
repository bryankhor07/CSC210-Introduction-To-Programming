/*
    Assignment: 2
    Description: This program prompts the user to enter 3 integers and then prints the 3 numbers in ascending order
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.Scanner;

public class ThreeNumSort {

    public static void main(String[] args) {

        // Create a scanner to receive user input for the first, second, and third integers
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the first integer:");
        int number1 = input.nextInt();

        System.out.println("Please enter the 2nd integer:");
        int number2 = input.nextInt();

        System.out.println("Please enter the 3rd integer:");
        int number3 = input.nextInt();

        // Use nested if statements to sort the numbers in the correct order
        if (number1 > number2) {
            if (number2 > number3) {
                System.out.println("These are the 3 numbers in order: " + number3 + ", " + number2 + ", " + number1);
            }
        }

        // Use nested if statements to sort the numbers in the correct order
        if (number2 > number1) {
            if (number1 > number3) {
                System.out.println("These are the 3 numbers in order: " + number3 + ", " + number1 + ", " + number2);
            }
        }

        // Use nested if statements to sort the numbers in the correct order
        if (number3 > number2) {
            if (number2 > number1) {
                System.out.println("These are the 3 numbers in order: " + number1 + ", " + number2 + ", " + number3);
            }
        }

        // Use nested if statements to sort the numbers in the correct order
        if (number1 > number3) {
            if (number3 > number2) {
                System.out.println("These are the 3 numbers in order: " + number2 + ", " + number3 + ", " + number1);
            }
        }

        // Use nested if statements to sort the numbers in the correct order
        if (number2 > number3) {
            if (number3 > number1) {
                System.out.println("These are the 3 numbers in order: " + number1 + ", " + number3 + ", " + number2);
            }
        }

        // Use nested if statements to sort the numbers in the correct order
        if (number3 > number1) {
            if (number1 > number2) {
                System.out.println("These are the 3 numbers in order: " + number2 + ", " + number1 + ", " + number3);
            }
        }
        input.close();
    }
}
