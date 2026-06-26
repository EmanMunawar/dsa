import java.util.ArrayList;
import java.util.Arrays;

public class SummaryRangesBrute {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5,6,7,9,10};
        System.out.println("Array whose range is to find is:" + Arrays.toString(arr));
        System.out.println("Range of Array: " + summaryRanges(arr));
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n*n)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }
    // Function to find summary ranges
    public static ArrayList<String> summaryRanges(int[] arr) {
        ArrayList<String> result = new ArrayList<>(); // array list to store final result of ranges
        int i = 0;
        while (i < arr.length) {
            int first = arr[i];
            int last = first;

            while (i + 1 < arr.length && arr[i + 1] == arr[i] + 1) { // // Check consecutive numbers
                last = arr[i + 1];
                i++;

            }
            if (first == last) {   // For Single number
                result.add(String.valueOf(first));
            }
            else {
                result.add(first + "->" + last);  // Printing range

            }
            i++;
        }
        return result;

    }
}