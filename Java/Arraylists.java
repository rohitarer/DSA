
import java.util.ArrayList;
import java.util.Collections;

// 1. Basic operations performed on arraylist
// public class Arraylists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         // add element - O(1)
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println("elements added in arraylist "+list);
//         // add element at index - O(n)
//         list.add(2, 9);
//         System.out.println("element added in arraylist at specific index "+list);
//         // get element - O(1)
//         System.out.println("getting element from arraylist using index "+list.get(2));
//         // remove element - O(n)
//         System.out.println("element removed from arraylist using index "+list.remove(2));
//         // set element at index - O(n)
//         System.out.println("set element at arraylist using index "+ list.set(2, 9));
//         // contains element - O(n)
//         System.out.println("contains element in arraylist "+list.contains(9));
//     }
// }


// 2. Size of AL
// public class Arraylists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         // add element - O(1)
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         System.out.println("Size of AL: " + list.size());
//         for(int i=0; i<list.size(); i++) {
//             System.out.print(list.get(i)+ " ");
//         }
//         System.out.println();
//     }
// }


// 3. Print Reverse of an AL - O(n)
// public class Arraylists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         // add element - O(1)
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         for(int i=list.size()-1; i>=0; i--) {
//             System.out.print(list.get(i)+ " ");
//         }
//         System.out.println();
//     }
// }



// 4. Find Maximum in an AL - O(n)
// public class Arraylists {
//     public static int maximum(ArrayList<Integer> list) {
//         int max = Integer.MIN_VALUE;
//         for(int i=0; i<list.size(); i++) {
//             // if(list.get(i)>max) {
//             //     max = list.get(i);
//             // }
//             max = Math.max(max, list.get(i));
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         System.out.println("max ele from list " + maximum(list));
//     }
// }


// 5. Swap 2 no.s
// public class Arraylists {
//     public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//         int temp = list.get(idx1);
//         list.set(idx1, list.get(idx2));
//         list.set(idx2, temp);
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         System.out.println(list);
//         swap(list, 1, 3);
//         System.out.println(list);
//     }
// }


// 6. Sorting an AL
// public class Arraylists {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(5);
//         list.add(9);
//         list.add(3);
//         list.add(6);
//         System.out.println(list);
//         Collections.sort(list);
//         System.out.println(list);
//         Collections.sort(list, Collections.reverseOrder());
//         System.out.println(list);
//     }
// }


// 7. Multi-dimensional ArrayList
// public class Arraylists {
//     public static void main(String[] args) {
//         ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
//         ArrayList<Integer> list1 = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
//         ArrayList<Integer> list3 = new ArrayList<>();
//         for(int i=1; i<=5; i++) {
//             list1.add(i*1);
//             list2.add(i*2);
//             list3.add(i*3);
//         }
//         mainList.add(list1);
//         mainList.add(list2);
//         mainList.add(list3);
//         System.out.println(mainList);
//         for(int i=0; i<mainList.size(); i++) {
//             ArrayList<Integer> curr = mainList.get(i);
//             for(int j=0; j<curr.size(); j++) {
//                 System.out.print(curr.get(j) + " ");
//             }
//             System.out.println();
//         }
//     }
// }


// 8. Container with Most Water
// For given n lines on x-axis, use 2 lines to form a container such that it holds maximum water.
// TC - O(n^2)

// public class Arraylists {
//     public static int containerWater(ArrayList<Integer> height) {
//         int maxWater = 0;

//         for(int i=0; i<height.size(); i++) {
//             for(int j=i+1; j<height.size(); j++) {
//                 int ht = Math.min(height.get(i), height.get(j));
//                 int wd = j-i;
//                 int currWater = ht * wd;
//                 maxWater = Math.max(maxWater, currWater);
//             }
//         }
//         return maxWater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(containerWater(height));
//     }
// }


// 9. Container with Most Water
// 2-Pointer Approach
// TC- O(n)

// public class Arraylists {
//     public static int containerWater(ArrayList<Integer> height) {
//         int maxWater = 0;
//         int lp=0;
//         int rp=height.size()-1;

//         while(lp<rp) {
//             int ht = Math.min(height.get(lp), height.get(rp));
//             int wd = rp-lp;

//             int currWater = ht * wd;
//             maxWater = Math.max(maxWater, currWater);

//             if(lp < rp) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return maxWater;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> height = new ArrayList<>();
//         height.add(1);
//         height.add(8);
//         height.add(6);
//         height.add(2);
//         height.add(5);
//         height.add(4);
//         height.add(8);
//         height.add(3);
//         height.add(7);

//         System.out.println(containerWater(height));
//     }
// }


// 10. Pair Sum - 1
// Find if any pair in a Sorted ArrayList has a target sum.
// TC - O(n^2)

// public class Arraylists {
//     public static boolean pairSum(ArrayList<Integer> list, int target) {
//         for(int i=0; i<list.size(); i++) {
//             for(int j=i+1; j<list.size(); j++) {
//                 if(list.get(i) + list.get(j) == target) {
//                     return true;
//                 }
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
        
//         int target = 5;

//         System.out.println(pairSum(list, target));
//     }
// }


// 11. Pair Sum - 1
// 2 - Pointer Approach
// TC - O(n)

// public class Arraylists {
//     public static boolean pairSum(ArrayList<Integer> list, int target) {
//         int lp=0;
//         int rp=list.size()-1;

//         while(lp!=rp) {
//             if(list.get(lp)+list.get(rp)==target) {
//                 return true;
//             } else if(list.get(lp)+list.get(rp)<target) {
//                 lp++;
//             } else {
//                 rp--;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(1);
//         list.add(2);
//         list.add(3);
//         list.add(4);
//         list.add(5);
//         list.add(6);
        
//         int target = 5;

//         System.out.println(pairSum(list, target));
//     }
// }



// 12. Pair Sum - 2
// Find if any pair in a Sorted ArrayList has a target sum.
// 2 Pointer Approach
// TC - O(n)

public class Arraylists {
    public static boolean pairSum2(ArrayList<Integer> list, int target) {
        int bp=-1;
        int n = list.size();

        for(int i=0; i<list.size(); i++) {
            if(list.get(i)>list.get(i+1)) {
                bp=i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;

        while(lp!=rp) {
            if(list.get(lp)+list.get(rp) == target) {
                return true;
            }

            if(list.get(lp)+list.get(rp) < target) {
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        
        int target = 16;

        System.out.println(pairSum2(list, target));
    }
}