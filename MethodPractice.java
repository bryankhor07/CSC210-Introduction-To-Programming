/*
 *  Assignment: Chapter 6 Lab
 *  Description: This program is for me to review the fundamentals of methods
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

public class MethodPractice {

    public static void main(String[] args) {

        // Invoke printHelloWorld() 3 times
        printHelloWorld();
        printHelloWorld();
        printHelloWorld();

        // Invoke printIntegers() with a 5 as argument
        printIntegers(5);

        // Compute a, b and c using code from handout
        int a = addIntegers(5, 4);
        int b = addIntegers(12, 6);
        int c = addIntegers(a, b);

        // Print out the value of c
        System.out.println(c);
        // Invoke printAddIntegers() with 10 and 20 as argument
        printAddIntegers(10, 20);

        // Invoke printAddIntegers() with 25 and 4 as argument
        printAddIntegers(25, 4);

        // Print out the result of isEven() using 4 as argument
        System.out.println(isEven(4));

        // Print out the result of isEven() using 11 as argument
        System.out.println(isEven(11));

        // Print out the result of isEven() using addIntegers(5,5) as argument
        System.out.println(isEven(addIntegers(5, 5)));

        // Print out the result of linearFunction() using 5.0, 2.5 and 0.0 as argument
        System.out.println(linearFunction(5.0, 2.5, 0.0));

        // Print out the result of linearFunction() using 1.0, 2.0 and 3.0 as argument
        System.out.println(linearFunction(1.0, 2.0, 3.0));

        // Print out the result of linearFunction() using 15, 200 and 5 as argument
        System.out.println(linearFunction(15, 200, 5));
        // END MAIN
    }

    /*
        Method 1: printHelloWorld()
            - No return type
            - No arguments
            - Prints out "Hello World!"
     */
    public static void printHelloWorld() {
        System.out.println("Hello World!");
    }

    /*
        Method 2: printIntegers()
            - No return type
            - 1 int argument
            - Prints out argument 10 times (HINT: While/For loop) with a space follow
     */
    public static void printIntegers(int num) {
        for (int i = 0; i < 10; i++) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    /*
        Method 3: addIntegers()
            - int return type
            - 2 int argument
            - Returns the sum of a and b (HINT: return statement that returns a + b)
     */
    public static int addIntegers(int a, int b) {
        // Return statement needed to remove error
        return (a + b);
    }

    /*
        Method 4: printAddIntegers()
            - No return type
            - 2 int argument
            - Step 1: Create a new variable and set it equal to the result of addIntegers(a,b)
            - Step 2: Call printIntegers() with the result above in Step 1 as argument
     */
    public static void printAddIntegers(int a, int b) {
        int sum = addIntegers(a, b);
        printIntegers(sum);
    }

    /*
        Method 5: isEven()
            - Boolean return type
            - 1 int argument
            - If num is even, then return true
            - Otherwise, return false
     */
    public static boolean isEven(int num) {
        // Return statement needed to remove error
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*
        Method 6: linearFunction()
            - Double return type
            - 3 double argument
            - Returns the result of slope * x + y intercept
     */
    static double linearFunction(double x, double slope, double yIntercept) {
        // Return statement needed to remove error
        return (slope * x + yIntercept);
    }
}