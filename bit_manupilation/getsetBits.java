package bit_manupilation;

public class getsetBits {

    public static boolean getKthBit(int n, int k){
        int mask=1<<k;
        int ans=n & mask;
        if (ans==0) {
            return false;
        }
        return true;    
    }
    public static boolean SetKthBit(int n, int k){
        int mask=1<<k;
        int ans=n | mask;
        if (ans==0) {
            return false;
        }
        return true;    
    }
    public static int toggleKthBit(int n, int k){
        int mask=1<<k;
        int ans=n ^ mask;
        return ans;  
    }
    public static int unsetKthBit(int n, int k){
        int mask=1<<k;
        int ultaMask=~(mask);
        int ans=n & ultaMask;
        return ans;  
    }


    public static void main(String[] args) {
        // System.out.println(getKthBit(7,2));
        System.out.println(SetKthBit(9, 3));
    }
    
}
