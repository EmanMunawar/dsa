public class LnkedListCycleOptimal {
    static class Node{
        int data;
        Node next;
        Node(int data){     // constructor
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(7);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(4);
        head.next.next.next.next.next = head.next;
        System.out.println("Cycle:" + hasCycle(head));
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity= O(n)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static boolean hasCycle(Node head){
        Node slow = head;
        Node fast = head;
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
