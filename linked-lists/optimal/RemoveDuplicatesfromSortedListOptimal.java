public class RemoveDuplicatesfromSortedListOptimal {
    static class ListNode{
        int val;
        ListNode next;
        ListNode (int val){
            this.val = val;
        }
    }
    public static void main (String[] args){
        ListNode head =new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        System.out.println("Original List:");
        printList(head);
        head = deleteDuplicates(head);
        System.out.println("After Removing Duplicates:");
        printList(head);
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity= O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");

    }
    public static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head){
        ListNode current = head;
        while (current != null && current.next !=null){
            if (current.val == current.next.val){
                current.next = current.next.next;
            } else {
                current=current.next;
            }
        }
        return head;

}}
