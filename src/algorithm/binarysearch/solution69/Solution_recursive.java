package algorithm.binarysearch.solution69;

/**
 * https://leetcode.com/problems/sqrtx/
 */
public class Solution_recursive {
	
    public int mySqrt(int x) {
        
    	if(x == 0)return 0;
    	if(x == 1)return 1;
    	//Suppose n is the number we're looking for.
    	//int low = 1;
    	//int high = x/2 + 1;
    	
    	return findNumber(1, x, x);
    }

    
    int findNumber(int low, int high, int x) {
    	int middle = (high - low )/2 + low;
    	
    	if(isTargetNumber(middle, x)) {
    		return middle;
    	} else if(((long)middle*(long)middle) < x) {
    		return findNumber(middle + 1, high, x);
    	} else {
    		return findNumber(low, middle - 1, x);
    	}
    }
    
    //Don't use n*n <= x, (n+1)*(n+1) > x, n*n may cause overflow integers, which become negative.
    boolean isTargetNumber(int n, int x) {
    	if((((long)n*(long)n) <= x ) && (((long)(n+1)*(long)(n+1)) > x)) {
    		return true;
    	}
    	return false;
    }
	
	public static void main(String[] args) {
		Solution_recursive solution = new Solution_recursive();
		//System.out.println(solution.mySqrt(214799));
		System.out.println(solution.mySqrt(4));
		
	}

}
