import java.util.Stack;

// public class StackB {
//     static class Stack {
//         static ArrayList<Integer> list = new ArrayList<>();

//         public static boolean isEmpty() {
//             return list.isEmpty();
//         }

//         // push
//         public static void push(int data) {
//             list.add(data);
//         }

//         // pop
//         public static int pop() {
//             int top = list.get(list.size()-1);
//             list.remove(list.size()-1);
//             return top;
//         }

//         // peek
//         public static int peek() {
//             return list.get(list.size()-1);
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


// 2. Stack using LinkedList

// public class StackB {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static class Stack {
//         static Node head = null;

//         public static boolean isEmpty() {
//             return head == null;
//         }

//         // push
//         public static void push(int data) {
//             Node newNode = new Node(data);

//             if(isEmpty()) {
//                 head = newNode;
//                 return;
//             }

//             newNode.next = head;
//             head = newNode;
//         }

//         // pop
//         public static int pop() {
//             if(isEmpty()) {
//                 return -1;
//             }

//             int top = head.data;
//             head = head.next;
//             return top;
//         }

//         // peek
//         public static int peek() {
//             return head.data;
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


// 3. Stack using JCF


// public class StackB {
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// 4. Push at the bottom of the stack
// TC-O(n) & without extra memory
// public class StackB {
//     public static void pushBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushBottom(s, data);
//         s.push(top);
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);


//         pushBottom(s, 4);
//         while(!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }


// 5. Reverse a String using a Stack

// public class StackB {
//     public static String reverseString(String str) {
//         Stack<Character> s = new Stack<>();
//         int idx=0;

//         while(idx<str.length()) {
//             s.push(str.charAt(idx));
//             idx++;
//         }

//         StringBuilder result = new StringBuilder("");
//         while(!s.isEmpty()) {
//             result.append(s.pop());
//         }

//         return result.toString();
//     }
//     public static void main(String[] args) {
//         String str = "abc";

//         System.out.println(reverseString(str));
//     }
// }


// 6. Reverse a stack

// public class StackB {
//     public static void pushAtBottom(Stack<Integer> s, int data) {
//         if(s.isEmpty()) {
//             s.push(data);
//             return;
//         }
//         int top = s.pop();
//         pushAtBottom(s, data);
//         s.push(top);
//     }
//     public static void reverseStack(Stack<Integer> s) {
//         if(s.isEmpty()) {
//             return;
//         }

//         int top = s.pop();
//         reverseStack(s);
//         pushAtBottom(s,top);
//     }

//     public static void printStack(Stack<Integer> s) {
        
//         while(!s.isEmpty()) {
//             System.out.println(s.pop());
//         }
//     }
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         reverseStack(s);
//         printStack(s);
//     }
// }


// 7. Stock Span Problem

// public class StackB {
//     public static void stocksSpan(int stocks[], int span[]) {
//         Stack<Integer> s = new Stack<>();
//         span[0] = 1;
//         s.push(0);

//         for(int i=1; i<stocks.length; i++) {
//             int currPrice = stocks[i];
//             while(!s.isEmpty() && currPrice > stocks[s.peek()]) {
//                 s.pop();
//             }

//             if(s.isEmpty()) {
//                 span[i] = i+1;
//             } else {
//                 int prevHigh = s.peek();
//                 span[i] = i-prevHigh;
//             }
//             s.push(i);
//         }
//     }
//     public static void main(String[] args) {
//         int stocks[] = {100, 80, 60, 70, 60, 85, 100};
//         int span[] = new int[stocks.length];

//         stocksSpan(stocks, span);

//         for(int i=0; i<span.length; i++) {
//             System.out.println(span[i] + " ");
//         }
//     }
// }


// 8. Next Greater Element
// The next greater element of some element x in an array is the first greater element that is to the right of x in the same array.
// TC - O(n)
// public class StackB {
//     public static void main(String[] args) {
//         int arr[] = {6, 8, 0, 1, 3};
//         int nextGreater[] = new int[arr.length];
//         Stack<Integer> s = new Stack<>();

//         for(int i=arr.length-1; i>=0; i--) {
//             while(!s.isEmpty() && arr[s.peek()] <= arr[i]) {
//                 s.pop();
//             }
//             if(s.isEmpty()) {
//                 nextGreater[i] = -1;
//             } else {
//                 nextGreater[i] = arr[s.peek()];
//             }

//             s.push(i);
//         }

//         for(int i=0; i<nextGreater.length; i++) {
//             System.out.print(nextGreater[i] + " ");
//         }
//         System.out.println();
//     }
// }


// 9. Valid Parentheses
// TC - O(n)

// public class StackB {
//     public static boolean isValid(String str) {
//         Stack<Character> s = new Stack<>();

//         for(int i=0; i<str.length(); i++) {
//             char ch = str.charAt(i);

//             if(ch == '(' || ch == '[' || ch == '{') { // opening
//                 s.push(ch);
//             } else { // closing
//                 if(s.isEmpty()) {
//                     return false;
//                 }

//                 if((s.peek() == '(' && ch==')')
//                 || (s.peek() == '[' && ch==']')
//                 || (s.peek() == '{' && ch=='}')) {
//                     s.pop();
//                 } else {
//                     return false;
//                 }
//             }
//         }
//         if(s.isEmpty()) {
//             return true;
//         } else {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         String str = "([{}])";
//         System.out.println(isValid(str));
//     }
// }


// 10. Duplicate Parentheses
// TC - O(n)

public class StackB {
    public static boolean isDuplicate(String str){
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);

            if(ch == ')') {  // closing
                int count =0;
                
                while(s.peek() != '(') {
                    count++;
                    s.pop();
                }

                if(count < 1) {
                    return true;   // duplicate found
                } else {
                    s.pop();
                }
            } else {  // opening
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String str = "((a+b)+((c)))";

        System.out.println(isDuplicate(str));
    }
}