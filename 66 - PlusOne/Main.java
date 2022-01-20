public class Main {
    
    public static void main(String[] args) {

        int[] digits = { 8, 9 };
        plusOne(digits);
    }
    
    public static int[] plusOne(int[] digits) {
        
        int[] result = null;
        int length = digits.length;
        if (digits[length - 1] == 9) {
            result = new int[length + 1];
        } else {
            result = new int[length];
        }

        int carry = 0;
        int add = 1;
        for (int i = length - 1; i > -1; i--) {
            int total = (digits[i] + add + carry);
            result[i] = total % 10;

            carry = total / 10;

            if (add == 1) {
                add = 0;
            }
        }
        
        if (carry != 0)
            result[0] = carry;
        
        return result;
    }
}
