
import java.util.Scanner;

// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=n-i+1; j>0; j--) {
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }


// public class Patterns {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number:");
//         int n = sc.nextInt();

//         for(int i=1; i<=n; i++) {
//             for(int j=1; j<=i; j++) {
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }
//     }
// }


public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = 'A';
        System.out.print("Enter the number:");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(ch++);
            }
            System.out.println();
        }
    }
}
