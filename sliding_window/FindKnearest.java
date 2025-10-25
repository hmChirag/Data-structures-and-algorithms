
/*
 * 658. Find K Closest Elements
Solved
Medium
Topics
premium lock icon
Companies
Given a sorted integer array arr, two integers k and x, return the k closest integers to x in the array. The result should also be sorted in ascending order.

An integer a is closer to x than an integer b if:

|a - x| < |b - x|, or
|a - x| == |b - x| and a < b
 

Example 1:

Input: arr = [1,2,3,4,5], k = 4, x = 3

Output: [1,2,3,4]

Example 2:

Input: arr = [1,1,2,3,4,5], k = 4, x = -1

Output: [1,1,2,3]

 

Constraints:

1 <= k <= arr.length
1 <= arr.length <= 104
arr is sorted in ascending order.
-104 <= arr[i], x <= 104
 */





import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindKnearest {


    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int i=findFloor(arr,x);
        int j=i+1;
        List<Integer> list =new ArrayList<>();
        while(k>0 && i>=0 && j<arr.length){
            if(Math.abs(x-arr[i])<=Math.abs(x-arr[j])){
                list.add(arr[i--]);
            }
            else{
                list.add(arr[j++]);
            }
            k--;
        }
        while (k > 0 && i >= 0) {
            list.add(arr[i--]);
            k--;
        }

        while (k > 0 && j < arr.length) {
            list.add(arr[j++]);
            k--;
        }
        Collections.sort(list);
        return list;
    }

    private int findFloor(int[] arr,int x){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==x) return mid;
            else if(arr[mid]<x){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        
    }
}
