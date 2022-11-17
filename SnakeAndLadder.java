package com.snakeandladder;

import java.util.*;

public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println("Game of Snake and Ladder");
        System.out.println("Welcome player A");

        // Random -to get number between 0 to 5:
        Random random = new Random();
        int roll = random.nextInt(5);
        int rolled = roll + 1;
        int playerOne = 0;
        int move = 0;
        System.out.println("Player A rolled: " + rolled);// Display the number in the die
        System.out.println("PLayer A is at position: " + playerOne + rolled);// Display the position in the board

        // switch case - Condition for following number:
        switch (rolled) {
            case 1:
                move = rolled - 1;
                playerOne = move;
                System.out.println("SNAKE: Player A found a Snake and moved behind.");
                System.out.println("PLayer A is at position: " + playerOne);
                break;
            case 2:
                move = rolled + 4;
                playerOne = move;
                System.out.println("LADDER: Player 1 moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
                break;
            case 3:
                move = rolled + 9;
                playerOne = move;
                System.out.println("LADDER: Player 1 moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
                break;
            case 4:
                move = rolled + 6;
                playerOne = move;
                System.out.println("LADDER: Player 1 moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
                break;
            case 5:
                move = rolled + 3;
                playerOne = move;
                System.out.println("LADDER: Player 1 moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
                break;
            case 6:
                System.out.println("NO PLAY: Player 1 can't move forward.");
                System.out.println("PLayer 1 is at position => " + playerOne);
                break;

        }
    }
}
