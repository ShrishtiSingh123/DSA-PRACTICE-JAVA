package Stack;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class RemoveNode {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        Stack<ListNode> st = new Stack<>();

        ListNode temp = head;

        while (temp != null) {
            st.push(temp);
            temp = temp.next;
        }

        // Remove n nodes from stack
        for (int i = 0; i < n; i++) {
            st.pop();
        }

        // Removing head
        if (st.isEmpty()) {
            return head.next;
        }

        // Node before the node to delete
        ListNode prev = st.peek();

        // Delete nth node from end
        prev.next = prev.next.next;

        return head;
    }
}