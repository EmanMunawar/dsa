import java.util.HashMap;


public class ValidAnagramOptimal {
    public static void main(String[] args){
        String text1 = "madam";
        String text2 = "op";
        System.out.println("First string " + text1);
        System.out.println("Second string " + text2);
        System.out.println("Is Anagram? " + isAnagram(text1,text2));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");
    }
    public static boolean isAnagram(String a,String b){
        if (a.length() != b.length()){
            return false;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for (char ch: a.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch: b.toCharArray()){
            if(!map.containsKey(ch) || map.get(ch) == 0){
                return false;
            }
            map.put(ch,map.get(ch)-1);
        }
        return true;
    }
}
