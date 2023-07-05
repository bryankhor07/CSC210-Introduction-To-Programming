/*
 Assignment: 7
 Description: This program counts the number of occurrences of a key (word) in a text file
 Name: Bryan Khor
 ID: 922228564
 Class: CSC 210-07
 Semester: Fall
*/

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class CountWord {

    public static void main(String[] args) throws Exception {

        // Create a Scanner object to receive user input
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the name of the file
        System.out.println("Please enter the name of the file: ");
        String fileName = input.next();

        // Prompt the user to enter the word to search within the file
        System.out.println("Enter the word to search for: ");
        String keyword = input.next();

        // Prompt the user to see whether they would like to ignore casing
        System.out.println("Would you like to ignore case? (\"y\" for yes & \"n\" for no)");
        String choice = input.next();

        // Create a variable called countOfWords ,assign it to countNumOfWordsInFile method to invoke the method and display the total number of words in the file
        int countOfWords = countNumOfWordsInFile(fileName);
        System.out.println("Total words: " + countOfWords);

        // Create a variable called count numOfKeywords, assign it to numOfOccurrences method to invoke the method and display the total number of words that is being searched
        int numOfKeywords = numOfOccurrences(fileName, keyword, choice);
        System.out.println(keyword + " appeared " + numOfKeywords + " times");
        input.close();
    }

    // The main function of this method is to count the number of words in the file
    public static int countNumOfWordsInFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName); // Create a file instance

        int countOfWords = 0; // Keep count of the number of words in the file

        Scanner input = new Scanner(new File(fileName)); // Create a Scanner for the file

        while (input.hasNext()) { // Read data from the file
            String word = input.next();
            countOfWords++; // Increment the number of words
        }
        input.close(); // Close the file

        return countOfWords;
    }

    // The main function of this method is to count the occurrences of a keyword that is being searched throughout the text.
    // It also considers whether the user prefers to ignore the casing or not
    public static int numOfOccurrences(String fileName, String keyword, String choice) throws FileNotFoundException {

        File file = new File(fileName); // Create a file instance

        int countOfKeywords = 0; // Keep track of the number of occurrences of this specific keyword

        Scanner input = new Scanner(new File(fileName)); // Create a Scanner for the file

        // The while loop reads data from the file and checks if it contains the specific keyword based on the user's preference of ignoring the case or not
        while (input.hasNext()) {
            String word = input.next();
            if (choice.equals("y")) {
                if (word.equalsIgnoreCase(keyword)) {
                    countOfKeywords++;
                }
            }
            if (choice.equals("n")) {
                if (word.equals(keyword)) {
                    countOfKeywords++;
                }
            }

        }
        input.close(); // Close the file

        return countOfKeywords;
    }
}
