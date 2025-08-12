import java.util.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// 1. HashMap Operations
// TC - O(1)

// public class Hashing {
//     public static void main(String[] args) {
//         // Create
//         HashMap<String, Integer> hm = new HashMap<>();

//         // Insert
//         hm.put("Idli", 55);
//         hm.put("Dosa", 75);
//         hm.put("Puri", 60);

//         System.out.println(hm);

//         // get
//         int choice = hm.get("Dosa");
//         System.out.println(choice);

//         // containsKey
//         System.out.println(hm.containsKey("Idli"));

//         // remove
//         System.out.println(hm.remove("Puri"));
//         System.out.println(hm);

//         //size
//         System.out.println(hm.size());

//         // isEmpty
//         System.out.println(hm.isEmpty());
//     }
// }


// 2. Iterations on Hashmaps

// public class Hashing {
//     public static void main(String[] args) {
//         HashMap<String, Integer> hm = new HashMap<>();

//         hm.put("Idli", 55);
//         hm.put("Dosa", 75);
//         hm.put("Puri", 60);
//         hm.put("Poha", 30);
//         hm.put("Tea", 10);

//         Set<String> keys = hm.keySet();
//         System.out.println(keys);

//         for (String k : keys) {
//             System.out.println("key: " + k + ", value: " + hm.get(k));
//         }
//     }
// }



// 3. Linked HashMap Operations
// It uses Doubly LL 
// TC - O(1)

// public class Hashing {
//     public static void main(String[] args) {
//         LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
//         lhm.put("Dosa", 90);
//         lhm.put("Idli", 50);
//         lhm.put("Puri", 65);
//         lhm.put("Poha", 30);


//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("Dosa", 40);
//         hm.put("Idli", 50);
//         hm.put("Puri", 65);
//         hm.put("Poha", 30);


//         System.out.println(hm);
//         System.out.println(lhm);
//     }
// }


// 4. TreeMap Operations
// Red Black Trees -> BST (Self-balancing trees)
// TC- O(logn) - insert, remove, get

// public class Hashing {
//     public static void main(String[] args) {
//         TreeMap<String, Integer> tm = new TreeMap<>();
//         tm.put("Dosa", 90);
//         tm.put("Idli", 50);
//         tm.put("Puri", 65);
//         tm.put("Poha", 30);


//         HashMap<String, Integer> hm = new HashMap<>();
//         hm.put("Dosa", 40);
//         hm.put("Idli", 50);
//         hm.put("Puri", 65);
//         hm.put("Poha", 30);


//         System.out.println(hm);
//         System.out.println(tm);
//     }
// }


// 5. Majority Element
// TC - O(n)

// public class Hashing {
//     public static void main(String[] args) {
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             if(map.containsKey(arr[i])) {
//                 map.put(arr[i], map.get(arr[i])+1);
//             } else {
//                 map.put(arr[i], 1);
//             }
//         }

//         Set<Integer> keySet = map.keySet();
//         for(Integer key: keySet) {
//             if(map.get(key)> arr.length/3) {
//                 System.out.print(key);
//             }
//         }
//     }
// }

// or

// public class Hashing {
//     public static void main(String[] args) {
//         int arr[] = {1, 3, 2, 5, 1, 3, 1, 5, 1};

//         HashMap<Integer, Integer> map = new HashMap<>();

//         for(int i=0; i<arr.length; i++) {
//             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
//         }

//         for(Integer key: map.keySet()) {
//             if(map.get(key)> arr.length/3) {
//                 System.out.print(key);
//             }
//         }
//     }
// }

// 6. Valid Anagram
// TC - O(n)

// public class Hashing {
//     public static boolean isAnagram(String s, String t) {
//         if(s.length() != t.length()) {
//             return false;
//         }

//         HashMap<Character, Integer> map = new HashMap<>();
//         for(int i=0; i<s.length(); i++) {
//             char ch = s.charAt(i);
//             map.put(ch, map.getOrDefault(ch, 0)+1);
//         }

//         for(int i=0; i<t.length(); i++) {
//             char ch = t.charAt(i);
//             if(map.get(ch) != null) {
//                 if(map.get(ch) == 1) {
//                     map.remove(ch);
//                 } else {
//                     map.put(ch, map.get(ch)-1);
//                 }
//             } else {
//                 return false;
//             }
//         }
//         return map.isEmpty();
//     }
//     public static void main(String[] args) {
//         String s = "care";
//         String t = "race";

//         System.out.println(isAnagram(s, t));
//     }
// }


// 7. HashSet Operations
// TC - O(1)

// public class Hashing {
//     public static void main(String[] args) {
//         HashSet<Integer> hs = new HashSet<>();
//         hs.add(1);
//         hs.add(2);
//         hs.add(4);
//         hs.add(2);
//         hs.add(1);

//         System.out.println(hs);
//         System.out.println(hs.size());

//         if(hs.contains(1)) {
//             System.out.println("hs contains 1");
//         }
//         hs.remove(2);
//         if(hs.contains(2)) {
//             System.out.println("hs contains 2");
//         }

//         System.out.println(hs.size());

//         System.out.println(hs);
//         hs.clear();
//         System.out.println(hs.isEmpty());
//     }
// }


// 8. Iteration on HashSet
// a. using Iterators
// b. using Enhanced for loop

// public class Hashing {
//     public static void main(String[] args) {
//         HashSet<String> cities = new HashSet<>();
//         cities.add("IchalKaranji");
//         cities.add("Kholapur");
//         cities.add("Mumbai");
//         cities.add("Pune");

//         // a. using Iterators
//         // Iterator it = cities.iterator();
//         // while(it.hasNext()) {
//         //     System.out.println(it.next());
//         // }

//         // b. using Enhanced for loop
//         for(String city : cities) {
//             System.out.println(city);
//         }
//     }
// }


// 9. LinkedHashSet Operation
// LinkedHashMap < HashMap -> in performance
// LinkedHashSet < HashSet -> in performance
// TC - O(1)

// public class Hashing {
//     public static void main(String[] args) {
//         HashSet<String> hs = new HashSet<>();
//         hs.add("IchalKaranji");
//         hs.add("Kholapur");
//         hs.add("Mumbai");
//         hs.add("Pune");


//         LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         lhs.add("IchalKaranji");
//         lhs.add("Kholapur");
//         lhs.add("Mumbai");
//         lhs.add("Pune");

//         System.out.println(hs);
//         System.out.println(lhs);
//     }
// }


// 10. TreeSet Operation
// TC - O(logn)

// public class Hashing {
//     public static void main(String[] args) {
//         HashSet<String> hs = new HashSet<>();
//         hs.add("IchalKaranji");
//         hs.add("Kholapur");
//         hs.add("Mumbai");
//         hs.add("Pune");


//         LinkedHashSet<String> lhs = new LinkedHashSet<>();
//         lhs.add("IchalKaranji");
//         lhs.add("Kholapur");
//         lhs.add("Mumbai");
//         lhs.add("Pune");


//         TreeSet<String> ts = new TreeSet<>();
//         ts.add("IchalKaranji");
//         ts.add("Pune");
//         ts.add("Kholapur");
//         ts.add("Mumbai");

//         System.out.println(hs);
//         System.out.println(lhs);
//         System.out.println(ts);
//     }
// }


// 11. Count Distinct Elements
// TC - O(n)


// public class Hashing {
//     public static void main(String[] args) {
//         int num[] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
        
//         HashSet<Integer> set = new HashSet<>();
//         for(int i=0; i<num.length; i++) {
//             set.add(num[i]);
//         }

//         System.out.println(set.size());
//     }
// }


// 12. Union & Intersection
// TC - O(n)


// public class Hashing {
//     public static void main(String[] args) {
//         int arr1[] = {7, 3, 9};
//         int arr2[] = {6, 3, 9, 2, 9, 4};

//         HashSet<Integer> set = new HashSet<>();

//         //union
//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         for(int i=0; i<arr2.length; i++) {
//             set.add(arr2[i]);
//         }

//         System.out.println(set.size());
        
//         for(Integer s : set) {
//             System.out.print(s + " ");
//         }
//         System.out.println();

//         //intersection
//         set.clear();

//         for(int i=0; i<arr1.length; i++) {
//             set.add(arr1[i]);
//         }

//         int count = 0;
//         for(int i=0; i<arr2.length; i++) {
//             if(set.contains(arr2[i])) {
//                 count++;
//                 set.remove(arr2[i]);
//                 System.out.print(arr2[i] + " ");
//             }
//         }
//         System.out.println();

//         System.out.println(count);
//     }
// }


// 13. Find Iternairy for tickets
// TC - O(n)

public class Hashing{
    public static String getStart(HashMap<String, String> tickets) {
        HashMap<String, String> revMap = new HashMap<>();

        for(String key : tickets.keySet()) {
            revMap.put(tickets.get(key), key);
        }

        for(String key : tickets.keySet()) {
            if(!revMap.containsKey(key)) {
                return key;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();
        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);
        System.out.print(start);
        for(String key : tickets.keySet()) {
            System.out.print("->" + tickets.get(start));
            start = tickets.get(start);
        }
        System.out.println();
    }
}