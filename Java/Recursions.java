// 1. Print no.s from n to 1(Decreasing Order)

// public class Recursions {

//     public static void decOrder(int n) {
//         if(n==1) {
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n + " ");
//         decOrder(n-1);
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         decOrder(n);
//     }
// }


// 2. Print no.s from 1 to n(Increasing Order)

// public class Recursions {

//     public static void inOrder(int n) {
//         if(n==1) {
//             System.out.print(n + " ");
//             return;
//         }
//         inOrder(n-1);
//         System.out.print(n + " ");
//     }
//     public static void main(String[] args) {
//         int n = 10;
//         inOrder(n);
//     }
// }



// 3. Print factorial of number n
// TC: O(n), SC: O(n)
// public class Recursions {

//     public static int factorial(int n) {
//         
//         if(n==0) {
//             return 1;
//         }
//         int fact = n * factorial(n-1);
//         return fact;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(factorial(n));
//     }
// }



// 4. Print sum of first n natural no.s

// public class Recursions {

//     public static int sumOfNNat(int n) {
        
//         if(n==0) {
//             return 0;
//         }
//         int sum = n + sumOfNNat(n-1);
//         return sum;
//     }
//     public static void main(String[] args) {
//         int n = 5;
//         System.out.println(sumOfNNat(n));
//     }
// }



// 5. Print Nth fibonnaci no.
// TC: O(2^n)  SC: O(n)

// public class Recursions {

//     public static int fibonnaci(int n) {
//         if(n==0 || n==1) {
//             return n;
//         }

//         int fnm1 = fibonnaci(n-1);
//         int fnm2 = fibonnaci(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }
//     public static void main(String[] args) {
//         int n = 25;
//         System.out.println(fibonnaci(n));
//     }
// }



// 6. Check if a given no. is sorted or not
// TC: O(n), SC: O(n)
// public class Recursions {

//     public static boolean isSorted(int arr[], int i) {
//         if(i == arr.length-1) {
//             return true;
//         }

//         if(arr[i]>arr[i+1]) {
//             return false;
//         }

//         return isSorted(arr, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {1,2,3,4,5};
//         System.out.println(isSorted(arr, 0));
//     }
// }


// 7. Write a function to find the first occurance of an element in an array

// public class Recursions {

//     public static int firstOcc(int arr[], int key, int i) {
//         if(i== arr.length) {
//             return -1;
//         }
//         if(arr[i] == key) {
//             return i;
//         }

//         return firstOcc(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(firstOcc(arr, 5, 0));
//     }
// }


// 8. Write a function to find the last occurance of an element in an array

// public class Recursions {

//     public static int lastOcc(int arr[], int key, int i) {
//         if(i== arr.length) {
//             return -1;
//         }
//         int isFound = lastOcc(arr, key, i+1);

//         if(isFound == -1 && arr[i] == key) {
//             return i;
//         }

//         return isFound;
//     }
//     public static void main(String[] args) {
//         int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
//         System.out.println(lastOcc(arr, 5, 0));
//     }
// }


// 9. Print x^n
// TC: O(n)
// public class Recursions {

//     public static int xPn(int x, int n) {
//         if(n==0) {
//             return 1;
//         }
//         // int xm1 = xPn(x, n-1);
//         // int xn = x * xm1;
//         // return xn;

//         return x * xPn(x, n-1);
//     }
//     public static void main(String[] args) {
//         System.out.println(xPn(2, 5));
//     }
// }

// 10. Print x^n in O(logn)
// TC: O(logn) 
// public class Recursions {

//     public static int optimizedPower(int x, int n) {
//         if(n==0) {
//             return 1;
//         }
//         int halfPower = optimizedPower(x, n/2);
//         int halfPowerSq = halfPower * halfPower;

//         // n is odd
//         if(n%2 != 0) {
//             halfPowerSq = x * halfPowerSq;
//         }
//         return halfPowerSq;
//     }
//     public static void main(String[] args) {
//         System.out.println(optimizedPower(2, 5));
//     }
// }


// 11. Tiling Problem

// public class Recursions {

//     public static int tiling(int n) {
//         if(n==0 || n==1) {
//             return 1;
//         }

//         int fnm1 = tiling(n-1);
//         int fnm2 = tiling(n-2);

//         int totalways = fnm1 + fnm2;
//         return totalways;
//     }
//     public static void main(String[] args) {
//         System.out.println(tiling(4));
//     }
// }


// 12. Remove Duplicates in a String

// public class Recursions {

//     public static void remDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
//         if(idx == str.length()) {
//             System.out.println(newStr);
//             return;
//         }

//         char currChar = str.charAt(idx);

//         if(map[currChar - 'a'] == true) {
//             remDuplicates(str, idx+1, newStr, map);
//         } else {
//             map[currChar - 'a'] = true;
//             remDuplicates(str, idx+1, newStr.append(currChar), map);
//         }
//     }
//     public static void main(String[] args) {
//         String str = "appnnacollege";
//         remDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
//     }
// }


// 13. Friend's pairing problem

// public class Recursions {

//     public static int fPairing(int n) {
//         if(n == 1 || n==2) {
//             return n;
//         }

//         int fnm1 = fPairing(n-1);
//         int fnm2 = fPairing(n-2);
//         int pairWays = (n-1) * fnm2;

//         return fnm1 + pairWays;
//     }
//     public static void main(String[] args) {
//         System.out.println(fPairing(3));
//     }
// }


// 14. Binary Strings Problem

// public class Recursions {

//     public static void binStrings(int n, int lastPlace, String str) {
//         if(n==0){
//             System.out.println(str);
//             return;
//         }

//         binStrings(n-1, 0, str+"0");
//         if(lastPlace == 0) {
//             binStrings(n-1, 1, str+"1");
//         }
//     }
//     public static void main(String[] args) {
//         binStrings(3, 0, "");
//     }
// }


// Questions

// 1
// public class Recursions {
//     public static void occurance(int arr[], int key, int i) {
//         if(i == arr.length) {
//             return;
//         }

//         if(arr[i]==key) {
//             System.out.print(i + " ");
//         }
//         occurance(arr, key, i+1);
//     }
//     public static void main(String[] args) {
//         int arr[] = {3, 2, 4, 5, 6, 2, 7, 2, 2};
//         int key = 2;
//         occurance(arr, key, 0);
//     }
// }


// 2
// public class Recursions {
//     static String digits[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//     public static void printNumWord(int num) {
//         if(num == 0) {
//             return;
//         }

//         int ld = num%10;
//         printNumWord(num/10);
//         System.out.print(digits[ld] + " ");
//     }
//     public static void main(String[] args) {
//         int num = 1947;
        
//         printNumWord(num);
//     }
// }


// 3

// public class Recursions {
//     public static int len(String str) {
//         if(str.length()==0) {
//             return 0;
//         }
//         return len(str.substring(1))+1;
//     }
//     public static void main(String[] args) {
//         String str = "hello";
//         System.out.println(len(str));
//     }
// }


// 4

// public class Recursions {
//     public static int countSubstrs(String str, int i, int j, int n) {
//         if(n==1) {
//             return 1;
//         }
//         if(n<=0) {
//             return 0;
//         }

//         int res = countSubstrs(str, i+1, j, n-1) 
//                     + countSubstrs(str, i, j-1, n-1) 
//                     - countSubstrs(str, i+1, j-1, n-2);

//         if(str.charAt(i) == str.charAt(j)) {
//             res++;
//         }
//         return res;
//     }
//     public static void main(String[] args) {
//         String str = "abcba";
//         int n = str.length();

//         System.out.println(countSubstrs(str, 0, n-1, n));
//     }
// }


// 5

public class Recursions {
    public static void towerOfHanoi(int n, String src, String helper, String dest) {
        if(n==1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);
        towerOfHanoi(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfHanoi(n, "A", "B", "C");
    }
}