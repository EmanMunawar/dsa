import java.util.HashMap;

public class MaximumNumberOfBalloonsBrute {
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
        int count = 0;
        while (true) {

            if (map.getOrDefault('b', 0) >= 1 &&
                    map.getOrDefault('a', 0) >= 1 &&
                    map.getOrDefault('l', 0) >= 2 &&
                    map.getOrDefault('o', 0) >= 2 &&
                    map.getOrDefault('n', 0) >= 1) {

                count++;

                    map.put('b', map.get('b') - 1);
                    map.put('a', map.get('a') - 1);
                    map.put('l', map.get('l') - 2);
                    map.put('o', map.get('o') - 2);
                    map.put('n', map.get('n') - 1);

            } else {
                break;
            }
        }
        return count;

    }

}