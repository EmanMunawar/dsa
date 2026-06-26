import java.util.Arrays;

public class LongestCommonPrefixBrute {
    public static void main(String[] args) {

        String[] prefix = {"floating", "float", "flying"};
        System.out.println("Array whose range is to find is:" + Arrays.toString(prefix));
        System.out.println("Longest common Prefix is " + longestCommonPrefix(prefix));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n*n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");

    }
    public static String longestCommonPrefix(String[] prefix) {
        if (prefix.length == 0) { // if string is empty then return
            return "No common prefix";

        }
        String longestPrefix = "";

        for (int i = 0; i < prefix[0].length(); i++) { // Traverse character of 1st word

            char currentChar = prefix[0].charAt(i);

            for (int j = 1; j < prefix.length; j++) { // Compare characters with 2nd & 3rd & so on words

                if (i >= prefix[j].length() || prefix[j].charAt(i) != currentChar) {

                    return longestPrefix;
                }
            }
            longestPrefix = longestPrefix + currentChar;

        }
        return longestPrefix;
    }

}