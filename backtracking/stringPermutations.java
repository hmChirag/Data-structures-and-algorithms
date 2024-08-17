/*
 * the possible permutations which can be drawn from the string given as a input.
 * if input string is abc then the output string is
 * abc
 * acb
 * bac
 * bca
 * cab
 * cba
 */


package backtracking;

public class stringPermutations {
    public static void permutations(String str,String ans){
        //base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            String newStr=str.substring(0, i)+str.substring(i+1, str.length()-1);
            permutations(newStr, ans+curr);
        }
    }
    public static void main(String[] args) {
        
    }
}
