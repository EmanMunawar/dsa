// heaps
===== Problems List =====

Problem               Difficulty          LeetCode
LastStoneWeight         Easy            https://leetcode.com/problems/last-stone-weight/submissions/2046878409/
KthLargestElement       Medium          https://leetcode.com/problems/kth-largest-element-in-an-array/
TopKFrequentElement     Medium          https://leetcode.com/problems/top-k-frequent-elements/submissions/2047364600/


P1(LastStoneWeight):
Brute Force: Repeatedly find two heaviest stones, then smash them together and add the remaining weight back until one stone remains
Optimal: Use a MaxHeap to efficiently select the heaviest 2 stones. After smashing insert remaining weight back into heap until one or 0 stone remains.

P2(KthLargestElement):
Brute Force: Sort the entire array and return element at index "length-k".
Optimal: Use a minHeap of size k, traverse the whole array keeping only largest k elements in heap. the root of heap is kth Largest Element. 

P3(TopKFrequentElement):
Brute Force: Count the frequency of each element using HashMap. Ppeatedly find element with highest frequency add it to answer and remove it from map until elements are selected.
Optimal: Count the frequency of each element using a HashMap. Store elements in a MinHeap based on frequency while maintaining only k elements. the remaining elements in heap are k frequent elements.


===== Complexity Table =====

Problem            Brute               Optimal

                  TC        SC             TC           SC
P1             O(n^2)     O(n)         O(nlogn)       O(n)
P2             O(nlogn)   O(1)         O(nlogk)       O(k)
P3             O(n*n)     O(n)         O(nlogk)       O(n)

===== How to Run =====
Compile java file.............