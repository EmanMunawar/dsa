import java.util.Arrays;
public class LongestCommonPrefixOptimal {
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

    public static String longestCommonPrefix(String[] prefix) { // function to find longest common prefix
        if (prefix.length == 0) { // if array is empty return
            return "No prefixes";
        }
        String longestPrefix = prefix[0];

        for (int i = 1; i < prefix.length; i++) {
            while (!prefix[i].startsWith(longestPrefix)) {
                longestPrefix = longestPrefix.substring(0, longestPrefix.length() - 1);
            }
        }
        return longestPrefix;
    }
}