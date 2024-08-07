/*42. Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105
*/



//solution
//                                                          Arrays

package arrays;
public class TrappingRainwater {

    public static int TrappingRainwater(int height[]){
        int n=height.length;
        int leftMax[]=new int[n];
//calculating the leftmax array
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
//calculatig the right max array
        int RIGHTMax[]=new int[n];
         RIGHTMax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            RIGHTMax[i]=Math.max(height[i],RIGHTMax[i+1]);
        }

        int TrappedWater=0;
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i], RIGHTMax[i]);
            TrappedWater=TrappedWater+(waterLevel - height[i]);
        }
        return TrappedWater;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("volume of water stored in between the blocks is "+ TrappingRainwater(height));
    }
}
