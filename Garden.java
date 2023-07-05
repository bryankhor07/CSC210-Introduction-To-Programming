/*
 *  Assignment: Chapter 8 Lab
 *  Description: The purpose of this program is to learn the basics of two-dimensional arrays
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

public class Garden {

    public static void main(String[] args) {

        // Create a 2D array to store Kevin's garden
        int[][] garden = {
                {0, 0, 0, 1},
                {0, 1, 0, 0},
                {0, 0, 0, 1}
        };

        printGarden(garden);

        System.out.println();

        addFlower(garden, 1, 0);

        System.out.println("Flowers in Column 1: " + countFlowersColumn(garden, 1));
        System.out.println("Flowers in Row 1: " + countFlowersRow(garden, 1));
    }

    // Create a method to print the garden in a coordinate plane
    public static int[][] printGarden(int[][] garden) {

        // Use a for loop to print out the garden
        for (int row = 0; row < garden.length; row++) {
            for (int column = 0; column< garden[row].length; column++) {
                System.out.print(garden[row][column] + " ");
            }
            System.out.println();
        }
        return garden;
    }

    // Create a method to add a flower to Kevin's garden
    public static void addFlower(int[][] garden, int column, int row) {

        // Add one flower to column 1, row 0
        garden[row][column] = garden[row][column] + 1;

       printGarden(garden);

    }

    // Create a method to count the number of flowers in a column
    public static int countFlowersColumn(int[][] garden, int column) {

        int count = 0;

        // Use a for loop to check how many flowers exists in a column
        for (int i = 0; i < garden.length; i++) {
            if (garden[i][column] == 1) {
                count++;
            }
        }

        return count;
    }

    // Create a method to count the number of flowers in a row
    public static int countFlowersRow(int[][] garden, int row) {

        int count = 0;

        //Use a for loop to check how many flowers exists in a row
        for (int i = 0; i < garden[row].length; i++) {
            if (garden[row][i] == 1) {
                count++;
            }
        }

        return count;
    }
}