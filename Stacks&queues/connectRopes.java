/*
 * Connect n ropes with minimum cost Given are N ropes of different lengths,the task is to 
 * connect these ropes in to one rope with minimum cost, 
 * such that the cost to connect two ropes is equal to the sum of their lengths.
 * Sample Input 1: N = 4, arr = [4 3 2 6]Sample Output 1: 29Sample Input 2: N = 2, arr = [1 2 3]Sample Output 2: 9
 */

import java.util.PriorityQueue;
import java.util.Queue;

public class connectRopes {

    public static int ropes(int arr[],int n){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        int res=0;
        while (pq.size()>1) {
            int first=pq.poll();
            int second=pq.poll();
            int sum=first+second;
            res+=sum;
            pq.add(sum);    

        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={4,3,2,6};
        int size=arr.length;
        System.out.println("total cost is "+ropes(arr,size));
    }   
}
