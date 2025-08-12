//     public static void keySearch(int matrix[][], int key) {
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 if(matrix[i][j] == key) {
//                     System.out.println("("+i+"," + j+")");
//                 }
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int n=3, m=3;
//         int matrix[][] = new int[n][m];

//         Scanner sc = new Scanner(System.in);
//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 matrix[i][j] = sc.nextInt();
//             }
//         }

//         for(int i=0; i<matrix.length; i++) {
//             for(int j=0; j<matrix[0].length; j++) {
//                 System.out.print(matrix[i][j]+ " ");
//             }
//             System.out.println();
//         }

//         keySearch(matrix, 5);
//     }
// }



// spiral matrix

// public class Arrays2D {
//     public static void printSpiral(int matrix[][]) {
//         int startRow =0, startCol = 0, endRow= matrix.length-1, endCol= matrix[0].length-1;

//         while(startRow<=endRow && startCol<=endCol) {
//             //top
//             for(int j=startCol; j<=endCol; j++) {
//                 System.out.print(matrix[startRow][j] + " ");
//             }

//             //right
//             for(int i=startRow+1; i<=endRow; i++) {
//                 System.out.print(matrix[i][endCol] + " ");
//             }

//             //bottom
//             for(int j=endCol-1; j>=startCol; j--) {
//                 if(startRow==endRow) {
//                     break;
//                 }
//                 System.out.print(matrix[endRow][j] + " ");
//             }

//             //left
//             for(int i=endRow-1; i>=startRow+1; i--) {
//                 if(startCol==endCol) {
//                     break;
//                 }
//                 System.out.print(matrix[i][startCol] + " ");
//             }

//             startRow++;
//             startCol++;
//             endRow--;
//             endCol--;
//         }
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16},
//         };
//         printSpiral(matrix);
//     }
// }


// diagonal sum

// public class Arrays2D {
//     public static void diagonalSum(int matrix[][]) {
//         int sum=0;
//         //brute force

//         // for(int i=0; i<matrix.length; i++) {
//         //     for(int j=0; j<matrix[0].length; j++) {
//         //         if(i==j) {
//         //             sum+= matrix[i][j];
//         //         } else if(i+j == matrix.length-1) {
//         //             sum+= matrix[i][j];
//         //         }
//         //     }
//         // }

//         // optimal

//         for(int i=0; i<matrix.length; i++) {
//             sum+=matrix[i][i];
//             if(i!=matrix.length-1-i) {
//                 sum+= matrix[i][matrix.length-1-i];
//             }
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {
//             {1,2,3,4},
//             {5,6,7,8},
//             {9,10,11,12},
//             {13,14,15,16},
//         };
//         diagonalSum(matrix);
//     }
// }


// staricase search

// public class Arrays2D {
    // public static boolean staricase(int matrix[][], int key) {
    //     int row=0, col=matrix[0].length-1;

    //     while(row<matrix.length && col>=0) {
    //         if(matrix[row][col] == key) {
    //             System.out.println("("+row+","+col+")");
    //             return true;
    //         } else if(matrix[row][col] <key) {
    //             row++;
    //         } else {
    //             col--;
    //         }
    //     }
    //     return false;
    // }

//     public static boolean staricase(int matrix[][], int key) {
//         int row=matrix.length-1, col=0;
//         while(row>=0 && col<matrix[0].length) {
//             if(matrix[row][col]==key) {
//                 System.out.println("("+row+","+col+")");
//                 return true;
//             } else if(matrix[row][col]<key) {
//                 col++;
//             } else {
//                 row--;
//             }
//         }
//         System.out.println("Invalid");
//         return false;
//     }
//     public static void main(String[] args) {
//         int matrix[][] = {
//             {10,20,30,40},
//             {15,25,35,45},
//             {27,29,37,48},
//             {32,33,39,50},
//         };
//         staricase(matrix, 33);
//     }
// }


// Questions

//1
// public class Arrays2D {
//     public static int countKey(int arr[][], int key) {
//         int count =0;
//         for(int i=0; i<arr.length; i++) {
//             for(int j=0; j<arr[0].length; j++) {
//                 if(arr[i][j] == key) {
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         int array[][] = { {4,7,8},{8,8,7} };
//         int key = 7;
//         System.out.println(countKey(array, key));
//     }
// }

//2
// public class Arrays2D {
//     public static int sumOf2nd(int nums[][]) {
//         int sum=0;
//         for(int i=0; i<nums.length; i++) {
//             sum+=nums[1][i];
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
//         System.out.println(sumOf2nd(nums));
//     }
// }


//3
public class Arrays2D {
    public static void transpose(String matrix[][]) {
        String tmatrix[][] = new String[matrix[0].length][matrix.length];
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                tmatrix[j][i] = matrix[i][j];
            }
        }

        for(int i=0; i<tmatrix.length; i++) {
            for(int j=0; j<tmatrix[0].length; j++) {
                System.out.print(tmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String matrix[][] = {{"a11", "a12", "a13"}, {"a21", "a22", "a23"}};
        transpose(matrix);
    }
}