/*
    Assignment 1
    Description: Generate a knock knock joke and prompt the user twice to get their input to complete the joke.
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.Scanner;

public class KnockKnockJoke {
    public static void main(String[] args) {

        //Create a scanner object to receive user input.
        Scanner input = new Scanner(System.in);
        System.out.println("Knock, knock.");

        // Process the user's input.
        String response1 = input.nextLine();

        System.out.println("Luke.");

        // Process the user's second input.
        String response2 = input.nextLine();

        System.out.println("Luke through the peep hole and find out.");
        input.close();
    }
}