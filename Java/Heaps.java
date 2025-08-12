
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

// 1. Priority Queue in JFC
// TC -> add - O(logn), remove - O(logn), peek - O(1)

// public class Heaps {
//     public static void main(String[] args) {
//      // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  // descending order
//      PriorityQueue<Integer> pq = new PriorityQueue<>();  // asscending order - by default
//         pq.add(11);
//         pq.add(7);
//         pq.add(9);
//         pq.add(2);
//         pq.add(5);

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek());
//             pq.remove();
//         }
//     }
// }



// 2. Priority Queue for objects
// TC -> add - O(logn), remove - O(logn), peek - O(1)

// public class Heaps {
//     static class Student implements Comparable<Student> {
//         String name;
//         int rank;

//         public Student(String name, int rank) {
//             this.name = name;
//             this.rank = rank;
//         }

//         @Override
//         public int compareTo(Student s2) {
//             return this.rank - s2.rank;
//         }
//     }
//     public static void main(String[] args) {
//         // PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());  // descending order
//         PriorityQueue<Student> pq = new PriorityQueue<>();  // asscending order - by default
//         pq.add(new Student("rohit", 2));
//         pq.add(new Student("karthika", 3));
//         pq.add(new Student("amruta", 1));
//         pq.add(new Student("abhay", 5));
//         pq.add(new Student("vikas", 7));
        

//         while(!pq.isEmpty()) {
//             System.out.println(pq.peek().name + " " + pq.peek().rank);
//             pq.remove();
//         }
//     }
// }


// 3. Heap
/*
 *  Binary Tree - at most 2 children
 *  
 *  Complete Binary Tree - CBT is a BT in which all the levels are completely filled except possibly the last one, which is filled from the left to right.
 * 
 *  Heap Order Property - Children >= Parent (minHeap) - default
 *                        Children <= Parent (maxHeap)
 */

// 4. Heap as an array/arraylist
/*  
 *  tree : parent - child (min heap par <= child)
 *  AL : CBT
 *  (node) idx = i
 *  leftchild = 2i+1
 *  rightchild = 2i+2
 */


// 5. Insert in Heap
/*
 *  par -> child
 *  i
 *  left = 2i+1
 *  right = 2i+2
 * 
 *  child -> par
 *  (x)      (x-1)/2
 */

// TC - O(logn)

// public class Heaps {
//     static class Heap {
//         ArrayList<Integer> arr = new ArrayList<>();

//         public void add(int data) {
//             arr.add(data); // O(1)

//             int x = arr.size()-1;
//             int par = (x-1)/2;

//             while(arr.get(x)<arr.get(par)) { // O(logn)
//                 int temp = arr.get(x);
//                 arr.set(x, arr.get(par));
//                 arr.set(par, temp);

//                 x = par;
//                 par = (x-1)/2;
//             }
//         }

//         public int peek() {
//             return arr.get(0);
//         }

//         public void heapify(int i) {
//             int left = 2*i + 1;
//             int right = 2*i + 2;
//             int minIdx = i;

//             if(left < arr.size() && arr.get(minIdx)>arr.get(left)) {
//                 minIdx = left;
//             }

//             if(right < arr.size() && arr.get(minIdx)> arr.get(right)) {
//                 minIdx = right;
//             }

//             if(minIdx != i) {
//                  // swap
//                 int temp = arr.get(i);
//                 arr.set(i, arr.get(minIdx));
//                 arr.set(minIdx, temp);

//                 heapify(minIdx);
//             }
//         }

//         public int remove() {
//             int data = arr.get(arr.size()-1);

//             // step 1 - swap first & last
//             int temp = arr.get(arr.size()-1);
//             arr.set(arr.size()-1, arr.get(0));
//             arr.set(0, temp);

//             // step 2 - delete last
//             arr.remove(arr.size()-1);

//             //step 3 - heapify
//             heapify(0);
//             return data;
//         }

//         public boolean isEmpty() {
//             return arr.size()==0;
//         }
//     }
//     public static void main(String[] args) {
//         Heap h = new Heap();

//         h.add(4);
//         h.add(2);
//         h.add(1);
//         h.add(9);
//         h.add(6);

//         while(!h.isEmpty()) {
//             System.out.println(h.peek());
//             h.remove();
//         }
//     }
// }


// 6. Heapsort
// TC - O(nlogn)

// public class Heaps {
//     public static void heapify(int arr[], int i, int size) {
//         int left = 2*i + 1;
//         int right = 2*i + 2;
//         int maxIdx = i;

//         if(left < size && arr[left] > arr[maxIdx]) {
//             maxIdx = left;
//         }

//         if(right < size && arr[right] > arr[maxIdx]) {
//             maxIdx = right;
//         }

//         if(maxIdx != i) {
//             int temp = arr[i];
//             arr[i] = arr[maxIdx];
//             arr[maxIdx] = temp;

//             heapify(arr, maxIdx, size);
//         }
//     }
//     public static void heapSort(int arr[]) {
//         int n = arr.length;
//         // step 1 - build maxHeap
//         for(int i=n/2; i>=0; i--) {
//             heapify(arr, i, n);
//         }

//         // step 2 - push largest at end
//         for(int i=n-1; i>0; i--) {
//             //swap (largest-first with last)
//             int temp = arr[0];
//             arr[0] = arr[i];
//             arr[i] = temp;

//             heapify(arr, 0, i);
//         }
//     }
//     public static void main(String[] args) {
//         int arr[] = {1, 2, 4, 5, 3};

//         heapSort(arr);

//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }



// 7. Nearby Cars

// public class Heaps {
//     static class Point implements Comparable<Point>{
//         int x;
//         int y;
//         int distSq;
//         int idx;

//         public Point(int x, int y, int distSq, int idx) {
//             this.x = x;
//             this.y = y;
//             this.distSq = distSq;
//             this.idx = idx;
//         }

//         public int compareTo(Point p2) {
//             return this.distSq - p2.distSq;
//         }
//     }
//     public static void main(String[] args) {
//         int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
//         int k = 2;

//         PriorityQueue<Point> pq = new PriorityQueue<>();

//         for(int i=0; i<pts.length; i++) {
//             int distSq = pts[i][0]*pts[i][0] + pts[i][1]*pts[i][1];
//             pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
//         }


//         for(int i=0; i<k; i++) {
//             System.out.print("C"+pq.remove().idx + " ");
//         }
//     }
// }


// 8. Connect N Ropes

// public class Heaps {
//     public static void main(String[] args) {
//         int ropes[] = {2, 3, 3, 4, 6};

//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for(int i=0; i<ropes.length; i++) {
//             pq.add(ropes[i]);
//         }

//         int cost = 0;
//         while(pq.size() > 1) {
//             int min1 = pq.remove();
//             int min2 = pq.remove();
//             cost += min1 + min2;
//             pq.add(min1+min2);
//         }

//         System.out.println("Cost of connecting N ropes: " + cost);
//     }
// }


// 9. Weakest Soldier

// public class Heaps {
//     static class Row implements Comparable<Row> {
//         int soldier;
//         int idx;

//         public Row(int soldier, int idx) {
//             this.soldier = soldier;
//             this.idx = idx;
//         }

//         @Override
//         public int compareTo(Row r2) {
//             if(this.soldier == r2.soldier) {
//                 return this.idx - r2.idx;
//             } else {
//                 return this.soldier - r2.soldier;
//             }
//         }
//     }
//     public static void main(String[] args) {
//         int army[][] = {{1, 0, 0, 0},
//                         {1, 1, 1, 1},
//                         {1, 0, 0, 0},
//                         {1, 0, 0, 0}};
//         int k=2;

//         PriorityQueue<Row> pq = new PriorityQueue<>();

//         for(int i=0; i<army.length; i++) {
//             int count = 0;
//             for(int j=0; j<army[0].length; j++) {
//                 count+= army[i][j] == 1 ? 1:0;
//             }
//             pq.add(new Row(count, i));
//         }

//         for(int i=0; i<k; i++) {
//             System.out.println("R" + pq.remove().idx);
//         }
//     }
// }


// 10. Sliding Window Maximum - Hard Level

public class Heaps {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        public Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair p2) {
            // accending
            // return this.val - p2.val;
            // descending
            return p2.val - this.val;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3; // window size
        int res[] = new int[arr.length-k+1]; // n-k+1;

        PriorityQueue<Pair> pq = new PriorityQueue<>();

        // 1st window
        for(int i=0; i<k; i++) {
            pq.add(new Pair(arr[i], i));
        }

        res[0] = pq.peek().val;

        for(int i=k; i<arr.length; i++) {
            if(pq.size() > 0 && pq.peek().val < (i-k)) {
                pq.remove();
            }

            pq.add(new Pair(arr[i], i));
            res[i-k+1] = pq.peek().val;
        }

        // print
        for(int i=0; i<res.length; i++) {
            System.out.print(res[i] + " ");
        }
        System.out.println();
    }
}