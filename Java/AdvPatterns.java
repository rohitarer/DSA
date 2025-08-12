// Hollow Rectangle
// public class AdvPatterns {
//     public static void holRect(int m, int n) {
//         for(int i=1; i<=m; i++) {
//             for(int j=1; j<=n; j++) {
//                 if(i==1 || i==m || j==1 || j==n) {
//                     System.out.print("* ");
//                 } else {
//                     System.out.print("  ");
//                 }
                
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         holRect(4, 5);
//     }
// }



// inverted rotated half pyramid
// public class AdvPatterns {
//     public static void invRotHalfPyramid(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=i; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         invRotHalfPyramid(5);
//     }
// }



// inverted half pyramid with numbers

// public class AdvPatterns {
//     public static void invHalfPyramidNum(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i+1; j++) {
//                 System.out.print(j + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         invHalfPyramidNum(5);
//     }
// }


// Flyod's Trainagle

// public class AdvPatterns {
//     public static void FlyodsTri(int n) {
//         int num=1;
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(num++ + " ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         FlyodsTri(5);
//     }
// }


// 0-1 Triangle
// public class AdvPatterns {
//     public static void Tri01(int n) {
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 if((i+j) % 2 == 0) {
//                     System.out.print("1 ");
//                 } else {
//                     System.out.print("0 ");
//                 }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         Tri01(5);
//     }
// }


// Butterfly
// public class AdvPatterns {
//     public static void butterfly(int n) {
//         // top
//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             for(int k=1; k<=(n-i)*2; k++) {
//                 System.out.print("  ");
//             }
//             for(int l=1; l<=i; l++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }

//         // bottom
//         for(int i=n; i>=1; i--) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             for(int k=1; k<=(n-i)*2; k++) {
//                 System.out.print("  ");
//             }
//             for(int l=1; l<=i; l++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         butterfly(4);
//     }
// }


// Solid Rhombus
// public class AdvPatterns {
//     public static void solidRhombus(int n) {
//         for (int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=n; k++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         solidRhombus(5);
//     }
// }


// Hollow solid Rohmbus
// public class AdvPatterns {
//     public static void hollowSolidRhombus(int n) {
//         for (int i=1; i<=n; i++) {
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print("  ");
//             }
//             for(int k=1; k<=n; k++) {
//                 if(i==1 || i==n || k==1 || k==n) {
//                         System.out.print("* ");
//                     } else {
//                         System.out.print("  ");
//                     }
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args) {
//         hollowSolidRhombus(5);
//     }
// }


// diamond

public class AdvPatterns {
    public static void diamond(int n) {
        //top
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i)-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //bottom
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=n-i; j++) {
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i)-1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        diamond(4);
    }
}