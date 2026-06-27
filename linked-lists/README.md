// Linked Lists
===== Problems List =====

Problem               Difficulty          LeetCode
LinkedListCycle         Easy            https://leetcode.com/problems/linked-list-cycle/submissions/2047411621/
MergeTwoSortedLists     Easy            https://leetcode.com/problems/merge-two-sorted-lists/submissions/2047502491/
RemoveDuplicates        Easy            https://leetcode.com/problems/remove-duplicates-from-sorted-list/submissions/2047600465/

P1(LinkedListCycle):
Brute Force: Traverse linked list.store each visited node in Arraylist.if a node is encountered again a cycle exists.
Optimal: use slow pointer and fast pointer. move the slow pointer one step and fast pointer 2 steps. if both pointers meet linkedlist has cycle.

P2(MergeTwoSortedLists):
Brute Force: Store all elements from both linkedlists to an arraylist. Store arraylist.create a new linkedlist using the sorted values.
Optimal: Compare nodes of both linked lists. insert smaller node into merged list. continue until one list becomes empty. Attach remaining nodes of other list.

P3(RemoveDuplicates):
Brute Force: Traverse linkedlist. store only unique values in arraylist.create a new linkedlist using those unique values.
Optimal: Since list is already sorted, compare each node with its next node. If both values are equal skip the duplicate node otherwise move to next node. Continue until end of list.


===== Complexity Table =====

Problem            Brute               Optimal

                  TC        SC             TC           SC
P1             O(n^2)       O(n)         O(n)          O(1)
P2         O((n+m)log(n+m)) O(n+m)       O(n+m)        O(1)
P3             O(n*n)       O(n)         O(n)          O(1)

===== How to Run =====
Compile java file.............