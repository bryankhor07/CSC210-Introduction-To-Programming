/*
    Assignment: 2
    Description: This program simulates the rolling of a 6-faced dice, and it checks whether the number you got is even or odd or divisible by 3
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

public class DiceRolling {

    public static void main(String[] args) {

        // Create a random number generator
        int randomNumber = (int)(Math.random() * 6 + 1);

        System.out.println("I got " + randomNumber);

        // Use if-else statements to figure out whether the number is even or odd
        if (randomNumber % 2 == 0) {
            System.out.println("This is an even number");
        } else {
            System.out.println("This is an odd number");
        }

        // Use if-else statements to figure out whether the number is divisible by 3
        if (randomNumber % 3 == 0) {
            System.out.println("This is divisible by 3");
        } else {
            System.out.println("This is not divisible by 3");
        }


    }
}
