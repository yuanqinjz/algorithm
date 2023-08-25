package algorithm.generic.solution217;

import java.util.HashMap;
import java.util.Map;

public class SolutionWithArray {
	
    public boolean containsDuplicate(int[] nums) {
        Boolean[] existValues = new Boolean[100000];
        for(int num : nums) {
        	if(existValues[num] !=  null) {
        		return true;
        	}
        	existValues[num] = Boolean.TRUE;
        }
        return false;
    }
    
	public static void main(String[] args) {
		SolutionWithArray solution = new SolutionWithArray();
		System.out.println(solution.containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
		System.out.println(solution.containsDuplicate(new int[] {4, 1, 3, 2}));
	}

}
