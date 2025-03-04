package backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class conbinationTwo {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        findcombinations(0,candidates,target,result,new ArrayList<>());
        return result;
    }

    
    private void findcombinations(int idx,int[] candidates,int target,List<List<Integer>> result,List<Integer> ds){
        
        if(target == 0){
            result.add(new ArrayList<>(ds));
            return;
        }
            
        
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]){
                continue; //skip duplicate combinations
            }
            if(candidates[i] >target){
                break;
            }
            
            ds.add(candidates[i]);
            findcombinations(i+1,candidates,target-candidates[i],result,ds);
            ds.remove(ds.size()-1);    
        }
    }
    
    
    public static void main(String[] args) {
        
    }
}
