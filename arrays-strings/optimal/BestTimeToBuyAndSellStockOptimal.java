import java.util.Arrays;

public class BestTimeToBuyAndSellStockOptimal {
    public static void main(String[] args){
        int [] prices = {101,100,200,400,600};
        System.out.println("Stock prices: " + Arrays.toString(prices));
        System.out.println("Maximum Profit: " + maxProfit(prices));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity = O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static int maxProfit(int[] prices){
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i =1;i<prices.length;i++){
            if(prices[i] < minPrice){
                minPrice= prices[i];
            }
            int profit = prices[i] - minPrice;
            if(profit> maxProfit){
                maxProfit = profit;
            }
        }
        return maxProfit;
    }
}
