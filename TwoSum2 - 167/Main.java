

public class Main {
    public static void main(String[] args) {
        
    }
    
    public static int[] twoSum(int[] numbers, int target) {

        int current = 0;
        int next = numbers.length - 1;

        while (current < next) {
            int sum = numbers[current] + numbers[next];

            if (sum < target) {
                current++;
            } else if (sum > target) {
                next--;
            } else {
                return new int[] { current + 1, next + 1 };
            }
        }
        
        return new int[] {current + 1, next + 1};
    }
}
