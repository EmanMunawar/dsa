public class LnkedListCycleOptimal {
    static class ListNode{
        int data;
        ListNode next;
        ListNode(int data){     // constructor
            this.data = data;
        }
    }
    public static void main(String[] args){
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(7);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = head.next;
        System.out.println("Cycle:" + hasCycle(head));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity= O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static boolean hasCycle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
}
