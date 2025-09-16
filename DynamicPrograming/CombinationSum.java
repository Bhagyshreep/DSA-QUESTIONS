import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        dfs(candidates,target,0,new ArrayList<>(),res);
        return res;
    }
    void dfs(int[] nums,int target,int idx,List<Integer> path,List<List<Integer>> res){
        if(target==0){
            res.add(new ArrayList<>(path));
            return;
        }
        if(target<0)return;
        for(int i=idx;i<nums.length;i++){
            path.add(nums[i]);
            dfs(nums,target-nums[i],i,path,res);
            path.remove(path.size()-1);
                   
        }

                    
    }
}
