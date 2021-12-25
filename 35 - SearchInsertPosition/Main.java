
public class Main {
    
    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 6 };
        System.out.println(searchInsert(arr, 7));
    }
    
    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 1) {
            if (target <= nums[0]) {
                return 0;
            }

            return 1;
        }
        
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (nums[m] == target) {
                return m;
            }

            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        return l;
    }
}
