// public class Functions {
//     public static int multiply(int a, int b) {
//         int mul = a*b;
//         return mul;
//     }
//     public static void main(String[] args) {
//         int prod = multiply(3, 5);
//         System.out.println(prod);
//     }
// }



// factorial
// public class Functions {
//     public static int factorial(int n) {
//         int fact=1;
//         for(int i=1; i<=n; i++) {
//             fact *=i;
//         }
//         return fact;
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }


// Binomial Coefficient

// public class Functions {
//     public static int factorial(int n) {
//         int fact = 1;
//         for(int i=1; i<=n; i++) {
//             fact*=i;
//         }
//         return fact;
//     }

//     public static int binCoeff(int n, int r) {
//         int nFact = factorial(n);
//         int rFact = factorial(r);
//         int nmrFact = factorial(n-r);

//         int BC = nFact/(rFact * nmrFact);
//         return BC;
//     }
//     public static void main(String[] args) {
//         System.out.println(binCoeff(5, 2));
//     }
// }

// Prime no.
//Brute Force
// public class Functions {
//     public static boolean isPrime(int n) {
//         if(n==2) {
//             return true;
//         }
//         for(int i=2; i<=n-1; i++) {
//             if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(6));
//     }
// }


// optimal
// public class Functions {
//     public static boolean isPrime(int n) {
//         if(n==2) {
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++) {
//             if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         System.out.println(isPrime(101));
//     }
// }


// prime in range
// public class Functions {
//     public static boolean isPrime(int n) {
//         if(n==2) {
//             return true;
//         }
//         for(int i=2; i<=Math.sqrt(n); i++) {
//             if(n%i==0) {
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void primeInRange(int n) {
//         for(int i=2; i<=n; i++) {
//             if(isPrime(i)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         primeInRange(100);
//     }
// }



// binary to decimal

// public class Functions {
//     public static void binToDec(int n) {
//         int myNum = n;
//         int decimal = 0;
//         int pow=0;

//         while(n>0) {
//             int ld = n%10;
//             decimal = decimal + ld * (int)Math.pow(2, pow++);
//             n = n/10;
//         }
//         System.out.println("Decimal of " + myNum + " is " + decimal);
//     }
    
    
//         public static void main(String[] args) {
//             binToDec(111);
//         }
//     }
    

// decimal to binary

// public class Functions {
//     public static void decToBin(int n) {
//         int myNum = n;
//         int binary = 0;
//         int pow = 0;

//         while(n>0) {
//             int rem = n%2;
//             binary = binary + rem * (int)Math.pow(10, pow++);
//             n = n/2;
//         }
//         System.out.println("Binary of " + myNum + " is " + binary);
//     }
    
    
//         public static void main(String[] args) {
//             decToBin(5);
//         }
//     }
    

// Questions

// 1
// public class Functions {
//     public static void averageOf3(int a, int b, int c) {
//         int avg = (a+b+c)/3;
//         System.out.println(avg);
//     }
//     public static void main(String[] args) {
//         averageOf3(5, 5, 5);
//     }
// }
    
//2
// public class Functions {
//     public static boolean isEven(int n) {
//         if(n%2==0) {
//             return true;
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         System.out.println(isEven(93458334));
//     }
// }


//3
// public class Functions {
//     public static boolean isPalindrome(int n) {
//         int myNum = n;
//         int rev = 0;
//         while(n>0) {
//             int ld = n%10;
//             rev = rev *10 + ld;
//             n /=10;
//         }
//         if(myNum == rev) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(isPalindrome(121312));
//     }
// }

//5
public class Functions {
    
    public static int sumOfDigits(int n) {
        int sum=0;
        while(n>0) {
            int ld = n%10;
            sum +=ld;
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumOfDigits(123425));
    }
}