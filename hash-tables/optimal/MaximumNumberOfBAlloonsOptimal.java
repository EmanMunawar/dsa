import java.util.HashMap;

public class MaximumNumberOfBAlloonsOptimal {
    public static void main(String[] args) {
        String text = "loonbalxballpoon";
        System.out.println("String: " + text);
        System.out.println("Maximum Balloons = " + maxNumberOfBalloons(text));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");

    }
    // Function to count balloons
    public static int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int b = map.getOrDefault('b', 0);
        int a = map.getOrDefault('a', 0);
        int l = map.getOrDefault('l', 0) / 2;
        int o = map.getOrDefault('o', 0) / 2;
        int n = map.getOrDefault('n', 0);
        return Math.min(Math.min(Math.min(b, a), Math.min(l, o)), n);
    }

}
