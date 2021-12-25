import java.util.HashSet;

public class Main {
    
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(containsDuplicate(nums));
    }
    
    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> numbers = new HashSet<>();

        for (Integer num : nums) {

            if (numbers.contains(num))
                return true;

            numbers.add(num);
        }
        
        return false;
    }
}
