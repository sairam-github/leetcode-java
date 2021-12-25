public class Main {
    public static void main(String[] args) {

        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int[] nums2 = { 2, 5, 6 };
        // merge(nums1, 3, nums2, 3);

        // int[] nums1 = { 1 };
        // int[] nums2 = { };
        // merge(nums1, 1, nums2, 0);

        int[] nums1 = { 0 };
        int[] nums2 = { 1 };
        merge(nums1, 0, nums2, 1);

        // int[] nums1 = { 4, 5, 6, 0, 0, 0 };
        // int[] nums2 = { 1, 2, 3 };
        // merge(nums1, 3, nums2, 3);
    }
    
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int last = m + n - 1;

        while (m > 0 && n > 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[last] = nums1[m - 1];
                m--;
            } else {
                nums1[last] = nums2[n - 1];
                n--;
            }

            last--;
        }

        while (n > 0) {
            nums1[last] = nums2[n -1];
            last--; n--;
        }
    }
}
