import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        ListNode head = new ListNode();
        head.val = 1;

        ListNode temp = new ListNode();
        temp.val = 2;
        head.next = temp;

        ListNode temp1 = new ListNode();
        temp1.val = 2;
        temp.next = temp1;

        ListNode temp2 = new ListNode();
        temp2.val = 2;
        temp1.next = temp2;

        System.out.println(isPalindrome(head));
    }

    public static boolean isPalindrome(ListNode head) {
        if (head.next == null) {
            return true;
        }

        Stack<ListNode> myStack = new Stack<>();
        ListNode temp = head;
        while (temp != null) {
            myStack.add(temp);
            temp = temp.next;
        }

        // reset temp
        temp = head;

        while (!myStack.empty()) {
            ListNode myNode = myStack.pop();
            if (myNode.val != temp.val) {
                return false;
            }
        }

        return true;
    }
}


 public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
