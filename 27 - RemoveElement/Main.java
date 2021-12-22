public class Main {
    
    public static void main(String[] args) {

        // int[] nums = { 3, 2, 2, 3 };
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int size = removeElement(nums, 2);

        System.out.println(size);
    }
    
    public static int removeElement(int[] nums, int val) {
        
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 0; j < nums.length; j++) {

            if (val != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
