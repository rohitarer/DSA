

// public class Strings {
//     public static boolean isPalindrome(String str) {
//         for(int i=0; i<str.length()/2; i++) {
//             if(str.charAt(i) != str.charAt(str.length()-1-i)) {
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         String str = "racecar";
//         System.out.println(isPalindrome(str));
//     }
// }


// public class Strings {
//     public static float isDirection(String str) {
//         float x=0, y=0;
//         for(int i=0; i<str.length(); i++) {
//         char dir = str.charAt(i);
//         if(dir == 'N') {
//             y++;
//         } else if(dir == 'S') {
//             y--;
//         } else if(dir == 'E') {
//             x--;
//         } else{
//             x++;
//         }
//         }
//         float X2 = x*x;
//         float Y2 = y*y;
//         return (float)Math.sqrt(X2+Y2);
//     }
//     public static void main(String[] args) {
//         String str = "WNEENESENNN";
//         System.out.println(isDirection(str));
//     }
// }


// public class Strings {
//     public static String subString(String str, int si, int ei) {
//         String newStr = "";
//         for(int i=si; i<ei; i++) {
//             newStr+=str.charAt(i);
//         }
//         return newStr;
//     }

//     public static void main(String[] args) {
//         String str = "HelloWorld";
//         System.out.println(subString(str, 0, 5));
//         System.out.println(str.substring(0,5));
//     }
// }


// public class Strings {
//     public static void main(String[] args) {
//         String fruits[] = {"apple", "banana", "mango"};

//         String largest = fruits[0];
//         for(int i=1; i<fruits.length; i++) {
//             if(largest.compareToIgnoreCase(fruits[i]) < 0) {
//                 largest = fruits[i];
//             }
//         }
//         System.out.println(largest);
//     }
// }


// public class Strings {
//     public static String toUpperCase(String str) {
//         StringBuilder sb = new StringBuilder();
//         char ch = Character.toUpperCase(str.charAt(0));
//         sb.append(ch);
//         for(int i=1;i<str.length();i++) {
//             if(str.charAt(i) == ' ' && i<str.length()-1){
//                 sb.append(str.charAt(i));
//                 i++;
//                 sb.append(Character.toUpperCase(str.charAt(i)));
//             } else {
//                 sb.append(str.charAt(i));
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         String str = "hi, how are you?";
//         System.out.println(toUpperCase(str));
//     }
// }



// public class Strings {
//     public static String strCompression(String str) {
//         StringBuilder sb = new StringBuilder("");
//         for(int i=0; i<str.length(); i++) {
//         int count = 1;
//             while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
//                 count++;
//                 i++;
//             }
//             sb.append(str.charAt(i));
//             if(count>1) {
//                 sb.append(count);
//             }
//         }
//         return sb.toString();
//     }
//     public static void main(String[] args) {
//         String str = "aaabbccccddd";
//         System.out.println(strCompression(str));
//     }
// }


// Questions

// 1

// public class Strings {
//     public static int count(String str) {
//         int count = 0;
//         for(int i=0; i<str.length(); i++) {
//             char curr = str.charAt(i);
//             if(curr == 'a' || curr == 'e' || curr == 'i' || curr == 'o' || curr == 'u') {
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         String str = "hi, how are you?";
//         System.out.println(count(str));
//     }
// }


// 4
import java.util.Arrays;
public class Strings {
    public static boolean anagrams(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if(str1.length() == str2.length()) {
            char str1CharArray[] = str1.toCharArray();
        char str2CharArray[] = str2.toCharArray();

        Arrays.sort(str1CharArray);
        Arrays.sort(str2CharArray);

        boolean result = Arrays.equals(str1CharArray, str2CharArray);

        return result;
        }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "care";
        String str2 = "race";

        System.out.println(anagrams(str1, str2));
    }
}