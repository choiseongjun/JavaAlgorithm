package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class PermutationLeet {
	//ex input:1,2,3
	//call 0;
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> ret = new ArrayList<>();
		List<Integer> tmp = new ArrayList<>();
		backtrack(nums, ret, tmp);
		return ret;
	}

	private void backtrack(int[] nums, List<List<Integer>> ret, List<Integer> tmp) {
		//base case
		if(tmp.size()==nums.length) {
			ret.add(new ArrayList<Integer>(tmp));
			return; 	
		}
		for(int num:nums) {
			if(tmp.contains(num)) continue;
			tmp.add(num);
			backtrack(nums, ret, tmp);
			tmp.remove(tmp.size()-1);
		}
	}
	public static void main(String[] args) {
		int[] nums= {1,2,3};
		PermutationLeet pr=new PermutationLeet();

		System.out.println(pr.permute(nums));
	}
}
