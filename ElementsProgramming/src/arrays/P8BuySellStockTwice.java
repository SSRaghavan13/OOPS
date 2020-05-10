package arrays;

public class P8BuySellStockTwice {

	public static int buySellStockTwice(int[] prices) {
		int maxProfit = 0, minPrice = prices[0];
		int profit[] = new int[prices.length];
		for (int i = 0; i < prices.length; i++) {
			minPrice = Math.min(minPrice, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			profit[i] = maxProfit;
		}
		int maxPrice = prices[prices.length - 1];
		for(int i = prices.length - 1; i > 0; i--) {
			maxPrice = Math.max(maxPrice, prices[i]);
			maxProfit = Math.max(maxProfit, maxPrice - prices[i] + profit[i - 1]);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int arr[] = { 310, 315, 275, 295, 260, 270, 290, 230, 255, 250 };
		System.out.println(buySellStockTwice(arr));
		System.out.println(buySellStockTwice(new int[] {12,11,13,9,12,8,14,13,15}));
	}

}
