package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode283 {

	public static void main(String[] args) {
		int[] nums = { 0, 1, 0, 3, 12 };
		leetcode283 le = new leetcode283();
		le.moveZeroes(nums);
	}

	public void moveZeroes(int[] nums) {
		int len = nums.length;
		if (len == 0)
			return;
		int i = 0;
		int j = i + 1;
		while (j < len) {
			if (nums[i] != 0) {
				i++;
				j++;
			} else if (nums[i] == 0 && nums[j] != 0) {
				int temp = nums[j];
				nums[j] = 0;
				nums[i] = temp;
				i++;
				j++;
			} else
				j++;
		}
		for(i=0;i<100;i++) {
			System.out.println(nums[i]);
		}
	}
}
