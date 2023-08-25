package algorithm.binarysearch.solution153;

public class SolutionRecursive {
    public int findMin(int[] nums) {
    	if(nums[0] < nums[nums.length -1]) {
    		return nums[0];
    	}
    	
        int low = 0, n = nums.length, high = n -1;
        return findMin(nums, low, high);

    }
    
    private int findMin(int[] nums, int low, int high) {
    	if(low >= high) return nums[low];
    	int left = nums[0];
    	int middle = (high - low)/2 + low;
    	if(nums[middle] < left) {
    		if(nums[middle] < nums[middle - 1]) {
    			return nums[middle];
    		}
    		high = middle - 1;
    	} else {
    		low = middle + 1;
    	}
    	return findMin(nums, low, high);
    }
	public static void main(String[] args) {
		SolutionRecursive solutionRecursive = new SolutionRecursive();
		System.out.println(solutionRecursive.findMin(new int[]{1}));
		System.out.println(solutionRecursive.findMin(new int[]{6,7,8,9,10, 12,3,4, 5}));
		System.out.println(solutionRecursive.findMin(new int[]{23, 25, 45, 67, 222, 9, 13, 15}));
	}

}
