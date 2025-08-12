import java.util.*;

// 1. Build a BST
// TC - O(H) H-> height of tree  and in worst case for skewed tree it goes for O(n)
// public class BST {
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

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }
//     public static void main(String[] args) {
//         int values[] = {5, 1, 3, 4, 2, 7};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);
//     }
// }



// 2. Search in a BST
// TC - O(H) H-> height of tree  and in worst case for skewed tree it goes for O(n)
// public class BST {
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

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }


//     // search
//     public static boolean search(Node root, int key) {
//         if(root == null) {
//             return false;
//         }

//         if(root.data == key) {
//             return true;
//         }

//         if(root.data > key) {
//             return search(root.left, key);
//         } else {
//             return search(root.right, key);
//         }
//     }
//     public static void main(String[] args) {
//         int values[] = {5, 1, 3, 4, 2, 7};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);

//         System.out.println();
//         if(search(root, 1)) {
//             System.out.println("key found");
//         } else {
//             System.out.println("key not found");
//         }
//     }
// }



// 3. Delete a node

// public class BST {
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

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }


//     // delete
//     public static Node delete(Node root, int val) {
//         if(root.data > val) {
//             root.left = delete(root.left, val);
//         } else if(root.data < val) {
//             root.right = delete(root.right, val);
//         } else {
//             // case 1 - leaf node
//             if(root.left == null && root.right == null) {
//                 return null;
//             } 

//             // case 2 - single child
//             if(root.left == null) {
//                 return root.right;
//             } else if(root.right == null){
//                 return root.left;
//             }

//             // case 3 - two child
//             Node IS = findInOrderSuccessor(root.right);
//             root.data = IS.data;
//             root.right = delete(root.right, IS.data);
//         }
//         return root;
//     }

//     public static Node findInOrderSuccessor(Node root) {
//         while(root.left != null) {
//             root = root.left;
//         }
//         return root;
//     }
//     public static void main(String[] args) {
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);

//         System.out.println();
//         delete(root, 1);
//         inorder(root);
//     }
// }


// 4. Print in range  // doubt

// public class BST {
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

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }


//     public static void printInRange(Node root, int k1, int k2) { 
//         if(root == null) {
//             return;
//         }

//         if(k1<= root.data && root.data<= k2) {
//             printInRange(root.left, k1, k2);
//             System.out.print(root.data + " ");
//             printInRange(root.right, k1, k2);
//         } else if (root.data < k1) {
//             printInRange(root.right, k1, k2);
//         } else {
//             printInRange(root.left, k1, k2);
//         }
//     }
//     public static void main(String[] args) {
//         int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);

//         System.out.println();
//         printInRange(root, 1, 6);
//     }
// }


// 5. Root to leaf path

// public class BST {
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

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void printPath(ArrayList<Integer> path) {
//         for(int i=0; i<path.size(); i++) {
//             System.out.print(path.get(i) + "->");
//         }
//         System.out.println("null");
//     }

//     public static void root2LeafPath(Node root, ArrayList<Integer> path) {
//         if(root == null) {
//             return;
//         }

//         path.add(root.data);

//         if(root.left == null && root.right == null) {
//             printPath(path);
//         }

//         root2LeafPath(root.left, path);
//         root2LeafPath(root.right, path);
//         path.remove(path.size()-1);
//     }
//     public static void main(String[] args) {
//         int values[] = {8, 5, 3, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);

//         System.out.println();
//         root2LeafPath(root, new ArrayList<>());
//     }
// }


// 6. Validate BST

// public class BST {
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

//     public static Node insert(Node root, int val) {
//         if(root == null) {
//             root = new Node(val);
//             return root;
//         }

//         if(root.data > val) {
//             root.left = insert(root.left, val);
//         } else {
//             root.right = insert(root.right, val);
//         }

//         return root;
//     }

//     public static void inorder(Node root) {
//         if(root == null) {
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }

//     public static void printPath(ArrayList<Integer> path) {
//         for(int i=0; i<path.size(); i++) {
//             System.out.print(path.get(i) + "->");
//         }
//         System.out.println("null");
//     }

//     public static boolean isValidBST(Node root, Node min, Node max) {
//         if(root == null) {
//             return true;
//         }

//         if(min != null && root.data <= min.data) {
//             return false;
//         }

//         if(max != null && root.data >= max.data) {
//             return false;
//         }

//         return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
//     }
//     public static void main(String[] args) {
//         int values[] = {8, 5, 3, 6, 10, 11, 14};
//         Node root = null;

//         for(int i=0; i<values.length; i++) {
//             root = insert(root, values[i]);
//         }

//         inorder(root);

//         System.out.println();
//         if(isValidBST(root, null, null)) {
//             System.out.println("is valid");
//         } else {
//             System.out.println("not valid");
//         }
//     }
// }


// 7. Mirror a BST
// TC - O(n)

public class BST {
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

    public static Node mirrorBST(Node root) {
        if(root == null) {
            return null;
        }

        Node leftMirror = mirrorBST(root.left);
        Node rightMirror = mirrorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }

    public static void preorder(Node root) {
        if(root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preorder(root.left );
        preorder(root.right);
    }
    public static void main(String[] args) {
        /*
         *              8
         *             / \
         *            5   10
         *           / \    \
         *          3   6    11
         */

        Node root = new Node(8);
        root.left = new Node(5);
        root.right = new Node(10);
        root.left.left = new Node(3);
        root.left.right = new Node(6);
        root.right.right = new Node(11);


        /*
         *              8
         *             / \
         *            10  5
         *           /   / \
         *          11  6   3
         *          Mirror BST
         */

        mirrorBST(root);
        preorder(root);
    }
}
