import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesfromSortedListBrute {
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
        System.out.println("Time Complexity= O(n^2)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");

    }
    public static void printList(ListNode head){
        while(head != null){
            System.out.println(head.val + " ");
            head = head.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head){
        if (head == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(head != null){
            if (!list.contains(head.val)){
                list.add(head.val);
            }
            head = head.next;
        }
        ListNode newHead = new ListNode(list.get(0));
        ListNode current = newHead;
        for (int i =1;i<list.size();i++){
            current.next = new ListNode(list.get(i));
            current = current.next;
        }
        return newHead;
    }
}
