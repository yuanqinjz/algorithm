package algorithm.binarysearch.solution1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Solution {
	
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0; i < nums.length; i++) {
			Integer index = map.get(target - nums[i]);
			if(index != null) {
				return new int[]{i, index};
			}
			
			map.put(nums[i], i);
		}
		
		throw new RuntimeException("Fail to find two sum");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(Arrays.toString(solution.twoSum(new int[] {3,3},6 )));
	}

}
