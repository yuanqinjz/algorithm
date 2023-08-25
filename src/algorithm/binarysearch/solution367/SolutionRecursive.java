package algorithm.binarysearch.solution367;

/**
 * https://leetcode.com/problems/valid-perfect-square/
 */
public class SolutionRecursive {

    public boolean isPerfectSquare(int num) {
    	if(num == 1) {return true;}
        int index = findSquareIndex(1, num - 1, num);
        if(index != -1) {
        	return true;
        } else {
        	return false;
        }
    }
    
    private int findSquareIndex(int low, int high, int num) {
    	if(low > high) {
    		return -1;
    	}
    	int middle = (high - low) / 2 + low;
    	if(num/middle == middle && num % middle == 0) {
    		return middle;
    	} else if(num / middle > middle ) {
    		return findSquareIndex(middle + 1, high, num);
    	} else {
    		return findSquareIndex(low, middle -1, num);
    	}
    }
    
	public static void main(String[] args) {
		SolutionRecursive solution = new SolutionRecursive();
		System.out.println(solution.isPerfectSquare(9));
		System.out.println(solution.isPerfectSquare(11));
		System.out.println(solution.isPerfectSquare(121));
		
	}

}
