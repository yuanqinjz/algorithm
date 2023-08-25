package algorithm.generic.solution217;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class Solution {
	
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> existMap = new HashMap<>();
        for(int num : nums) {
        	if(existMap.containsKey(num)) {
        		return true;
        	}
        	existMap.put(num, true);
        }
        return false;
    }
    
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
		System.out.println(solution.containsDuplicate(new int[] {4, 1, 3, 2}));
	}

}
