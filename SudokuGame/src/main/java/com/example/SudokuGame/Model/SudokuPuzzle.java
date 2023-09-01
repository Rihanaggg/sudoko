package com.example.SudokuGame.Model;

import java.util.List;

import lombok.Data;

@Data
public class SudokuPuzzle {

    private Long id;
    private List<List<Integer>> puzzle;

}
