package algorithm.binarysearch.solution69;

public class Solution_norecursive {

    public int mySqrt(int x) {
        
    	if(x == 0)return 0;
    	if(x == 1)return 1;
    	//Suppose n is the number we're looking for.
    	//int low = 1;
    	//int high = x/2 + 1;
    	
    	int low = 1, high = x;
    	while(low <= high) {
    		int middle = (high - low )/2 + low;
    		if(isTargetNumber(middle, x)) {
    			return middle;
    		} else  if(x / middle > middle){
    			low = middle +1;
    		} else {
    			high = middle -1;
    		}
    	}
    	throw new RuntimeException("Should find the sqrt number, but failed");
    }
    
    //Don't use n*n <= x, (n+1)*(n+1) > x, n*n may cause overflow integers, which become negative.
    boolean isTargetNumber(int n, int x) {
    	if((x/n >= n ) && (x/(n + 1) < (n+1))) {
    		return true;
    	}
    	return false;
    }
    
   
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution_norecursive solution = new Solution_norecursive();
		//System.out.println(solution.mySqrt(214799));
		System.out.println(solution.mySqrt(2147395599));
	}

}
