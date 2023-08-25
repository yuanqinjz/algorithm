package algorithm.binarysearch.solution69;

public class BinarySearchNonRecursive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchNonRecursive solution = new BinarySearchNonRecursive();
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 8));
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 7));
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 1));
		System.out.println(solution.search(new int[] {1, 3, 7, 9, 12, 15}, 2));
	}
	
	public int search(int[] numbers, int target) {
		int low = 0, high = numbers.length - 1;
		while(low < high) {
			int middle = (high - low)/2 + low;
			if(numbers[middle] == target){
				return middle;
			} else if(numbers[middle] < target) {
				low = middle + 1;
			} else {
				high = middle - 1;
			}
		}
		return -1;
	}
	

}
