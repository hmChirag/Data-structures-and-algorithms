
/*
 * given a string and we need to find out the all possible subsets of that perticular string given 
 * 
 * 
 * imagine that the input for the given program is abc and then u would get the output for this code as 
 * acb
 * ab
 * ac
 * a
 * bc
 * b
 * c
 * null
 */



package backtracking;
public class subset {

    public static void subset(String str,int i,String ans){
        
        //base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        //recursion

        //case 1 is the letter chooses to be a part of the subset
        subset(str, i+1, ans+str.charAt(i));
        
        //case 2 if the letter chooses not to be a part of the subset
        subset(str, i+1, ans);

    }
    public static void main(String[] args) {
        
    }
}
