package Jul.Jul30;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }

            int potentialProfit = price - minPrice;
            if (potentialProfit > maxProfit) {
                maxProfit = potentialProfit;
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        MaxProfit solution = new MaxProfit();

        // Example 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        System.out.println("Example 1: " + solution.maxProfit(prices1)); // Output: 5

        // Example 2
        int[] prices2 = {7, 6, 4, 3, 1};
        System.out.println("Example 2: " + solution.maxProfit(prices2)); // Output: 0
    }

}
