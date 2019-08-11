package BinarySearch;

public class SearchInsertPosition {

	public static int searchInsert(int[] nums, int target) {
	
		int answer=0;
		for(int i=0;i<nums.length;i++) {
			if(target==nums[i]) {
				answer=i;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		int[] nums= {1,3,5,6};
		int target=5;
		System.out.println(searchInsert(nums, target));
	}
}
