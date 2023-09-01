package com.example.SudokuGame.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.SudokuGame.Service.Sudokucreator;

@Controller
public class SudokuController {

    @GetMapping("/input")
    public String showInputForm(Model model) {
        Sudokucreator generator = new Sudokucreator();
        model.addAttribute("generator", generator);
        return "input"; 
    }

    @PostMapping("/input")
    public String generatePuzzle(Sudokucreator generator, Model model) {
        int[][] puzzle = generator.generatePuzzle();
        model.addAttribute("puzzle", puzzle);
        return "create"; 
    }

    @GetMapping("/input/board")
    public String showBoard()
    {
        return "create";
    }
}