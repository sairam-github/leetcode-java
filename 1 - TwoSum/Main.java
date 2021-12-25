import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


    }
    
     public int[] twoSum(int[] nums, int target) {
        
        if (nums == null || nums.length == 0) {
            throw new ArrayIndexOutOfBoundsException("Array can't be null or empty.");
        }
        
        Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        
        for (int i = 0; i < nums.length; i++) {

            Integer location = myMap.get(nums[i]);
            if (location != null) {

                result[0] = location;
                result[1] = i;

                return result;
            }

            myMap.put(target - nums[i], i);
        }
        
        return result;
    }
}