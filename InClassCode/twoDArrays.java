public class twoDArrays {
    public static void main(String[] args) {
        // String[] names = {"Brian", "Stu", "Tom"};   // We can have an array of Strings, which are objects.
                                                    // Arrays are also objects, so we can have an array of arrays!

        // System.out.println(names);

        int[] nums1 = {5, 1, 2, 0, 11};
        int[] nums2 = {8, 7, -4, 3, 1};
        int[] nums3 = {9, -12, 6, 1, 4};

        int[][] nums = {nums1, nums2, nums3}; // An array of arrays: a 2-Dimensional Array;


        // System.out.println(nums[1][4]);
        displayArray(nums);
        System.out.println("\nSum: The answer is " + sumArray(nums));
    }

    private static void displayArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {          // goes through every item in the array (each of which is another array)
            for (int j = 0; j < arr[i].length; j++) {   // goes through every item in the array inside the index of the prev. array.
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int sumArray(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

}