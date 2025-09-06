package LinkedList;

public class AddTwoNumbers {

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Function to add two numbers
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);  // dummy node
        ListNode curr = temp;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        return temp.next;
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
        AddTwoNumbers solution = new AddTwoNumbers();

        // Number 342 represented as 2 -> 4 -> 3
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));

        // Number 465 represented as 5 -> 6 -> 4
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = solution.addTwoNumbers(l1, l2);

        // Output should represent 807: 7 -> 0 -> 8
        printList(result);
    }
}
