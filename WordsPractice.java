/*
 *  Assignment: Chapter 4 Lab
 *  Description: The purpose of this program is to review the fundamentals of library functions
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

import java.util.Scanner;

public class WordsPractice {
    public static void main(String[] args) {

        System.out.println("************* PART 1 *************\n");

        // Create a scanner to receive user input
        Scanner input = new Scanner(System.in);

        // Prompt user1 for their name
        System.out.println("User 1, please enter your name: ");
        String str1 = input.nextLine();

        // Prompt user2 for their name
        System.out.println("User 2, please enter your name: ");
        String str2 = input.nextLine();

        // Display the length of both user's name by using the length() method
        System.out.println("User 1, your name's length is " + str1.length());
        System.out.println("User 2, your name's length is " + str2.length());

        // Return the difference in unicode value between their name using the compareTo() method
        System.out.println("User 1 and 2 name's unicode value differs by " + str1.compareTo(str2));
        System.out.println();

        // Use the contains() method to figure out whether the name of user1 contains the string "me"
        if (str1.contains("me")) {
            System.out.println("Me found in user!");
        } else {
            System.out.println("Me not found");
        }

        System.out.println();
        System.out.println("************* PART 2 *************\n");

        String fun = "A1B2C3D4";

        // Use a for loop to iterate through the length of the string to check whether there is a digit in the string
        for (int i = 0; i < fun.length(); i++) {
            if (Character.isDigit(fun.charAt(i))) {
                System.out.println("A digit found: " + fun.charAt(i));
            }

        }
        input.close();
    }
}
