package com.snakeandladder;

import java.util.*;

public class SnakeAndLadder {
    static int playerOne = 0;

    public static void main(String[] args) {
        System.out.println("Game of Snake and Ladder");
        System.out.println("Welcome player A");

        // Condition For checking player reached 100
        while (playerOne < 100) {
          
            // Condition to check player not goes below 0
            if(playerOne<0){
                playerOne=0;
                continue;
            }
            // Random to get number between 0 to 5:
            Random random = new Random();
            int roll = random.nextInt(5);
            int rolled = roll + 1;

            System.out.println("Player A rolled: " + rolled);// Display the number in the die
            System.out.println("PLayer A is at position: " + playerOne + rolled);// Display the position in the board

            if (rolled == 1) {
                playerOne = rolled - 1;
                System.out.println("SNAKE: Player A found a Snake and moved behind.");
                System.out.println("PLayer A is at position: " + playerOne);
            } else if (rolled == 2) {
                playerOne = rolled + 4;
                System.out.println("LADDER: Player A moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
            } else if (rolled == 3) {
                playerOne = rolled + 9;
                System.out.println("LADDER: Player A moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
            } else if (rolled == 4) {
                playerOne = rolled + 6;
                System.out.println("LADDER: Player A moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
            } else if (rolled == 5) {
                playerOne = rolled + 3;
                System.out.println("LADDER: Player A moved ahead using Ladder.");
                System.out.println("PLayer A is at position: " + playerOne);
            } else {
                System.out.println("NO PLAY: Player A can't move forward.");
                System.out.println("PLayer A is at position: " + playerOne);
            }
            playerOne += 0;
        }
        System.out.println("Game finished");
    }
}
