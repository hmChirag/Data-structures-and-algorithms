/*
 * given an (2*n) board and tiles of size (2*1) count the number of ways to tile the given board using (2*1) tiles 
 * a tile can be either placed in vertical or horizotal direction  
 */

public class arrangeTsiles {

    public static int tailing(int n){
        //base case
        if(n==0 || n==1){
            return 1;
        }
        //for vertical placement of tails
        int fnm1=tailing(n-1);
        //for horizontal placement of tails
        int fnm2=tailing(n-2);

        int totaltails=fnm1+fnm2;
        return totaltails;
    }
    
    public static void main(String[] args) {
        System.out.println(tailing(3));
    }
}
