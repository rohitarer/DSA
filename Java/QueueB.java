import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// 1. Creating of Queue using Array

// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int rear;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return rear == -1;
//         }

//         public static void add(int data) { // O(1)
//             if(rear == size -1) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             rear = rear+1;
//             arr[rear] = data;
//         }

//         public static int remove() { // O(n)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             int front = arr[0];
//             for(int i=0; i<rear; i++) {
//                 arr[i] = arr[i+1];
//             }
//             rear = rear-1;
//             return front;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             return arr[0];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// 2. Creating Circular Queue using Array

// public class QueueB {
//     static class Queue {
//         static int arr[];
//         static int size;
//         static int front;
//         static int rear;

//         Queue(int n) {
//             arr = new int[n];
//             size = n;
//             front = -1;
//             rear = -1;
//         }

//         public static boolean isEmpty() {
//             return front == -1 && rear == -1;
//         }

//         public static boolean isFull() {
//             return (rear+1)%size == front;
//         }

//         public static void add(int data) {
//             if(isFull()) {
//                 System.out.println("Queue is full");
//                 return;
//             }

//             if(front == -1) {
//                 front = 0;
//             }

//             rear = (rear+1)%size;
//             arr[rear] = data;
//         }

//         public static int remove() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             int result = arr[front];

//             if(rear == front) {
//                 rear = front = -1;
//             } else {
//                 front = (front+1)%size;
//             }

//             return result;
//         }

//         public static int peek() {
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return arr[front];
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue(5);
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         System.out.println(q.remove());
//         q.add(4);
//         System.out.println(q.remove());
//         q.add(5);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// 3. Create a Queue using LL

// public class QueueB {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Queue {
//         static Node head = null;
//         static Node tail = null;

//         public static boolean isEmpty() {
//             return head == null && tail == null;
//         }

//         public static void add(int data) {  // O(1)
//             Node newNode = new Node(data);
//             if(head == null) {
//                 head = tail = newNode;
//                 return;
//             }

//             tail.next = newNode;
//             tail = newNode;
//         }

//         public static int remove() {  // O(1)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             int front = head.data;
//             if(head==tail) {
//                 head = tail = null;
//             } else {
//                 head =head.next;
//             }
//             return front;
//         }

//         public static int peek() {  // O(1)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return head.data;
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// 4. Create Queue using JCF

// public class QueueB {
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();

//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// 5. Queue using 2 stacks

// public class QueueB {
//     static class Queue {
//         static Stack<Integer> s1 = new Stack<>();
//         static Stack<Integer> s2 = new Stack<>();

//         public static boolean isEmpty() {
//             return s1.isEmpty();
//         }

//         public static void add(int data) {  // O(n)
//             while(!s1.isEmpty()) {
//                 s2.push(s1.pop());
//             }

//             s1.push(data);

//             while(!s2.isEmpty()) {
//                 s1.push(s2.pop());
//             }
//         }

//         public static int remove() {  // O(1)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return s1.pop();
//         }

//         public static int peek() {  // O(1)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             return s1.peek();
//         }
//     }
//     public static void main(String[] args) {
//         Queue q = new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);

//         while(!q.isEmpty()) {
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// 6. Stack using two Queues

// public class QueueB {
//     static class Stack {
//         static Queue<Integer> q1 = new LinkedList<>();
//         static Queue<Integer> q2 = new LinkedList<>();

//         public static boolean isEmpty() {
//             return q1.isEmpty() && q2.isEmpty();
//         }

//         public static void push(int data) {  // O(1)
//             if(!q1.isEmpty()) {
//                 q1.add(data);
//             } else {
//                 q2.add(data);
//             }
//         }

//         public static int pop() {  // O(n)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             int top = -1;

//             if(!q1.isEmpty()) { 
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     if(q1.isEmpty()) {
//                         break;
//                     }
//                     q2.add(top);
//                 }
//             } else {
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     if(q2.isEmpty()) {
//                         break;
//                     }
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }

//         public static int peek() {   // O(n)
//             if(isEmpty()) {
//                 System.out.println("Queue is empty");
//                 return -1;
//             }

//             int top = -1;

//             if(!q1.isEmpty()) {
//                 while(!q1.isEmpty()) {
//                     top = q1.remove();
//                     q2.add(top);
//                 }
//             } else {
//                 while(!q2.isEmpty()) {
//                     top = q2.remove();
//                     q1.add(top);
//                 }
//             }
//             return top;
//         }
//     }
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// 7. First non-repeating Letter in a stream of characters.
// TC - O(n)

// public class QueueB {
//     public static void printNonRepeating(String str) {
//         int freq[] = new int[26];  // 'a'-'z'
//         Queue<Character> q = new LinkedList<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             q.add(ch);
//             freq[ch-'a']++;
//             while(!q.isEmpty() && freq[q.peek()-'a']>1) {
//                 q.remove();
//             }

//             if(q.isEmpty()) {
//                 System.out.print(-1 + " ");
//             } else {
//                 System.out.print(q.peek() + " ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         String str = "aabccxb";
//         printNonRepeating(str);
//     }
// }


// 8. Interleave 2 Halves of a Queue (even length)
// TC - O(n)  SC - O(n)

// public class QueueB {
//     public static void interleave(Queue<Integer> q) {
//         Queue<Integer> firstHalf = new LinkedList<>();
//         int size = q.size();

//         for(int i=0; i<size/2; i++) {
//             firstHalf.add(q.remove());
//         }

//         while(!firstHalf.isEmpty()) {
//             q.add(firstHalf.remove());
//             q.add(q.remove());
//         }
//     }
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);
//         q.add(6);
//         q.add(7);
//         q.add(8);
//         q.add(9);
//         q.add(10);

//         interleave(q);

//         // print Q
//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }


// 9. Queue Reversal
// TC - O(n)  SC - O(n)

// public class QueueB {
//     public static void reverse(Queue<Integer> q) {
//         Stack<Integer> s = new Stack<>();

//         while(!q.isEmpty()) {
//             s.push(q.remove());
//         }

//         while(!s.isEmpty()) {
//             q.add(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Queue<Integer> q = new LinkedList<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         reverse(q);

//         // print Q

//         while(!q.isEmpty()) {
//             System.out.print(q.remove() + " ");
//         }
//         System.out.println();
//     }
// }


// 10. Deque using JCF with O(1)
// addFirst
// addLast
// removeFirst
// removeLast
// getFirst
// getLast

// public class QueueB {
//     public static void main(String[] args) {
//         Deque<Integer> deque = new LinkedList<>();
//         deque.addFirst(1);
//         deque.addFirst(2);
//         deque.addFirst(3);
//         System.out.println(deque);
//     }
// }


// 11. Stack using Deque 
// TC - O(1)

// public class QueueB {
//     static class Stack {
//         Deque<Integer> d = new LinkedList<>();

//         public void push(int data) {
//             d.addLast(data);
//         }

//         public int pop() {
//             return d.removeLast();
//         }

//         public int peek() {
//             return d.getLast();
//         }
//     }
//     public static void main(String[] args) {
//         Stack s = new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         System.out.println("peek = " + s.peek());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());
//     }
// }


// 11. Queue using Deque 
// TC - O(1)

public class QueueB {
    static class Queue {
        Deque<Integer> d = new LinkedList<>();

        public void add(int data) {
            d.addLast(data);
        }

        public int remove() {
            return d.removeFirst();
        }

        public int peek() {
            return d.getFirst();
        }
    }
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println("peek = " + q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
    }
}