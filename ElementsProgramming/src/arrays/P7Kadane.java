package arrays;

public class P7Kadane {

	public static int kadane(int[] prices) {
		int[] diffArr = new int[prices.length - 1];
		for (int i = 1; i < prices.length; i++) {
			diffArr[i - 1] = prices[i] - prices[i - 1];
		}
		int curr = 0, maxProfit = diffArr[0];
		for (int i = 0; i < diffArr.length; i++) {
			curr = Math.max(diffArr[i], curr + diffArr[i]);
			maxProfit = Math.max(maxProfit, curr);
		}
		return maxProfit;
	}
	
	public static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minPrice = prices[0];
		for(int i = 0; i < prices.length; i++) {
			maxProfit = Math.max(maxProfit, prices[i] - minPrice);
			minPrice = Math.min(minPrice, prices[i]);
		}
		return maxProfit;
	}

	public static void main(String[] args) {
		int arr[] = { 310, 315, 275, 295, 260, 270, 290, 230, 255, 250 };
		System.out.println(kadane(arr));
		System.out.println(maxProfit(arr));
	}

}
