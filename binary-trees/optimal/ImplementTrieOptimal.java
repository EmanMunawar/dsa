public class ImplementTrieOptimal {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("floating");
        System.out.println("Search floating: " + trie.search("floating"));
        System.out.println("Search float: " + trie.search("float"));
        System.out.println("StartsWith float: " + trie.startsWith("float"));
        trie.insert("float");
        System.out.println("Search float: " + trie.search("float"));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Insert = O(l)");
        System.out.println("Search = O(l)");
        System.out.println("StartsWith = O(l)");
        System.out.println("Space Complexity = O(26*n)");
        System.out.println("===============================");

    }
    static class TrieNode {
        TrieNode[] children;
        boolean isEnd;
        TrieNode() {
            children = new TrieNode[26];
            isEnd = false;

        }

    }

    static class Trie {
        TrieNode root;
        Trie() {
            root = new TrieNode();

        }

        public void insert(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (current.children[index] == null) {
                    current.children[index] = new TrieNode();

                }
                current = current.children[index];

            }
            current.isEnd = true;

        }
        public boolean search(String word) {
            TrieNode current = root;
            for (int i = 0; i < word.length(); i++) {
                int index = word.charAt(i) - 'a';
                if (current.children[index] == null) {
                    return false;

                }
                current = current.children[index];

            }
            return current.isEnd;

        }
        public boolean startsWith(String prefix) {
            TrieNode current = root;
            for (int i = 0; i < prefix.length(); i++) {
                int index = prefix.charAt(i) - 'a';
                if (current.children[index] == null) {
                    return false;

                }
                current = current.children[index];

            }
            return true;

        }

    }
}
