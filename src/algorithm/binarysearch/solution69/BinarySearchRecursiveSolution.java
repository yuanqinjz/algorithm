package algorithm.binarysearch.solution69;

public class BinarySearchRecursiveSolution {
	public int search(int[] numbers, int target) {
		return doSearch(numbers, target, 0, numbers.length - 1);
	}
	
	private int doSearch(int[] numbers, int target, int low, int high) {
		if(low > high) {
			return -1;
		}
		int middle = (high - low)/2 + low;
		if(numbers[middle] == target){
			return middle;
		} else if(numbers[middle] < target) {
			return doSearch(numbers, target, middle + 1, high);
		} else {
			return doSearch(numbers, target, low, middle - 1);
		}
	}
	
	public static void main(String[] args) {
		BinarySearchRecursiveSolution solution = new BinarySearchRecursiveSolution();
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 8));
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 7));
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 1));
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 2));

	}

}
