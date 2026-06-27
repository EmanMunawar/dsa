import java.util.ArrayList;

public class LinkedListCycleBrute {
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
        System.out.println("Time Complexity= O(n^2)");
        System.out.println("Space Complexity = O(n)");
        System.out.println("===============================");
    }
    public static boolean hasCycle(Node head){
        ArrayList<Node> visited = new ArrayList<>();
        Node current = head;
        while (current!=null){
            if (visited.contains(current)){
                return true;
            }
            visited.add(current);
            current = current.next;
        }
        return false;
    }
}
