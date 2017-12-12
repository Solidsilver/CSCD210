
public class Main {
    public static void main(String[] args) {
   
    System.out.println("Hello World");
    // int[] nums = {5, 19, 6, 9, 0, 12, 11, 18, 102, 15, 1123, 4, 122, 0};
    int[] nums = new int[10];
    ArUt1.populateNums(nums, 50);
    
    double[] dubs = new double[10000];
    ArUt1.populateNums(dubs, 70000);
    //ArUt1.printArray(dubs);

    //ArrayUtils.printArray(nums);
    //nums = ArrayUtils.push(nums, 2);

    /*int[] hobbs = nums;
    int[] calvin = nums;
    int[] bobafett = nums;*/
    System.out.println("index of smallest: " + ArUt1.findSmallestIndex(nums, 0));
    
  // nums = ArrayUtils.push(nums, 1);
    
    int[] hobbs = nums;
    int[] calvin = nums;
    int[] bobafett = nums;
    long startTime;
    long endTime;
    long duration;

    hobbs = ArUt1.quickSort(hobbs);
    ArrayUtils.selectionSort(calvin);
    
    System.out.println("Array Length: " + nums.length);
    System.out.println("First Item: " + nums[1]);
    System.out.println();
    
    /* ArUt1.printArray(nums);
    ArUt1.printArray(hobbs);
    ArUt1.printArray(calvin); */
    // ArrayUtils.selectionSort(nums);
    // ArUt1.printArray(dubs);
    
    // ArUt1.printArray(calvin);
   
    
    
    


    

    
    

  }
}