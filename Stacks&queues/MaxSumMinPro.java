import java.util.Stack;

public class MaxSumMinPro {
    public int maxSumMinProduct(int[] nums) {
        long res=0;
        long mod=1000000007;
        int n=nums.length;
        long prefix[]=new long[n+1];

        //calculating the prefix sum array
        for(int i=1;i<=n;i++){
            prefix[i]=prefix[i-1]+nums[i-1];
        }

        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        int left[]=new int[n];
        int right[]=new int[n];

        //caculating the smallest element on the left of each element
        for(int i=0;i<n;i++){
            while(!stack1.isEmpty() && nums[i]<=nums[stack1.peek()]){
                stack1.pop();
            }
            if(stack1.isEmpty()){
                left[i]=-1;
            }else{
                left[i]=stack1.peek();
            }
            stack1.push(i);
        }
        //calculating the smallest element on the right of each element
        for(int i=n-1;i>=0;i--){
            while(!stack2.isEmpty() && nums[i]<=nums[stack2.peek()]){
                stack2.pop();
            }
            if(stack2.isEmpty()){
                right[i]=n;
            }else{
                right[i]=stack2.peek();
            }
            stack2.push(i);
        }
        //calculating the max sum min product for each element in the array
        for(int i=0;i<n;i++){
            int l=left[i];
            int r=right[i];
            long sum=prefix[r]-prefix[l+1];
            long prod=sum * nums[i];
            res=Math.max(res,prod);
        }
        return (int)(res % mod);
    }
    
    public static void main(String[] args) {
        
    }
}
