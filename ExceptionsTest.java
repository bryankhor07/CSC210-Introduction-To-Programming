/*
 *  Assignment: Chapter 12 Lab
 *  Description: The purpose of this program is to learn the fundamentals of error handling
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

public class ExceptionsTest {

    public static void main(String[] args) {

        // Create an array with values {1, 2, 3}
        int[] array = {1, 2, 3};

        // Create an int variable "x" and initialize it to 0
        int x = 0;

        // Create a try-catch-finally block
        try {
            x = array[4]; // Set "x" to the value of "array[4]
        } catch (Exception e) {
            x = -1; // Set "x" to -1
        } finally {
            System.out.println(x); // Display "x"
        }

        // Create try-catch block
        try {
            x = 5; // Set "x" to 5
            methodWithException(array); // Invoke the methodWithException with "array" as the argument
            x = 6; // Set "x" to 6
        } catch (Exception e) {
            System.out.println(x); // Display "x"
        }
    }

    // Create a static method called methodWithException with int[] array as parameter and throws IndexOutOfBoundsException
    public static void methodWithException(int[] array) throws IndexOutOfBoundsException {

        int y = array[50]; // Set "y" to array[50]
    }
}