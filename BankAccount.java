/*
 Assignment: 4
 Description: This program performs the bank operations such as check balance, deposit money, withdraw money, and changing the answer of security question
 Name: Bryan Khor
 ID: 922228564
 Class: CSC 210-07
 Semester: Fall
*/

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

        // Create a variable to store the user's balance
        double userBalance = 0.0;

        // Create a variable to store the user's answer for the security question
        String userAnswer = "SF";

        // Create a variable to store the user's account number
        int userAccountNumber = 1234567890;

        // Create a variable to store the security question
        String securityQuestion = "In which city were you born?";

        // Create a variable to store the operations
        String operations = ("Operations \n1. Check Balance \n2. Deposit Money \n3. Withdraw Money \n4. Change Answer of Security Question \n5. Exit");

        int choice = 0;

        /*
        Use a while loop to continuously display the bank operations as long as choice do not equal to 5.
        In the while loop, create a scanner to prompt the user to enter their choice,
        and also create a switch statement to call the specific method based on the user's choice of operations.
         */
        Scanner input = new Scanner(System.in);
        while (choice != 5) {            
            System.out.println(operations + "\n");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("In which city were you born?");
                    String answer = input.next();
                    checkBalance(userBalance, answer, 1234567890, userAnswer); // Call the checkBalance method for case 1
                    break;
                case 2:
                    System.out.println("Enter the amount to deposit: ");
                    double deposit = input.nextDouble();
                    userBalance = depositMoney(deposit, userBalance); // Call the depositMoney method for case 2
                    break;
                case 3:
                    System.out.println("Enter the amount to withdraw: ");
                    double amount = input.nextDouble();
                    userBalance = withdrawMoney(amount, userBalance); // Call the withdrawMoney method for case 3
                    break;
                case 4:
                    System.out.println("In which city were you born? ");
                    String answerChange = input.next();
                    userAnswer = changeAnsSecurityQuestion(answerChange); // Call the changeAnsSecurityQuestion method for case 4
                    break;
                case 5:
                    System.out.println("Thank you for visiting us!");
                    return;

            }

        }
        input.close();
    }

    public static void checkBalance(double balance, String answer, int accountNo, String userAnswer) {

        // Use if-else to determine whether the bank account belongs to the user by asking the security question
        if (answer.equals(userAnswer)) {
            System.out.println("Account Number: " + accountNo);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Incorrect answer");
        }

    }

    public static double depositMoney(double deposit, double balance) {

        // Return the amount that the user deposit plus the current balance in the account
        return deposit + balance;
    }

    public static double withdrawMoney(double withdraw, double balance) {

        // Use if-else statement to determine whether there is enough money to withdraw from the balance
        double result = 0;
        if (withdraw <= balance) {
            result = balance - withdraw;
        } else {
            System.out.println("Transaction failed. Not enough balance.");
        }
        return result;
    }

    public static String changeAnsSecurityQuestion(String newAnswer) {

        // Return the new answer for the security question
        return newAnswer;
    }

}
