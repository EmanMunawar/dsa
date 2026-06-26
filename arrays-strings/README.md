// arrays-strings
===== Problems List =====

Problem                      Difficulty          LeetCode
FindNumberClosestToZero         Easy            https://leetcode.com/problems/find-closest-number-to-zero/submissions/2046356394/
IsSubsequence                   Easy            https://leetcode.com/problems/is-subsequence/submissions/2046551865/
SummaryRanges                   Easy            https://leetcode.com/problems/summary-ranges/submissions/2046643502/ 
LongestCommonPrefix             Easy            https://leetcode.com/problems/longest-common-prefix/submissions/2046734416/
BestTimeToBuyAndSellStock       Easy            https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/2046801852/

P1(FindNumberClosestToZero):
Brute Force: Traverse the array and compare each element with current closest number
Optimal: By keeping closest number to 0 traverse the whole array once

P2(IsSubsequence):
Brute Force: Use nested loops to search every character of one string to the other
Optimal: Use 2 pointers to compare both strings in one traversal

P3(SummaryRanges):
Brute Force: Check consecutive numbers by comparing elements
Optimal: Traverse array once and make range where sequence breaks

P4(LongestCommonPrefix):
Brute Force: Compare each character of 1st string with all other
Optimal: Start with 1st string as prefix and keep reducing until all common prefixes match

P5(BestTimeToBuyAndSellStock):
Brute Force: Compare each buying day with selling day
Optimal: While traversing the array once keep track of minimum buying price

===== Complexity Table =====

Problem            Brute               Optimal

                TC      SC           TC       SC
P1             O(n)    O(1)         O(n)     O(1)
P2             O(n*m)  O(1)         O(n+m)   O(1)
P3             O(n*n)  O(n)         O(n)     O(n)
P4             O(n*m)  O(1)         O(n*m)   O(1)
P5             O(n*n)  O(1)         O(n)     O(1)
