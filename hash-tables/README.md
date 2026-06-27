// hash-tables
===== Problems List =====

Problem                      Difficulty          LeetCode
ContainsDuplicates              Easy            https://leetcode.com/problems/contains-duplicate/submissions/2047823685/
ValidAnagram                    Easy            https://leetcode.com/problems/valid-anagram/submissions/2047847781/
TwoSum                          Easy            https://leetcode.com/problems/two-sum/submissions/2047897969/
GroupAnagrams                   Medium          https://leetcode.com/problems/group-anagrams/submissions/2047912348/
MaxNumberOfBalloons             Easy            https://leetcode.com/problems/maximum-number-of-balloons/submissions/20479

P1(ContainsDuplicates):
Brute Force: Compare every pair of Elements
Optimal: Use a Hashset to detect duplicates

P2(ValidAnagram): 
Brute Force: Sort both strings and compare them
Optimal: Use a HashMap to compare character frequencies

P3(TwoSum):
Brute Force: Check every possible pair
Optimal: Use a HashMap to store numbers and their indexes

P4(GroupAnagrams):
Brute Force: Compare sorted strings with every existing group
Optimal: Use a HashMap with sorted strings as key

P5(MaxNumberOfBalloons):
Brute Force: Count characters and repeatedly form balloon
Optimal: Count character frequency at once and calculate minimum required frequency

===== Complexity Table =====

Problem            Brute               Optimal

                TC          SC           TC         SC
P1             O(n^2)       O(1)         O(n)       O(n)
P2             O(nlogn)     O(n)         O(n)       O(n)
P3             O(n*n)       O(1)         O(n)       O(n)
P4             O(n^2*klogk) O(n)         O(n*klogk) O(n)
P5              O(n)        O(1)         O(n)       O(1)

=== How to Run ===
Compile java file