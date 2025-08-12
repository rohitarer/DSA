
//         while (num<=10) { 
//             System.out.println(num);
//             num++;
//         }
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 1;
//         int num = sc.nextInt();
//         while (n<=num) { 
//             System.out.println(n);
//             n++;
//         }
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = 1;
//         int num = sc.nextInt();
//         int sum=0;
//         while (n<=num) { 
//             sum = sum+n;
//             n++;
//         }
//         System.out.println(sum);
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++) {
//             System.out.println("* * * *");
//         }
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         while(n>0) {
//             int ld = n%10;
//             System.out.print(ld);
//             n=n/10;
//         }
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rev=0;
//         while(n>0) {
//             int ld = n%10;
//             rev = rev*10 + ld;
//             n=n/10;
//         }
//         System.out.println(rev);
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++) {
//             if(i==3) {
//                 break;
//             }
//             System.out.print(i + " ");
//         }
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do { 
//             System.out.print("Enter the no.: ");
//             int n = sc.nextInt();
//             if(n%10==0) {
//                 break;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         do { 
//             System.out.print("Enter the no.: ");
//             int n = sc.nextInt();
//             if(n%10==0) {
//                 continue;
//             }
//             System.out.println(n);
//         } while (true);
//     }
// }
// Prime no.
//Brute Force
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         if (n == 2) {
//             System.out.println("it is a prime number");
//         } else {
//             boolean isPrime = true;
//         for(int i=2; i<n-1; i++) {
//             if(n%i==0) {
//                 isPrime =false;
//             }
//         }
//         if(isPrime) {
//             System.out.println("It is prime number");
//         } else {
//             System.out.println("It is not a prime number");
//         }
//         }
//     }
// }
// Optimal 
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n = sc.nextInt();
//         if (n == 2) {
//             System.out.println("it is a prime number");
//         } else {
//             boolean isPrime = true;
//         for(int i=2; i<Math.sqrt(n); i++) {
//             if(n%i==0) {
//                 isPrime =false;
//             }
//         }
//         if(isPrime) {
//             System.out.println("It is prime number");
//         } else {
//             System.out.println("It is not a prime number");
//         }
//         }
//     }
// }
// Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n;
//         int choice;
//         int eSum = 0;
//         int oSum = 0;
//         do { 
//             System.out.println("Enter the number: ");
//             n = sc.nextInt();
//             if(n%2==0) {
//                 eSum+=n;
//             } else {
//                 oSum+=n;
//             }
//             System.out.println("Enter your choice, 1 to continue and 0 to exit");
//             choice = sc.nextInt();
//         } while (choice==1);
//         System.out.println("sum of even numbers: "+ eSum);
//         System.out.println("sum of odd numbers: " + oSum);
//     }
// }
// Write a program to find the factorialof any number entered by the user.(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly. We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
// public class Loops {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int fact=1;
//         while(n>0) {
//             fact*=n;
//             n--;
//         }
//         System.out.println("Factorial is "+fact);
//     }
// }

// public class Loops {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=10; i++) {
//             System.out.println(n*i);
//         }
//     }
// }


public class Loops {
    public static void main(String[] args) {
        for(int i=0; i<=5; i++) {
            System.out.println("i =");
        }
    }
}