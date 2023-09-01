package com.example.SudokuGame.Service;

import org.springframework.stereotype.Service;

@Service
public class Sudokucreator {

    private static final int SIZE = 9;

    private int[][] puzzle;
    private String[][] userInput;

    public Sudokucreator() {
        puzzle = new int[SIZE][SIZE];
        userInput = new String[SIZE][SIZE];
    }

    public int[][] generatePuzzle() {
        for (int row = 0; row < SIZE; row++) {
            for (int col = 0; col < SIZE; col++) {
                String userInputValue = userInput[row][col];
                if (!userInputValue.isEmpty()) {
                    int value = Integer.parseInt(userInputValue);
                    if (isValidPlacement(row, col, value) && isValidValue(value)) {
                        puzzle[row][col] = value;
                    } else {
                        System.out.println("Invalid placement. Try again.");
                        col--;
                    }
                }
            }
        }
        return puzzle;
    }

    private boolean isValidPlacement(int row, int col, int num) {
        if (num == 0) {
            return true;
        }
        for (int i = 0; i < SIZE; i++) {
            if (puzzle[row][i] == num || puzzle[i][col] == num ||
                puzzle[row - row % 3 + i / 3][col - col % 3 + i % 3] == num) {
                return false;
            }
        }
        return true;
    }

    private boolean isValidValue(int num) {
        return num >= 1 && num <= 9;
    }

    public String[][] getUserInput() {
        return userInput;
    }

    public void setUserInput(String[][] userInput) {
        this.userInput = userInput;
    }
}
