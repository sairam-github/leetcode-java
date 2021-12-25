public class Main {
    
    public static void main(String[] args) {

        int[] nums = { -4, -1, 0, 3, 10 };
        sortedSquares(nums);
    }
    
    public static int[] sortedSquares(int[] nums) {
        
        int[] sArray = new int[nums.length];

        int nP = 0;
        int counter = 0;
        while (counter < nums.length && nums[counter] < 0) {
            nP++;
            counter++;
        }

        int pP = nums.length - (nP - 1) - 1;
        nP--;
        pP = nP + 1;
        counter = 0;

        while (nP >= 0 && pP < nums.length) {
            int nValue = nums[nP] * nums[nP];
            int pValue = nums[pP] * nums[pP];

            if (nValue < pValue) {
                sArray[counter++] = nValue;
                nP--;
            } else {
                sArray[counter++] = pValue;
                pP++;
            }
        }

        while (nP >= 0) {
            sArray[counter] = nums[nP] * nums[nP];
            counter++;
            nP--;
        }

        while (pP < nums.length) {
            sArray[counter] = nums[pP] * nums[pP];
            counter++;
            pP++;
        }

        return sArray;
    }
}
