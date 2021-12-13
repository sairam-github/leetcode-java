public class Main {
    public static void main(String[] args) {
        // String str = "   fly me   to   the moon  ";
        String str = "Hellow World";
        System.out.println(lengthOfLastWord(str));
    }

    public static int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        boolean trigger = false;
        int triggerIndex = 0;

        while (index != 0) {
            if (s.charAt(index) == ' ' && trigger) {
                if (trigger) {
                    break;
                }

                triggerIndex++;
            }

            if (s.charAt(index) != ' ') {
                trigger = true;
            }

            index--;
        }

        return s.length() - triggerIndex - index + 1;
    }
}
