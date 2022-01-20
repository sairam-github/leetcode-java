import java.util.HashMap;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        // [1,2,3,1,1,3]
        // [1,1,1,1]
        // [1,2,3]
        int myList[] = new int[] { 1, 2, 3 };
        numIdenticalPairs(myList);
    }
    
    public static int numIdenticalPairs(int[] nums) {

        int pairs = 0;

        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (int num : nums) {
            if (myMap.containsKey(num)) {
                int count = myMap.remove(num);
                count++;
                myMap.put(num, count);
            } else {
                myMap.put(num, 1);
            }
        }

        for (int key : myMap.keySet()) {
            int count = myMap.get(key);
            pairs += (count * (count - 1)) / 2;
        }

        return pairs;
    }
    
    // HacketRank solution
    // https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
    public static int sockMerchant(int n, List<Integer> ar) {
        
        int pairs = 0;
        HashMap<Integer, Integer> myMap = new HashMap<>();

        for (Integer num : ar) {
            if (myMap.containsKey(num)) {
                int count = myMap.remove(num);
                count++;
                myMap.put(num, count);
            } else {
                myMap.put(num, 1);
            }
        }

        for (int key : myMap.keySet()) {
            int count = myMap.get(key);
            pairs += count / 2;
        }

        return pairs;
    }
}
