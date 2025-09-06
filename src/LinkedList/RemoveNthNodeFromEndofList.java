package LinkedList;

public class RemoveNthNodeFromEndofList {

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    static class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            ListNode dummy = new ListNode(-1);
            dummy.next = head;

            ListNode fast = dummy;
            ListNode slow = dummy;

            // Move fast pointer n steps ahead
            for (int i = 0; i < n; i++) {
                fast = fast.next;
            }

            // Move both fast and slow until fast reaches the end
            while (fast.next != null) {
                fast = fast.next;
                slow = slow.next;
            }

            // Remove nth node
            slow.next = slow.next.next;

            return dummy.next;
        }
    }

    // Helper method to print linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1,
                new ListNode(2,
                        new ListNode(3,
                                new ListNode(4,
                                        new ListNode(5)))));

        System.out.print("Original List: ");
        printList(head);

        // Remove 2nd node from end
        head = solution.removeNthFromEnd(head, 2);

        System.out.print("After Removing 2nd From End: ");
        printList(head);
    }
}
