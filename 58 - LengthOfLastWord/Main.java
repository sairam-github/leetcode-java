public class Main {
    public static void main(String[] args) {
        // String str = "   fly me   to   the moon  ";
        String str = "luffy is still joyboy";
        // String str = "Hellow World";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        boolean trigger = false;
        int length = 0;
        for (int i = s.length(); i > 0; i--) {

            if (s.charAt(i - 1) == ' ') {
                if (trigger) {
                    break;
                }
            } else {
                trigger = true;
                length++;
            }
        }

        return length;
    }
}
