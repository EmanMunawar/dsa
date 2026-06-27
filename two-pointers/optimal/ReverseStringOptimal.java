import java.util.Arrays;

public class ReverseStringOptimal {

        public static void main(String[] args){
            char[] letters = {'h','e','l','l','o'};
            System.out.println("Original word:" + Arrays.toString(letters));
            reverseString(letters);
            System.out.println("Reversed word:" + Arrays.toString(letters));
            System.out.println();
            System.out.println("=== Time & Space Complexity ===");
            System.out.println("Time Complexity = O(n)");
            System.out.println("Space Complexity = O(1)");
            System.out.println("===============================");
        }
        public static void reverseString(char[] letters){
            int left = 0;
            int right = letters.length -1;
            while(left < right){
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] = temp;
                left++;
                right--;
            }

 }

 }