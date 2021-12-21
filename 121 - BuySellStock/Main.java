/*

public class Main {
    
    public static void main(String[] args) {

        // int[] prices = { 7, 1, 5, 3, 6, 4 };
        // int[] prices = { 7,6,4,3,1 };
        int[] prices = {7,1,5,3,6,4};
        System.out.println(findMaxProfit(prices));
    }

    public static int findMaxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }
        
        int maxProfit = 0;
        int buyIndex = 0;
        int sellIndex = 1;
        
        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[sellIndex] > prices[buyIndex]) {
                int profit = prices[sellIndex] - prices[buyIndex];
                maxProfit = Math.max(maxProfit, profit);
            } else {
                buyIndex = sellIndex;
            }
            
            sellIndex++;
        }
        
        return maxProfit;
    }
}

*/
