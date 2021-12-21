public class Main {
    public static void main(String[] args) {

        // int[] myNumbers = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] myNumbers = { 1, 1, 2 };
        int size = removeDuplicates(myNumbers);

        System.out.println(size);
    }
    
    public static int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < nums.length; j++) {

            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            }
        }
        
        return i + 1;
    }
}
