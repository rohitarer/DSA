// 1. Check if Odd or Even

// public class BitManipulation {
//     public static void evenOrOdd(int n) {
//         int bitMask = 1;

//         if((n & bitMask)==0) {
//             System.out.println("It is even number");
//         } else {
//             System.out.println("It is odd number");
//         }
//     }
//     public static void main(String[] args) {
//         evenOrOdd(5);
//         evenOrOdd(98);
//         evenOrOdd(9);
//     }
// }


// 2. Get ith Bit

// public class BitManipulation {
//     public static int getIth(int n, int i) {
//         int bitMask = 1<<i;

//         if((n&bitMask) == 0) {
//             return 0;
//         } else {
//             return 1;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(getIth(10, 2));
//     }
// }



// 3. Set ith Bit

// public class BitManipulation {
//     public static int setIth(int n, int i) {
//         int bitMask = 1<<i;

//         return n|bitMask;
//     }
//     public static void main(String[] args) {
//         System.out.println(setIth(10, 2));
//     }
// }


// 4. Clear ith bit

// public class BitManipulation {
//     public static int clearIth(int n, int i) {
//         int bitMask = ~(1<<i);

//         return n & bitMask;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearIth(10, 1));
//     }
// }


// 5. Update the ith bit

// public class BitManipulation {
//     public static int setIth(int n, int i) {
//         int bitMask = 1<<i;

//         return n | bitMask;
//     }
//     public static int clearIth(int n, int i) {
//         int bitMask = ~(1<<i);

//         return n & bitMask;
//     }

//     public static int updateIth(int n, int i, int newBit) {
//         // if(newBit == 0) {
//         //     return clearIth(n, i);
//         // } else {
//         //     return setIth(n, i);
//         // }

//         n = clearIth(n, i);
//         int BitMask = newBit<<i;
//         return n|BitMask;
//     }
//     public static void main(String[] args) {
//         System.out.println(updateIth(10, 2, 1));
//     }
// }


// 6. Clear the i bits

// public class BitManipulation {
//     public static int clearIBits(int n, int i) {
//         int bitMask = (~0)<<i;

//         return n & bitMask;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearIBits(15, 2));
//     }
// }


// 7. Clear range of bits

// public class BitManipulation {
//     public static int clearRangeOfBits(int n, int i, int j) {
//         int a = ((~0)<<(j+1));
//         int b = (1<<i)-1;

//         int bitMask = a|b;
//         return n&bitMask;
//     }
//     public static void main(String[] args) {
//         System.out.println(clearRangeOfBits(10, 2, 4));
//     }
// }


// 8. Check if a number is power of two

// public class BitManipulation {
//     public static boolean isPowerOfTwo(int n) {
//         return (n&(n-1)) == 0;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPowerOfTwo(16));
//     }
// }


// 9 Count set bits in a number
// TC = O(logn)  -> n = logn+1

// public class BitManipulation {
//     public static int countSetBits(int n) {
//         int count =0;
//         while(n>0) {
//             if((1 & n)!= 0) {
//                 count++;
//             }
//             n=n>>1;
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         System.out.println(countSetBits(10));
//     }
// }


// 10. Fast Exponential

// public class BitManipulation {
//     public static int fastExponential(int a, int n) {
//         int ans =1;

//         while(n>0) {
//             if((1&n) !=0) {
//                 ans = ans * a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         System.out.println(fastExponential(5, 3));
//     }
// }



// Practice

public class BitManipulation {
    public static void main(String[] args) {
        int i = 2;
        int n = 10;
        int bitMask = ~(1<<i);
        System.out.println(n & bitMask);
    }
}