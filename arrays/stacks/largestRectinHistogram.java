/*
 * 84. Largest Rectangle in Histogram
Hard
Topics
Companies
Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.

 

Example 1:


Input: heights = [2,1,5,6,2,3]
Output: 10
Explanation: The above is a histogram where width of each bar is 1.
The largest rectangle is shown in the red area, which has an area = 10 units.
Example 2:


Input: heights = [2,4]
Output: 4
 

Constraints:

1 <= heights.length <= 105
0 <= heights[i] <= 104
 */

package arrays.stacks;

import java.util.Stack;

public class largestRectinHistogram {
    //solution 1
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        int[] nsl=new int[n];
        int[] nsr=new int[n];
        //next smaller right
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!s.isEmpty() && heights[s.peek()]>= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //next smaller left
        s=new Stack<>();
        for(int i=0;i<n;i++){
            while(!s.isEmpty() && heights[s.peek()]>= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }

        for(int i=0;i<n;i++){
            int j=nsr[i];
            int k=nsl[i];
            int area=(j-k-1) * heights[i];
            maxArea=Math.max(maxArea,area);
        }
        return maxArea;

    }


    //solution 2
    public int largestRectangleArea(int[] heights) {
        int len = heights.length;
        int[] l_right = new int[len];
        int[] l_left = new int[len];
        l_left[0] = -1;
        l_right[len - 1] = len;

        // Calculate the left boundary (less than current height)
        for (int i = 1; i < len; i++) {
            int ind = i - 1;
            while (ind >= 0 && heights[ind] >= heights[i]) {
                ind = l_left[ind];
            }
            l_left[i] = ind;
        }

        // Calculate the right boundary (less than current height)
        for (int i = len - 2; i >= 0; i--) {
            int ind = i + 1;
            while (ind < len && heights[ind] >= heights[i]) {
                ind = l_right[ind];
            }
            l_right[i] = ind;
        }

        // Calculate the maximum area
        int ans = 0;
        for (int i = 0; i < len; i++) {
            int width = l_right[i] - l_left[i] - 1;
            int area = width * heights[i];
            ans = Math.max(ans, area);
        }

        return ans;
    }
    public static void main(String[] args) {
        
    }
}
