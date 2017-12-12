import java.util.Random;
public class Main {

	public static void main(String[] args) throws Exception {
		
		// Testing ArrayUtils
		int[] nums = {3, 2, 2, 234, 2, 3, 4, -2, -34, 2, 34, 2, 4};
		out(ArrayUtils.getLargest(nums));
		out(ArrayUtils.getSmallest(nums));
		out(ArrayUtils.getSum(nums));
		
		// Testing FileUtils
		String out = "Hello, Lindsey";
		String in;
		FileUtils.writeStringToFile("letter.txt", out);
		in = FileUtils.readFileToString("letter.txt");
		out(in);
		
		
		
		//Question 3
		int[][] numGrid = new int[10][10];
		populateGrid(numGrid);
		out(meanGrid(numGrid));
		
		
	}
	
	private static int meanGrid(int[][] nums) {
		int sum = 0;
		int tempSum = 0;;
		for (int ix = 0; ix < nums.length; ix++) {
			tempSum = sumRow(nums[ix]);
			out("Row " + ix + ": " + tempSum/10);
			sum += tempSum;
		}
		System.out.print("Total: ");
		return sum/100;
	}
	
	private static int sumRow(int[] row) {
		int sum = 0;
		for (int ix = 0; ix < row.length; ix++) {
			sum += row[ix];
		}
		return sum;
	}
	
	private static void populateGrid(int[][] nums) {
		Random randInt = new Random();
		for (int ix = 0; ix < nums.length; ix++) {
			for (int iy = 0; iy < nums[ix].length; iy++) {
				nums[ix][iy] = randInt.nextInt(999) + 1;
			}
		}
		
	}
	
	
	// Arrays for quick printing
	private static void out(int i) {
		System.out.println(i);
	}
	private static void out(String s) {
		System.out.println(s);
	}

}
