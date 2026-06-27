import java.util.Arrays;

public class ValidAnagramBrute {
    public static void main(String[] args){
        String text1 = "madam";
        String text2 = "op";
        System.out.println("First string " + text1);
        System.out.println("Second string " + text2);
        System.out.println("Is Anagram? " + isAnagram(text1,text2));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n log n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");
    }
    public static boolean isAnagram(String a,String b){
        if(a.length() != b.length()){
            return false;
        }
        char[] first = a.toCharArray();
        char[] second = b.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);
        return Arrays.equals(first,second);
    }
}
