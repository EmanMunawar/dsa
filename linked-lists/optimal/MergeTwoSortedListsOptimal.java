public class MergeTwoSortedListsOptimal {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args){
        Node head1= new Node(1);
        head1.next = new Node(2);
        head1.next.next= new Node(3);
        head1.next.next.next = new Node(5);

        Node head2= new Node(4);
        head2.next = new Node(7);
        head2.next.next= new Node(8);
        head2.next.next.next = new Node(0);

        System.out.println("List 1 is:");
        printList(head1);
        System.out.println("List 2 is:");
        printList(head2);
        Node merge = mergeLists(head1,head2);
        System.out.println("Merged Lists:");
        printList(merge);
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity= O(n+m)");
        System.out.println("Space Complexity = O(1)");
        System.out.println("===============================");
    }
    public static void printList(Node head){ // function to print list
        while(head != null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
    public static Node mergeLists(Node head1,Node head2){
        Node temp = new Node(-1);
        Node current = temp;
        while(head1 != null && head2 != null){
            if (head1.data <= head2.data){
                current.next = head1;
                head1 = head1.next;
            } else{
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }
        if(head1 != null){
            current.next = head1;
        } else {
            current.next = head2;
        }
        return temp.next;
    }

}
