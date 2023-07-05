/*
    Assignment: 5
    Description: This program uses one-dimensional array to implement the TicTaeToc Game
    Name: Bryan Khor
    ID: 922228564
    Class: CSC 210-07
    Semester: Fall
 */

import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {

        // create scanner to read user input
        // create char[] array to store board values
        // set positions of board from 1 to 9
        // 2 players: 'X' and 'O', start with 'X'
        Scanner input = new Scanner(System.in);
        char[] board = {'1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char player = 'X';

        display(board);

        // play game until gameOver is true
        boolean gameOver = false;
        while (!gameOver) {
            // get current player choice, and update board value
            receiveUserChoice(player, input, board);
            // display the updated board
            display(board);
            // switch player 'X' -> 'O' or 'O' -> 'X'
            player = (player == 'X') ? 'O' : 'X';
            // check for winner, draw or game is not over yet
            gameOver = isGameOver(board);
        }
        input.close();
    }

    // display board in 3x3 layout
    // note that array indices from 0 to 8 = positions from 1 to 9
    public static void display(char[] board) {
        System.out.println("");
        System.out.println(board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println(board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println(board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println("");
    }

    // get current player choice, and update board value
    public static void receiveUserChoice(char player, Scanner input, char[] board) {
        // Step 1: get user input, a position from 1 to 9
        // Step 2: make sure it is a valid position, and the position is not taken yet
        //    2.1: if it is valid input, mark the board position with the current player
        //    2.2: if it is not valid, print message repeat Step 1. until a valid input is obtained
        // Add statements

        System.out.println(player + " turn, enter a position: ");
        int position = input.nextInt();

        while (board[position - 1] == 'X' || board[position - 1] == 'O') {
            System.out.println("Invalid position!");
            System.out.println(player + " turn, enter a position: ");
            position = input.nextInt();
        }

        if (board[position - 1] != 'X' || board[position - 1] != 'O') {
            board[position - 1] = player;
        }
    }


    // check for winner, draw or game is not over yet
    public static boolean isGameOver(char[] board) {

        // step 1: if there is a winner, print winner message, return true
        // step 2: if it is a draw, print draw message, return true
        // step 3: else the game is not over yet, return false

        String messageX = "X is the winner!";
        String messageO = "O is the winner!";

        if (board[0] == 'X' && board[1] == 'X' && board[2] == 'X') { // Top row
            System.out.println(messageX);
            return true;
        } else if (board[0] == 'O' && board[1] == 'O' && board[2] == 'O') { // Top row
            System.out.println(messageO);
            return true;
        } else if (board[3] == 'X' && board[4] == 'X' && board[5] == 'X') { // Mid row
            System.out.println(messageX);
            return true;
        } else if (board[3] == 'O' && board[4] == 'O' && board[5] == 'O') { // Mid row
            System.out.println(messageO);
            return true;
        } else if (board[6] == 'X' && board[7] == 'X' && board[8] == 'X') { // Bottom row
            System.out.println(messageX);
            return true;
        } else if (board[6] == 'O' && board[7] == 'O' && board[8] == 'O') { // Bottom row
            System.out.println(messageO);
            return true;
        } else if (board[0] == 'X' && board[3] == 'X' && board[6] == 'X') { // Left column
            System.out.println(messageX);
            return true;
        } else if (board[0] == 'O' && board[3] == 'O' && board[6] == 'O') { // Left column
            System.out.println(messageO);
            return true;
        } else if (board[1] == 'X' && board[4] == 'X' && board[7] == 'X') { // Mid column
            System.out.println(messageX);
            return true;
        } else if (board[1] == 'O' && board[4] == 'O' && board[7] == 'O') { // Mid column
            System.out.println(messageO);
            return true;
        } else if (board[2] == 'X' && board[5] == 'X' && board[8] == 'X') { // Right column
            System.out.println(messageX);
            return true;
        } else if (board[2] == 'O' && board[5] == 'O' && board[8] == 'O') { // Right column
            System.out.println(messageO);
            return true;
        } else if (board[0] == 'X' && board[4] == 'X' && board[8] == 'X') { // Cross 1
            System.out.println(messageX);
            return true;
        } else if (board[0] == 'O' && board[4] == 'O' && board[8] == 'O') { // Cross 1
            System.out.println(messageO);
            return true;
        } else if (board[6] == 'X' && board[4] == 'X' && board[2] == 'X') { // Cross 2
            System.out.println(messageX);
            return true;
        } else if (board[6] == 'O' && board[4] == 'O' && board[2] == 'O') { // Cross 2
            System.out.println(messageO);
            return true;
        } else if (board[0] != '1' && board[1] != '2' && board[2] != '3' && board[3] != '4' && board[4] != '5' && board[5] != '6' && board[6] != '7' && board[7] != '8' && board[8] != '9') { // Draw
            System.out.println("It is a draw");
            return true;
        }

        return false;
    }

}
