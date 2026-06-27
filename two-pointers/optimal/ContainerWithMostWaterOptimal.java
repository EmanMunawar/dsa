import java.util.Arrays;

public class ContainerWithMostWaterOptimal {
    public static void main(String[] args){
        int[] height = {1,3,5,7,9,2,4,6};
        System.out.println("Height:" + Arrays.toString(height));
        System.out.println("Maximum Water:" + maxArea(height));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n^2)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static int maxArea(int[] height){
        int left =0;
        int right = height.length -1;
        int maxArea = 0;
        while(left<right){
            int width = right-left;
            int minHeight = Math.min(height[left],height[right]);
            int area = width *minHeight;
            if (area > maxArea){
                maxArea= area;
            }
            if (height[left]< height[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

}
