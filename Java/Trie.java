// 1. Creating a Trie

public class Trie {
    static class Node {
        Node Character[] = new Node[26];
        boolean eow = false;  // eow = end of word

        public Node() {
            for(int i=0; i<26; i++) {
                Character[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for(int level=0; level<word.length(); level++) {
            int idx = word.charAt(level)-'a';
            if(curr.Character[idx] == null) {
                curr.Character[idx] = new Node();
            }
            curr = curr.Character[idx];
        }
        curr.eow = true;
    }
    public static void main(String[] args) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};
    }
}
