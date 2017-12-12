
public class ArrayUtils {
	
	public static int getSmallest(int[] nums) throws Exception {
		if (nums.length > 0) {
			int small = nums[0];
			if (nums.length == 1) {
				return small;
			}
			for (int ix = 1; ix < nums.length; ix++) {
				if (nums[ix] < small) {
					small = nums[ix];
				}
			}
			return small;
		} else {
			throw new Exception("IllegalArgument: Array too small");
		}
	}
	
	public static int getLargest(int[] nums) throws Exception {
		if (nums.length > 0) {
			int big = nums[0];
			if (nums.length == 1) {
				return big;
			}
			for (int ix = 1; ix < nums.length; ix++) {
				if (nums[ix] > big) {
					big = nums[ix];
				}
			}
			return big;
		} else {
			throw new Exception("IllegalArgument: Array too small");
		}
	}
	
	public static int getSum(int[] nums) throws Exception {
		if (nums.length > 1) {
			int sum = 0;
			for (int ix = 0; ix < nums.length; ix++) {
				sum += nums[ix];
			}
			return sum;
		} else {
			throw new Exception("IllegalArgument: Array too small");
		}
	}
}
