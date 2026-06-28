import java.util.ArrayList;
public class ImplementTrieBrute {

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println("Search floating: " + trie.search("floating"));
        System.out.println("Search float: " + trie.search("float"));
        System.out.println("StartsWith float: " + trie.startsWith("float"));
        trie.insert("app");
        System.out.println("Search float: " + trie.search("float"));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Insert = O(1)");
        System.out.println("Search = O(n)");
        System.out.println("StartsWith = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

        }
    static class Trie {
        ArrayList<String> words = new ArrayList<>();
        public void insert(String word) {
            words.add(word);

        }
    public boolean search(String word) {
        return words.contains(word);

        }
    public boolean startsWith(String prefix) {
        for (String word : words) {
            if (word.startsWith(prefix)) {
                return true;
                }

            }

        return false;

        }

    }}


