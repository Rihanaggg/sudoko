// package com.example.SudokuGame.Service;

// import java.util.ArrayList;
// import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.example.SudokuGame.Model.Cell;
// import com.example.SudokuGame.Model.SudokuGrid;
// import com.example.SudokuGame.Repository.SudokuRepository;


//     @Service
//     public class SudokuService {

//     @Autowired
//     SudokuRepository sudokuRepo;

//     private SudokuGrid sudokuGrid;

//     public SudokuGrid initializeEmptyGrid() {
//         List<Cell> cells = new ArrayList();
//         for(int sudokurow=0; sudokurow < 9;sudokurow++ ){
//             for(int sudokucolumn = 0;sudokucolumn <9 ;sudokucolumn++){
//                 Cell cell = new Cell(sudokurow,sudokucolumn,0);
//                 cells.add(cell);
//             }
//         }
//         SudokuGrid grid = new SudokuGrid(cells);
//         return grid;
//     }

//     // public void updateCellValue(int row, int column, int value) {
//     //     if()
//     // }

//     // public boolean verifySudoku() {
        
//     //     return true; 
//     // }


// }


