// Linked Lists
===== Problems List =====

Problem               Difficulty          LeetCode
ValidPalindrome          Easy            https://leetcode.com/problems/valid-palindrome/submissions/2047698050/
ReverseString            Easy            https://leetcode.com/problems/reverse-string/submissions/2047722099/
ContainerWithMostWater   Medium          https://leetcode.com/problems/container-with-most-water/submissions/2047744127/

P1(ValidPalindrome):
Brute Force: Clean the string,reverse it and compare both strings.
Optimal: Use two pointers from both ends while skipping non-alphanumeric characters.

P2(ReverseString):
Brute Force: Store the reversed characters in a new array and copy them back.
Optimal: Reverse the array in place using two pointers.

P3(ContainerWithMostWater):
Brute Force: Check every possible pair of lines and calculate area.
Optimal: Use two pointers and move the pointer with smaller height.


===== Complexity Table =====

Problem            Brute               Optimal

                  TC        SC             TC           SC
P1             O(n^2)       O(n)         O(n)          O(1)
P2              O(n)        O(n)         O(n)           O(1)
P3             O(n*n)       O(1)         O(n)          O(1)

===== How to Run =====
Compile java file.............