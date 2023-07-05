/*
    Assignment: 5
    Description: This program sorts the numbers in an increasing order
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {

        // Create a Scanner to receive user input
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: "); // Prompt the user for the size of the array
        int size = input.nextInt();

        int[] A = new int[size];   // integer Array A

        System.out.println("Enter " + size + " integer data: "); // Prompt the user for the array values

        for (int i = 0; i < size; i++) {
            A[i] = input.nextInt();
        }

        System.out.println("======================");
        System.out.println("Array values:");
        display(A);
        System.out.println("======================");

        // Step 3. use Selection sort algorithm to sort data in A
        // see selectionSort() method
        selectionSort(A);

        // Step 4. display sorted array data
        // this step is done.
        System.out.println("Sorted array values:");
        display(A);
        input.close();
    }

    // display content of integer array
    static void display(int[] B) {
        for (int i = 0; i < B.length; i++) {
            System.out.println("array value:" + i + ": " + B[i]);
        }
    }

    // Sort values in B using Selection sort method
    // Idea: For each loop i (from 0 to n-2),
    // 1. Find index x : the position of the smallest remaining data in B[i...n-1]
    // 2. Swap data in position x with position i
    static void selectionSort(int[] B) {
        int n = B.length;

        //  For each loop i (from 0 to n-2)
        for (int i = 0; i < n - 1; i++) {
            // find index x of minimum data in B[i..n-1]
            int x = findMinimumIndex(B, i, n);

            // swap data in position index with position i
            swapData(B, i, x);
        }
    }

    // find index with minimum value in array B[i...n)
    static int findMinimumIndex(int[] B, int i, int n) {
        int currentMin = B[i];
        n = i;
        for (int j = i + 1; j < B.length; j++) {
            if (currentMin > B[j]) {
                currentMin = B[j];
                n = j;
            }
        }
        return n;
    }

    // Swap B[i] and B[j]
    static void swapData(int[] B, int i, int j) {

        if (j != i) {
            int term = B[j];
            B[j] = B[i];
            B[i] = term;
        }
    }
}
