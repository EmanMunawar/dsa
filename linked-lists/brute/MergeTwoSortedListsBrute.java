import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsBrute {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val = val;
        }
    }
    public static void main(String[] args){
        ListNode list1= new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next= new ListNode(3);
        list1.next.next.next = new ListNode(5);

        ListNode list2= new ListNode(4);
        list2.next = new ListNode(7);
        list2.next.next= new ListNode(8);
        list2.next.next.next = new ListNode(0);

        System.out.println("List 1 is:");
        printList(list1);
        System.out.println("List 2 is:");
        printList(list2);
        ListNode merge = mergeTwoLists(list1,list2);
        System.out.println("Merged Lists:");
        printList(merge);
        System.out.println();
        System.out.println("=== Time & Space Complexity ===");
        System.out.println("Time Complexity= O((n+m) log (n+m))");
        System.out.println("Space Complexity = O(n+m)");
        System.out.println("===============================");
    }
    public static void printList(ListNode list){ // function to print list
        while(list != null){
            System.out.println(list.val + " ");
            list = list.next;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ArrayList<Integer> list = new ArrayList<>();
        while (list1 != null){
            list.add(list1.val);
            list1= list1.next;
        }
        while (list2 != null){
            list.add(list2.val);
            list2= list2.next;
        }
        if(list.isEmpty()){
            return null;
        }
        Collections.sort(list);
        ListNode head = new ListNode(list.get(0)) ;
        ListNode current = head;

        for(int i =1;i<list.size();i++){
            current.next= new ListNode(list.get(i));
            current = current.next;
        }
        return head;
    }


}
