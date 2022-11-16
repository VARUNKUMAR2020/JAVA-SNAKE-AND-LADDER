package com.snakeandladder;

import java.util.*;

public class SnakeAndLadder {
    static int playerOne = 0;// declared player 1 position

    public static void main(String[] args) {
        System.out.println("Game of Snake and Ladder");
        System.out.println("Welcome player A");

        // Random -to get number between 0 to 5:
        Random random = new Random();
        int roll = random.nextInt(5);
        int rolled = roll + 1;
        System.out.println("Player A rolled: " + rolled);//Display the number in the die
        System.out.println("PLayer A is at position: " + playerOne + rolled);//Display the position in the board
    }
}
