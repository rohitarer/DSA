

import java.util.LinkedList;
import java.util.Queue;

// 1. Build Binary Preorder Code

// public class BinaryTreeB {
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

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) {
//             idx++;

//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }
//     }
//     public static void main(String[] args) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);
//     }
// }


// 2. Preorder Traversal, Inorder Traversal, Postorder Traversal
// TC - O(n)

// public class BinaryTreeB {
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

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) {
//             idx++;

//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }

//         public static void preorder(Node root) {
//             if(root == null) {
//                 System.out.print(-1 + " ");
//                 return;
//             }
//             System.out.print(root.data + " ");
//             preorder(root.left);
//             preorder(root.right);
//         }

//         public static void inorder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             inorder(root.left);
//             System.out.print(root.data + " ");
//             inorder(root.right);
//         }

//         public static void postorder(Node root) {
//             if(root == null) {
//                 return;
//             }
//             postorder(root.left);
//             postorder(root.right);
//             System.out.print(root.data + " ");
//         }
//     }

//     public static void main(String[] args) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         tree.preorder(root);
//         System.out.println();
//         tree.inorder(root);
//         System.out.println();
//         tree.postorder(root);
//         System.out.println();
//     }
// }


// 3. Level Order Traversal
// TC - O(n)

// public class BinaryTreeB {
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

//     static class BinaryTree {
//         static int idx = -1;

//         public static Node buildTree(int nodes[]) {
//             idx++;

//             if(nodes[idx] == -1) {
//                 return null;
//             }

//             Node newNode = new Node(nodes[idx]);
//             newNode.left = buildTree(nodes);
//             newNode.right = buildTree(nodes);

//             return newNode;
//         }

//         public static void levelorder(Node root) {
//             if(root == null) {
//                 return;
//             }

//             Queue<Node> q = new LinkedList<>();

//             q.add(root);
//             q.add(null);

//             while(!q.isEmpty()) {
//                 Node currNode = q.remove();
//                 if(currNode == null) {
//                     System.out.println();
//                     if(q.isEmpty()) {
//                         break;
//                     } else {
//                         q.add(null);
//                     }
//                 } else {
//                     System.out.print(currNode.data + " ");
//                     if(currNode.left != null) {
//                         q.add(currNode.left);
//                     }
//                     if(currNode.right != null) {
//                         q.add(currNode.right);
//                     }
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         tree.levelorder(root);
//     }
// }


// 4. Height of a Tree
// TC - O(n)

// public class BinaryTreeB {
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

//         System.out.println(height(root));
//     }
// }


// 5. Count of Nodes of a Tree
// TC - O(n)

// public class BinaryTreeB {
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

//     public static int count(Node root) {
//         if(root == null) {
//             return 0;
//         }
        
//         int leftCount = count(root.left);
//         int rightCount = count(root.right);

//         return leftCount + rightCount + 1;
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

//         System.out.println(count(root));
//     }
// }


// 6. Sum of Nodes
// TC - O(n)

public class BinaryTreeB {
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

    public static int sum(Node root) {
        if(root == null) {
            return 0;
        }

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return leftSum + rightSum + root.data;
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

        System.out.println(sum(root));
    }
}