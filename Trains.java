/*
 *  Assignment: Chapter 7 Lab
 *  Description: The purpose of this program is to learn the basics of single-dimensional arrays
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

public class Trains {
    public static void main(String[] args) {

        // Declare an array of size 10
        int[] train = new int[10];

        System.out.println("---- Setting Up Train ----\n");

        // Print the size of the train using the .length method
        System.out.println("Train's Size is " + train.length);

        // Use a for loop to assign 0 as value for all positions of the train
        for (int i = 0; i < train.length; i++) {
            train[i] = 0;
        }

        System.out.println("Confirming no passengers onboard...");

        // Print the value of the 0th position
        System.out.println("The size of car 1 is " + train[0]);

        System.out.println("---- Boarding Passengers and Departing ----\n");

        System.out.println("Boarding Started...");

        // Use a for loop to assign 5 as value for all positions of the train
        for (int i = 0; i < train.length; i++) {
            train[i] = 5;
        }

        System.out.println("2 passengers at car 6 did not have a ticket... Deboarding 2 passengers...");

        // Minus 2 from the 6th car because 2 passengers did not have a ticket
        train[6] = train[6] - 2;
        System.out.println("Current passengers in car 6 is " + train[6]);

        // Use if-else to determine which car has more passengers
        if (train[5] > train[6]) {
            System.out.println("Between car 5 and 6, car 5 has more passengers");
        } else {
            System.out.println("Between car 5 and 6, car 6 has more passengers");
        }

        // Use a for loop to add the total amount of passengers in all cars
        int sum = 0;
        for (int i = 0; i < train.length; i++) {
            sum += train[i];
        }
        System.out.println("Total amount of passengers: " + sum);
    }
}
