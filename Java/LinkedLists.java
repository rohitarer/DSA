
// Add Last - O(1)
// Print - O(n)
// Add in the Middle - O(n)
// Size - O(1)

// 2. Remove from LL
// Remove first
// Remove last

public class LinkedLists {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void addMiddle(int idx, int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size=0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if(size==0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if(size==1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;

        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void print() {
        if(head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;

        while(temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next; 
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedLists ll = new LinkedLists();

        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.addMiddle(2, 3);
        ll.print();

        // System.out.println("Size of LL: " + size);

        // ll.removeFirst();
        // ll.print();
        // System.out.println("Size of LL: " + size);

        // ll.removeLast();
        // ll.print();
        // System.out.println("Size of LL: " + size);
    }
}


// 3. Search (Iterative)
// Search for a key in a LL. Return the position where it is found. If not found, return -1.

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void addMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i =0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }

//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next; 
//         }
//         System.out.println("null");
//     }

//     // search
//     public int itrSearch(int key) {
//         Node temp = head;
//         int i =0;

//         while(temp!=null) {
//             if(temp.data == key) {
//                 return i;
//             }

//             temp = temp.next;
//             i++;
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();

//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addMiddle(2, 3);


//         ll.print();

//         System.out.println(ll.itrSearch(3));
//     }
// }



// 4. Search (Recursive)
// Search for a key in a LL. Return the position where it is found. If not found, return -1. Use Recursion.


// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void addMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i =0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }

//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next; 
//         }
//         System.out.println("null");
//     }

//     // helper
//     public int helper(Node head, int key) {
//         if(head == null) {
//             return -1;
//         }

//         if(head.data == key) {
//             return 0;
//         }

//         int idx = helper(head.next, key);

//         if(idx==-1) {
//             return -1;
//         }
//         return idx+1;
//     }

//     // search
//     public int recSearch(int key) {
//         return helper(head, key);
//     }

//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();

//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addMiddle(2, 3);


//         ll.print();

//         System.out.println(ll.recSearch(3));
//     }
// }



// 5. Reverse a LL (Iterative Approach)
// TC - O(n)
// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void addMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i =0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }

//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next; 
//         }
//         System.out.println("null");
//     }

//     // reverse
//     public void reverse() {
//         Node prev = null;
//         Node curr = tail = head;
//         Node next;

//         while(curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         head = prev;
//     }

//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();

//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addMiddle(2, 3);


//         ll.print();

//         ll.reverse();
//         ll.print();
//     }
// }



// 6. Find & Remove Nth node from End (Iterative Approach)

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void addMiddle(int idx, int data) {
//         if(idx == 0) {
//             addFirst(data);
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         Node temp = head;
//         int i =0;

//         while(i < idx-1) {
//             temp = temp.next;
//             i++;
//         }

//         newNode.next = temp.next;
//         temp.next = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }

//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next; 
//         }
//         System.out.println("null");
//     }

//     // delete Nth Node from end
//     public void deleteNthFromEnd(int n) {
//         int sz = 0;
//         Node temp = head;

//         while(temp != null) {
//             temp = temp.next;
//             sz++;
//         }

//         if(n == sz) {
//             head = head.next; // removeFirst
//             return;
//         }

//         // sz-n
//         int i = 1;
//         int iToFind = sz-n;
//         Node prev = head;
//         while(i<iToFind) {
//             prev = prev.next;
//             i++;
//         }
//         prev.next = prev.next.next;
//         return;
//     }

//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();

//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.addLast(5);
//         ll.addMiddle(2, 3);


//         ll.print();

//         ll.deleteNthFromEnd(3);
//         ll.print();
//     }
// }


// 7. Check if LL is a Palindrome

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;
    
//     public void addLast(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }

//         Node temp = head;

//         while(temp != null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next; 
//         }
//         System.out.println("null");
//     }

//     // find mid
//     public Node findMid(Node head) {
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     // Palindrome
//     public boolean checkPalindrome() {
//         if(head == null || head.next==null) {
//             return true;
//         }

//         Node mid = findMid(head);

//         Node prev = null;
//         Node curr = mid;
//         Node next;

//         while (curr!=null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node right = prev;
//         Node left = head;

//         while(right != null) {
//             if(left.data != right.data) {
//                 return false;
//             }
//             left = left.next;
//             right = right.next;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();

//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(2);
//         ll.addLast(1);


//         ll.print();
//         System.out.println(ll.checkPalindrome());
//     }
// }


// 8. Detect a Loop/Cycle in a LL

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
    

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if(slow == fast) {
//                 return true;
//             }
//         }
//         return false;
//     }
//     public static void main(String[] args) {
//         head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = head;

//         System.out.println(isCycle());
//     }
// }



// 9. Remove a Loop/Cycle in a LL

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
    

//     public static boolean isCycle() {
//         Node slow = head;
//         Node fast = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if(slow == fast) {
//                 return true;
//             }
//         }
//         return false;
//     }

//     public static void removeCycle() {
//         Node fast = head;
//         Node slow = head;
//         boolean cycle = false;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;

//             if(slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }

//         if(cycle == false) {
//             return;
//         }

//         slow = head;
//         Node prev = null;

//         while(slow != fast) {
//             prev = fast;
//             slow = slow.next;
//             fast = fast.next;
//         }
//         prev.next = null;
//     }
//     public static void main(String[] args) {
//         head = new Node(1);   // 1->2->3
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3);
//         head.next.next.next = temp;

//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println(isCycle());
//     }
// }


// 10. LL in Java Collections Framework
// public class LinkedLists {
//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList<>();

//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(0);

//         System.out.println(ll);

//         ll.removeFirst();
//         ll.removeLast();

//         System.out.println(ll);
//     }
// }

// 11. Merge Sort 
// TC - O(nlogn)

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;

//         while(temp!=null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public Node getMid(Node head) {
//         Node slow = head;
//         Node fast = head.next;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//         }
//         return slow;
//     }

//     public Node merge(Node head1, Node head2) {
//         Node mergedLL = new Node(-1);
//         Node temp = mergedLL;

//         while(head1 != null && head2 != null) {
//             if(head1.data < head2.data) {
//                 temp.next = head1;
//                 head1 = head1.next;
//                 temp = temp.next;
//             } else {
//                 temp.next = head2;
//                 head2 = head2.next;
//                 temp = temp.next;
//             }
//         }

//         while(head1!=null) {
//             temp.next = head1;
//             head1 = head1.next;
//             temp = temp.next;
//         }

//         while(head2!=null) {
//             temp.next = head2;
//             head2 = head2.next;
//             temp = temp.next;
//         }

//         return mergedLL.next;
//     }

//     public Node mergeSort(Node head) {
//         if(head == null || head.next == null) {
//             return head;
//         }
//         Node midNode = getMid(head);

//         Node rightHead = midNode.next;
//         midNode.next = null;

//         Node newLeft = mergeSort(head);
//         Node newRight = mergeSort(rightHead);

//         return merge(newLeft, newRight);
//     }
//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();
//         ll.addFirst(1);
//         ll.addFirst(2);
//         ll.addFirst(3);
//         ll.addFirst(4);
//         ll.addFirst(5);

//         ll.print();

//         ll.head = ll.mergeSort(ll.head);

//         ll.print();
//     }
// }



// 13. ZigZag LL

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;

//     public void addLast(int data) {
//         Node newNode = new Node(data);

//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         tail = newNode;
//     }

//     public void print() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return;
//         }
//         Node temp = head;

//         while(temp!=null) {
//             System.out.print(temp.data + "->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public void zigzag(Node head) {
//         //find mid
//         Node fast = head.next;
//         Node slow = head;

//         while(fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next;
//         }

//         Node mid = slow;

//         // reverse a 2nd half ll
//         Node curr = mid.next;
//         mid.next = null;
//         Node prev = null;
//         Node next;

//         while(curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }

//         Node left = head;
//         Node right = prev;
//         Node nextL, nextR;

//         // zig zag merge
//         while(left != null && right != null) {
//             nextL = left.next;
//             left.next = right;
//             nextR = right.next;
//             right.next = nextL;

//             left = nextL;
//             right = nextR;
//         }
//     }
//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();
//         ll.addLast(1);
//         ll.addLast(2);
//         ll.addLast(3);
//         ll.addLast(4);
//         ll.addLast(5);

//         ll.print();

//         ll.zigzag(head);

//         ll.print();
//     }
// }


// 14. Doubly LL

// public class LinkedLists {
//     public static class Node {
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data) {
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public static Node head;
//     public static Node tail;
//     public static int size;

//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;
//         if(head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }

//     public int removeFirst() {
//         if(head == null) {
//             System.out.println("LL is empty");
//             return Integer.MIN_VALUE;
//         }

//         if(size==1) {
//             int val = head.data;
//             head = tail = null;
//             return val;
//         }

//         int val = head.data;
//         head = head.next;
//         head.prev = null;
//         return val;
//     }

//     public void print() {
//         Node temp = head;

//         while(temp!=null) {
//             System.out.print(temp.data + "<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {
//         LinkedLists ll = new LinkedLists();
//         ll.addFirst(3);
//         ll.addFirst(2);
//         ll.addFirst(1);

//         ll.print();
//         ll.removeFirst();
//         ll.print();
//         ll.removeFirst();
//         ll.print();
//     }
// }