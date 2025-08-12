import java.util.*;
import java.util.LinkedList;


// 1. Diameter of a Tree - Approach 1
// TC - O(n^2);

// public class BinaryTreeB2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null; 
//         }
//     }

//     public static int height(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int lh = height(root.left);
//         int rh = height(root.right);

//         return Math.max(lh, rh) + 1;
//     }

//     public static int diameter(Node root) {
//         if(root == null) {
//             return 0;
//         }

//         int leftDiam = diameter(root.left);
//         int leftHeight = height(root.left);
//         int rightDiam = diameter(root.right);
//         int rightHeight = height(root.right);

//         int selfDiam = leftHeight + rightHeight + 1;

//         return Math.max(selfDiam, Math.max(leftDiam, rightDiam));
//     }

//     public static void main(String[] args) {
//         /*
//                         1
//                        / \
//                       2   3
//                      / \ / \
//                     4  5 6  7
//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter(root));
//     }
// }


// 2. Diameter of a Tree - Approach 2
// TC - O(n);

// public class BinaryTreeB2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null; 
//         }
//     }

//     static class Info {
//         int diam;
//         int ht;
        
//         public Info(int diam, int ht) {
//             this.diam = diam;
//             this.ht = ht;
//         }
//     }

//     public static Info diameter2(Node root) {
//         if(root == null) {
//             return new Info(0, 0);
//         }

//         Info leftInfo = diameter2(root.left);
//         Info rightInfo = diameter2(root.left);

//         int diameter = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht+rightInfo.ht+1);
//         int ht = Math.max(leftInfo.ht, leftInfo.ht) + 1;
//         return new Info(diameter, ht);
//     }

//     public static void main(String[] args) {
//         /*
//                         1
//                        / \
//                       2   3
//                      / \ / \
//                     4  5 6  7
//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         System.out.println(diameter2(root).diam);
//         System.out.println(diameter2(root).ht);
//     }
// }


// 3. Subtree of another tree
// TC - O(n)

// public class BinaryTreeB2 {
//     static class Node {
//         int data;
//         Node left;
//         Node right;

//         public Node(int data) {
//             this.data = data;
//             this.left = null;
//             this.right = null; 
//         }
//     }

//     public static boolean isIdentical(Node root, Node subRoot) {
//         if(root == null && subRoot == null) {
//             return true;
//         } else if(root == null || subRoot == null || root.data != subRoot.data) {
//             return false;
//         }

//         if(!isIdentical(root.left, subRoot.left)) {
//             return false;
//         }

//         if(!isIdentical(root.right, subRoot.right)) {
//             return false;
//         }
//         return true;
//     }

//     public static boolean subtree(Node root, Node subRoot) {
//         if(root == null) {
//             return false;
//         }

//         if(root.data == subRoot.data) {
//             if(isIdentical(root, subRoot)) {
//                 return true;
//             }
//         }

//         return subtree(root.left, subRoot) || subtree(root.right, subRoot);
//     }

//     public static void main(String[] args) {
//         /*
//                         1
//                        / \
//                       2   3
//                      / \ / \
//                     4  5 6  7
//          */

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);
//         root.right.left = new Node(6);
//         root.right.right = new Node(7);

//         /*
//                       2
//                      / \
//                     4   5
//          */

//         Node subRoot = new Node(2);
//         subRoot.left = new Node(4);
//         subRoot.right = new Node(5);

//         System.out.println(subtree(root, subRoot));
//     }
// }


// Top view of a tree

public class BinaryTreeB2 {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }

    static class Info {
        Node node;
        int hd;
        
        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int max=0, min = 0;

        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()) {
            Info curr = q.remove();
            if(curr == null) {
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }

                if(curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd+1);
                }
            }
        }

        for(int i=min; i<=max; i++) {
            System.out.print(map.get(i).data + " ");
        }
    }

    public static void main(String[] args) {
        /*
                        1
                       / \
                      2   3
                     / \ / \
                    4  5 6  7
         */

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        topView(root);
    }
}