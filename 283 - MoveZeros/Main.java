public class Main {
    
    public static void main(String[] args) {

        int[] numbers = { 1 };
        moveZeroes(numbers);

        for (int i : numbers) {
            System.out.println(i);
        }
    }
    
    public static void moveZeroes(int[] nums) {
        
        if (nums == null || nums.length == 0 ||  nums.length == 1) {
            return;
        }

        int i = 0;
        
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {

                if (i != j) {
                    nums[i] = nums[i] - nums[j];
                    nums[j] = nums[i] + nums[j];
                    nums[i] = nums[j] - nums[i];
                }

                i++;
            }
        }
    }
}
