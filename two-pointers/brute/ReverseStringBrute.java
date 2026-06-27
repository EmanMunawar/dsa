import java.util.Arrays;

public class ReverseStringBrute {
    public static void main(String[] args){
        char[] letters = {'h','e','l','l','o'};
        System.out.println("Original word:" + Arrays.toString(letters));
        reverseString(letters);
        System.out.println("Reversed word:" + Arrays.toString(letters));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");
    }
    public static void reverseString(char[] letters){
        char[] temp= new char[letters.length];
        int index =0;
        for(int i= letters.length-1; i>=0;i--){
            temp[index] = letters[i];
            index++;
        }
        for(int i=0;i<letters.length;i++){
            letters[i] = temp[i];
        }
    }
}
