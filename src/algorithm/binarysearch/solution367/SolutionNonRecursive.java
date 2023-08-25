package algorithm.binarysearch.solution367;

/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class SolutionNonRecursive {
	 public boolean isPerfectSquare(int num) {
		 if(num == 1) return true;
		 int low = 1, high = num -1;
		 while(low <=high) {
		 	int middle = (high - low) / 2 + low;
	    	if(num/middle == middle && num % middle == 0) {
	    		return true;
	    	} else if(num / middle > middle ){
	    		low = middle + 1;
	    	} else {
	    		high = middle - 1;
	    	}
		 }
		 return false;
	 }
	    
	    
	public static void main(String[] args) {
		SolutionNonRecursive solution = new SolutionNonRecursive();
		System.out.println(solution.isPerfectSquare(9));
		System.out.println(solution.isPerfectSquare(11));
		System.out.println(solution.isPerfectSquare(121));
		
	}
}
