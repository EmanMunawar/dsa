import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagramsBrute {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(groupAnagrams(words));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2 × k log k)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }
    public static List<List<String>> groupAnagrams(String[] words) {

        List<List<String>> answer = new ArrayList<>();
        for (String word : words) {
            boolean found = false;
            String sortedWord = sortString(word);
            for (List<String> group : answer) {
                String sortedGroupWord = sortString(group.get(0));
                if (sortedWord.equals(sortedGroupWord)) {
                    group.add(word);
                    found = true;
                    break;
                }
            }

            if (!found) {
                List<String> newGroup = new ArrayList<>();
                newGroup.add(word);
                answer.add(newGroup);
            }
        }
        return answer;
    }
    // Function to sort a string
    public static String sortString(String word) {
        char[] characters = word.toCharArray();
        Arrays.sort(characters);
        return new String(characters);
    }}