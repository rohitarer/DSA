// 1. Basic pgm of Backtracking

// public class Backtraking {
//     public static void reduce(int arr[], int idx, int val) {
//         if(arr.length == idx) {
//             printArr(arr);
//             return;
//         }

//         arr[idx] = val;
//         reduce(arr, idx+1, val+1);
//         arr[idx] = arr[idx]-2;
//     }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int arr[] = new int[5];
//         reduce(arr, 0, 1);
//         printArr(arr);
//     }
// }


// 2. Find and print all subsets of a given string

// public class Backtracking {
//     public static void findSubsets(String str, String ans, int i) {
//         if(str.length() == i) {
//             if(ans.length() == 0) {
//                 System.out.println("null");
//             } else {
//                 System.out.println(ans);
//             }
//             return;
//         }
//         findSubsets(str, ans+ str.charAt(i), i+1);

//         findSubsets(str, ans, i+1);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }


// 3. Find and print all the permutations of a given String

// public class Backtracking {
//     public static void findSubsets(String str, String ans, int i) {
//         if(str.length() == i) {
//             if(ans.length() == 0) {
//                 System.out.println("null");
//             } else {
//                 System.out.println(ans);
//             }
//             return;
//         }
//         findSubsets(str, ans+ str.charAt(i), i+1);

//         findSubsets(str, ans, i+1);
//     }
//     public static void main(String[] args) {
//         String str = "abc";
//         findSubsets(str, "", 0);
//     }
// }


// 4. N-Queens
// Place N queens on a NxN chessboard such that no 2 queens can attack each other
// TC = O(n * T(n-1) + isSafe)
// public class Backtracking {
//     public static boolean isSafe(char board[][], int row, int col) {
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         for(int i=row-1, j=col-1; i>=0 & j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         for(int i=row-1, j=col+1; i>=0 & j<board.length; i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][], int row) {
//         if(row == board.length) {
//             printBoard(board);
//             return;
//         }
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'x';
//             }
//         }
//     }

//     public static void printBoard(char board[][]) {
//         System.out.println("--------- chess board ---------");
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int n=4;
//         char board[][] = new char[n][n];
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'x';
//             }
//             // System.out.println();
//         }

//         nQueens(board, 0);
//     }
// }


// 5. N-Queens - count ways
// Count total no. of ways in which we can solve N Queens problem.

// public class Backtracking {
//     public static boolean isSafe(char board[][], int row, int col) {
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         for(int i=row-1, j=col-1; i>=0 & j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         for(int i=row-1, j=col+1; i>=0 & j<board.length; i--,j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void nQueens(char board[][], int row) {
//         if(row == board.length) {
//             count++;
//             return;
//         }
//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 nQueens(board, row+1);
//                 board[row][j] = 'x';
//             }
//         }
//     }

//     static int count =0;
//     public static void main(String[] args) {
//         int n=4;
//         char board[][] = new char[n][n];
        
//         for(int i=0; i<n; i++) {
//             for(int j=0; j<n; j++) {
//                 board[i][j] = 'x';
//             }
//         }

//         nQueens(board, 0);
//         System.out.println("Total ways to solve n Queens = " + count);
//     }
// }


// 6. N-Queens - print 1 solution
// Check if problem can be solved & print only 1 solution to N Queens problem.

// public class Backtracking {
//     public static boolean isSafe(char board[][], int row, int col) {
//         for(int i=row-1; i>=0; i--) {
//             if(board[i][col] == 'Q') {
//                 return false;
//             }
//         }

//         for(int i=row-1, j=col-1; i>=0 & j>=0; i--,j--) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }

//         for(int i=row-1, j=col+1; i>=0 & j<board.length; i--, j++) {
//             if(board[i][j] == 'Q') {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void printBoard(char board[][]) {
//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 System.out.print(board[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static boolean nQueens(char board[][], int row) {
//         if(row == board.length) {
//             return true;
//         }

//         for(int j=0; j<board.length; j++) {
//             if(isSafe(board, row, j)) {
//                 board[row][j] = 'Q';
//                 if(nQueens(board, row+1)) {
//                     return true;
//                 }
//                 board[row][j] = 'x';
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         int n=4;
//         char board[][] = new char[n][n];

//         for(int i=0; i<board.length; i++) {
//             for(int j=0; j<board.length; j++) {
//                 board[i][j] = 'x';
//             }
//         }

//         if(nQueens(board, 0)) {
//             System.out.println("Solution is possible");
//             printBoard(board);
//         } else {
//             System.out.println("Solution is not possible");
//         }
//     }
// }


// 7. Grid Ways
// Find no. of ways to reach from (0, 0) to (N-1, M-1) in a NxM Grid.
// Allowed moves - right or down.

// public class Backtracking {
//     public static int gridWays(int i, int j, int n, int m) {
//         if(i == n-1 && j == m-1) {
//             return 1;
//         } else if(i == n || j == m) {
//             return 0;
//         }

//         int w1 = gridWays(i+1, j, n, m);
//         int w2 = gridWays(i, j+1, n, m);

//         return w1+w2;
//     }
//     public static void main(String[] args) {
//         int n=3, m=3;
//         System.out.println(gridWays(0, 0, n, m));
//     }
// }

// For Linear Time
// total ways = (n-1 + m-1)! / (n-1)!(m-1)!
// TC = O(n+m)


// 8. Sudoku
// Write a function to complete a Sudoku.

// public class Backtracking {
//     public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
//         for(int i=0; i<=8; i++) {
//             if(sudoku[i][col]==digit) {
//                 return false;
//             }
//         }

//         for(int j=0; j<=8; j++) {
//             if(sudoku[row][j] == digit) {
//                 return false;
//             }
//         }

//         int sr = (row/3)*3;
//         int sc = (col/3)*3;

//         for(int i=sr; i<sr+3; i++) {
//             for(int j=sc; j<sc+3; j++) {
//                 if(sudoku[i][j]==digit) {
//                     return false;
//                 }
//             }
//         }
//         return true;
//     }
//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//         if(row == 9) {
//             return true;
//         }

//         int nextRow = row, nextCol = col+1;
//         if(nextCol==9) {
//             nextRow = row+1;
//             nextCol = 0;
//         }

//         if(sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         for(int digit=1; digit<=9; digit++) {
//             if(isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit;
//                 if(sudokuSolver(sudoku, nextRow, nextCol)) {
//                     return true;
//                 }
//                 sudoku[row][col]=0;
//             }
//         }
//         return false;
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for(int i=0; i<sudoku.length; i++) {
//             for(int j=0; j<sudoku.length; j++) {
//                 System.out.print(sudoku[i][j] + " " );
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         int sudoku[][] = {
//             {0, 0, 8, 0, 0, 0, 0, 0, 0},
//             {4, 9, 0, 1, 5, 7, 0, 0, 2},
//             {0, 0, 3, 0, 0, 4, 1, 9, 0},
//             {1, 8, 5, 0, 6, 0, 0, 2, 0},
//             {0, 0, 0, 0, 2, 0, 0, 6, 0},
//             {9, 6, 0, 4, 0, 5, 3, 0, 0},
//             {0, 3, 0, 0, 7, 2, 0, 0, 4},
//             {0, 4, 9, 0, 3, 0, 0, 5, 7},
//             {8, 2, 7, 0, 0, 9, 0, 1, 3},
//         };

//         if(sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("Sudoku is solved");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("Sudoku is not solved");
//         }
//     }
// }


public class Backtracking {
    public static void printSoln(int sol[][]) {
        for(int i=0; i<sol.length; i++) {
            for(int j=0; j<sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(int maze[][], int i, int j) {
        return (i>=0 && i<maze.length && j>=0 && j<maze.length && maze[i][j]==1);
    }
    public static boolean solveMazeUtil(int maze[][], int i, int j, int sol[][]) {
        if(i==maze.length-1 && j==maze.length-1 && maze[i][j]==1) {
            sol[i][j] = 1;
            return true;
        }

        if(isSafe(maze, i, j)==true) {
            if(sol[i][j]==1) {
                return false;
            }
            sol[i][j]=1;
            if(solveMazeUtil(maze, i+1, j, sol)) {
                return true;
            }
            if(solveMazeUtil(maze, i, j+1, sol)) {
                return true;
            }
            sol[i][j] = 0;
            return false;
        }
        return false;
    }
    public static boolean solveMaze(int maze[][]) {
        int n = maze.length;
        int sol[][] = new int[n][n];

        if(solveMazeUtil(maze, 0, 0, sol)==false) {
            System.out.println("Solution does not exist");
            return false;
        }

        printSoln(sol);
        return true;
    }
    public static void main(String[] args) {
        int maze[][] = { 
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1} 
        };
        
        solveMaze(maze);
        // printSoln(maze);
    }
}