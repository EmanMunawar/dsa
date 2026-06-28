// binary trees
===== Problems List =====

Problem                        Difficulty          LeetCode
InvertBinaryTree                  Easy            https://leetcode.com/problems/invert-binary-tree/submissions/2048341695/
MaxDepthOfBinaryTree              Easy            https://leetcode.com/problems/maximum-depth-of-binary-tree/submissions/2048347094/
KthSmallestElementInBST          Medium           https://leetcode.com/problems/kth-smallest-element-in-a-bst/submissions/2048353404/
DiameterOfBinaryTree              Easy            https://leetcode.com/problems/diameter-of-binary-tree/submissions/2048384433/
ValidateBST                      Medium           https://leetcode.com/problems/validate-binary-search-tree/submissions/2048425425/
ImplementTrie                    Medium           https://leetcode.com/problems/implement-trie-prefix-tree/submissions/2048460031/
MinAbsoluteDifferenceInBST        Easy            https://leetcode.com/problems/minimum-absolute-difference-in-bst/submissions/2048481249/


P1(InvertBinaryTree):
Brute Force: Use BFS to swap left and right child nodes.
Optimal: Use Recursive DFS to swap child nodes.

P2(MaxDepthOfBinaryTree):
Brute Force: Use BFS and count tree levels.
Optimal: USe Recursive DFS to calculate maximum depth

P3(KthSmallestElementInBST):
Brute Force: Store inorder traversal in a list and return(k-1)th element.
Optimal: Perform inorder traversal and stop when kth element is found.

P4(DiameterOfBinaryTree ): 
Brute Force: Calculate left and right subtree heights for every node.
Optimal: Find height and Diameter together using a single DFS traversal.

P5(ValidateBST):
Brute Force: Store inorder traversal and verify that it is strictly increasing.
Optimal: Validate Recursively using min and max value limits.

P6(ImplementTrie):
Brute Force: Store words in a list and perform linear search 
Optimal: Implement a trie using a trieNode object.

P7(MinAbsoluteDifferenceInBST):
Brute Force: Store inorder traversal and compare every pair.
Optimal: Compare adjacent nodes during inorder traversal using a previous pointer.

===== Complexity Table =====

Problem            Brute               Optimal

                TC          SC           TC         SC
P1             O(n)       O(n)         O(n)       O(h)
P2             O(n)       O(n)         O(n)       O(h)
P3             O(n)       O(n)         O(k)       O(h)
P4             O(n^2)     O(n^2)       O(n)       O(h)
P5             O(n)       O(n)         O(n)       O(h)
P6             O(n*l)     O(n*l)       O(l)       O(l)
P7             O(n^2)     O(n)         O(n)       O(h)

=== How to Run ===
Compile java file