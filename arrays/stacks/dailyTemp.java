/*
 * 739. Daily Temperatures
Solved
Medium
Topics
Companies
Hint
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
 */

package arrays.stacks;

import java.util.Stack;

public class dailyTemp {
    
    //brute force
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer=new int[temperatures.length];
        for(int i=0;i<answer.length-1;i++){
            for(int j=i+1;j<answer.length;j++){
                if(temperatures[i]<temperatures[j]){
                    answer[i]=j-i;
                    break;
                }
            }
        }
        answer[temperatures.length-1]=0;
        return answer;
    }


    //optimised
    public int[] dailyTemperatures(int[] temperatures) {
        int[] answer=new int[temperatures.length];
        Stack<Integer> s=new Stack<>();
        int n=temperatures.length-1;
        for(int i=n;i>=0;i--){
            while(!s.isEmpty() && temperatures[s.peek()] <= temperatures[i]){
                s.pop();
            }
            if(!s.isEmpty()){
                answer[i]=s.peek()-i;
            }else{
                answer[i]=0;
            }
            s.push(i);
        }

        return answer;
    }
    
    public static void main(String[] args) {
        
    }
}
