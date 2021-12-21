/*

import java.util.Stack;

public class Main {
    
    public static void main(String[] args) {

        // System.out.println(decodeString("3[a]2[bc]"));
        // System.out.println(decodeString("3[a2[c]]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }

    public static String decodeString(String s) {

        StringBuilder result = new StringBuilder();
        String tempResult = "";

        Stack<String> myStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));

            if (!"".equals(tempResult)) {
                result = new StringBuilder();
            }

            if ("]".equals(c)) {

                StringBuilder tempStr = new StringBuilder(tempResult);
                while (!myStack.empty()) {

                    String stackTop = myStack.pop();

                    if (!("[".equals(stackTop))) {
                        tempStr = new StringBuilder(stackTop + tempStr.toString());
                    } else {
                        break;
                    }
                }

                int stringRepetetions = Integer.valueOf(myStack.pop());
                tempResult = returnRepeatedString(tempStr.toString(), stringRepetetions);
            } else {
                myStack.push(c);
            }

            result.append(tempResult);

            if (myStack.empty()) {
                tempResult = "";
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!myStack.empty()) {
            String top = myStack.pop();
            sb = new StringBuilder(top.concat(sb.toString()));
        }

        return result.toString() + sb.toString();
    }
    
    private static String returnRepeatedString(String s, int times) {
        StringBuffer resultSB = new StringBuffer(s);

        int repetition = times;
        while (repetition != 1) {
            resultSB = resultSB.append(s);
            repetition--;
        }

        return resultSB.toString();
    }
}

*/
