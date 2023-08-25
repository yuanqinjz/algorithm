package algorithm.binarysearch.solution33;

public class SolutionRecursive {

    public int search(int[] nums, int target) {
    	return doSearch(nums, target, 0, nums.length - 1);
    }
    
    private int doSearch(int[] nums, int target, int low, int high) {
    	if(low > high) return -1;
    	int leftMost = nums[0];
        int middle = (high - low)/2 + low;
        if(nums[middle] == target) {
        	return middle;
        } else if(nums[middle] < target) {
        	
        	if(nums[middle] < leftMost) {
        		high = middle -1;
        	} else {
        		low = middle + 1;
        	}
        } else {
        	if(nums[middle] >= leftMost) {
        		if(target >= leftMost) {
        			high = middle -1;
        		} else {
        			low = middle + 1;
        		}
        	} else {
        		if(target > leftMost) {
        			high = middle - 1;
        		} else {
        			high = middle -1;
        		}
        	}
        }
        return doSearch(nums, target, low, high);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SolutionRecursive solution = new SolutionRecursive();
		System.out.println(solution.search(new int[] {5, 1,3},3));
		//System.out.println(solution.search(new int[] {4,5,6,7,0,1,2}, 0));
	}

}
