import java.util.Arrays;
public class FindClosestNumberToZeroBrute {
    public static void main(String[] args) {
        int[] number = {1,98,5,-1,7,2,4,3};
        System.out.println("Array in which we have to find Number closest to Zero = " + Arrays.toString(number));
        System.out.println("Number which is close to Zero is:" + findClosestNumber(number));
        System.out.println("===============================");
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");

    }
    public static int findClosestNumber(int[] number) {
        int closest = number[0];  // Suppose array 1st element is closest to 0

        for (int i = 0; i < number.length; i++) { // Loop for traversing the array

            if (Math.abs(number[i]) < Math.abs(closest) || (Math.abs(number[i]) == Math.abs(closest) && number[i] > closest)) {
                // condition check and update value of Closest
                closest = number[i];
            }
        }
        return closest;
    }

}