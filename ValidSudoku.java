import java.util.HashSet;


public class ValidSudoku {
    public static void main(String[] args) {
        String[][] sudokuBoard = {
                {
                        ".",".",".","4",".",".","7",".","9"
                },
                {
                        ".","5","6",".","8",".",".","2","."
                },
                {
                        "7",".","9",".",".","3","4",".","."
                },
                {
                        ".","3",".","5",".","7",".","9","."
                },
                {
                        "5",".","7",".","9",".","2",".","4"
                },
                {
                        ".","9",".","2",".","4",".","6","."
                },
                {
                        ".",".",".","6",".",".","9",".","2"
                },
                {
                        ".","7",".",".","1",".","3","4","."
                },
                {
                        "9",".","2",".",".","5",".",".","8"
                }
        };

        System.out.println(ValidSudoku(sudokuBoard));


    }


    public static boolean ValidSudoku(String[][] board) {
        HashSet[] columns = new HashSet[board[0].length];
        HashSet[] squares = new HashSet[board[0].length];
        for(int i = 0; i < board.length;i++) {
            columns[i] = new HashSet<>();
            squares[i] = new HashSet<>();
        }
        boolean failed = false;
        for(int i = 0; i < board.length; i++) {
            HashSet<Integer> rowCheck = new HashSet<>();
            for(int j = 0; j < board[0].length;j++) {
                // Getting the number
                int current;
                try {
                    current = Integer.parseInt(board[i][j]);
                } catch (NumberFormatException e) {
                    current = 0; // empty case
                }
                if(current > 9 || current < 0) {
                    failed = true;
                }
                if(current != 0) {
                    //rowCheck
                    if (rowCheck.contains(current)) { // duplicate case
                        System.out.println("rows failed");
                        failed = true;
                    } else {
                        rowCheck.add(current);
                    }
                    //columnCheck
                    if (columns[j].contains(current)) { // duplicate case
                        System.out.println("columns failed");
                        failed = true;
                    } else {
                        columns[j].add(current);
                    }
                    //SquareCheck
                    int whichSquare = ((j / 3) + 1) + ((i / 3)*3);
                    if (squares[whichSquare-1].contains(current)) { // duplicate case
                        System.out.println("square " + whichSquare + " failed");
                        failed = true;
                    } else {
                        squares[whichSquare-1].add(current);
                    }
                    if(failed) {
                        System.out.println("row: " + (i+1) + " column: " + (j+1));
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
