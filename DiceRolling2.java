/*
    Assignment: 3
    Description: This program prompts the user for the number of rolls of the dice and computes the occurrence of each face [1-6] and the probability of each face
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.Scanner;

public class DiceRolling2 {

    public static void main(String[] args) {

        // Create a Scanner to receive user input
        Scanner input = new Scanner(System.in);
        System.out.println("How many times do you want to roll the dice?: ");
        int n = input.nextInt();

        // Declare a count variable to count the number of rolls throughout the loop
        int count = 0;

        // Declare a variable for each face of dice [1-6] and initialize it to 0
        int face1 = 0;
        int face2 = 0;
        int face3 = 0;
        int face4 = 0;
        int face5 = 0;
        int face6 = 0;

        // Use a while loop to figure out how many times each face of the dice is rolled based on the number of rolls
        while (count < n) {
            int rolls = (int)(Math.random() * 6 + 1);

            if (rolls == 1) {
                face1++;
            } else if (rolls == 2) {
                face2++;
            } else if (rolls == 3) {
                face3++;
            } else if (rolls == 4) {
                face4++;
            } else if (rolls == 5) {
                face5++;
            } else if (rolls == 6) {
                face6++;
            }
            count++;
        }

        // Print the result and display the occurrence of each face
        System.out.println(" ");
        System.out.println("[When the number of rolls is " + n + "]");
        System.out.println("Occurrence of each face is");
        System.out.println(face1 + ", " + face2 + ", " + face3 + ", " + face4 + ", " + face5 + ", " + face6 + ": " + (double)(n));

        // Display the probability of each face
        System.out.println(" ");
        System.out.println("Therefore the probability of each face is");
        System.out.println((face1 / (double)(n)) + ", " + (face2 / (double)(n)) + ", " + (face3 / (double)(n)) + ", " + (face4 / (double)(n)) + ", " + (face5 / (double)(n)) + ", " + (face6 / (double)(n)));
        input.close();
    }
}
