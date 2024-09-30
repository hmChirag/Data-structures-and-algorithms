/*
 * 347. Top K Frequent Elements
Solved
Medium
Topics
Companies
Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

 

Example 1:

Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]
Example 2:

Input: nums = [1], k = 1
Output: [1]
 

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104
k is in the range [1, the number of unique elements in the array].
It is guaranteed that the answer is unique.
 

Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */


package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topKelements {
    public int[] topKFrequent(int[] nums, int k) {
        // Step 1: Count the frequency of each number using a HashMap
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Create a priority queue (min-heap) to store the top k elements
        PriorityQueue<Integer> heap = new PriorityQueue<>((n1, n2) -> frequencyMap.get(n1) - frequencyMap.get(n2));

        // Step 3: Iterate through the frequency map and add the elements to the heap
        for (int num : frequencyMap.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Remove the least frequent element if heap exceeds size k
            }
        }

        // Step 4: Create an array to store the top k frequent elements
        int[] topK = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            topK[i] = heap.poll(); // Extract elements from the heap
        }

        return topK;
    }
    public static void main(String[] args) {
        
    }
}
