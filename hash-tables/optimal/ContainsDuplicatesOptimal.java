import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicatesOptimal {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,4,5};
        System.out.println("Numbers:" + Arrays.toString(numbers));
        System.out.println("Contains Duplicates?" + containsDuplicate(numbers));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static boolean containsDuplicate(int[] numbers){
        HashSet<Integer> set = new HashSet<>();
        for(int n:numbers){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }
}
