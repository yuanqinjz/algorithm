package algorithm.generic.solution121;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i< prices.length; i++) {
        	maxProfit = Math.max(maxProfit, prices[i] - min);
        	min = Math.min(min, prices[i]);
        	
        }
        
        return maxProfit;
    }
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.maxProfit(new int[] {7,1,5,3,6,4}));
	}

}
