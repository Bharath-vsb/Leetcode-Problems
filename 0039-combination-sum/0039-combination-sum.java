class Solution {

    public static void backtracking(List<List<Integer>> res,List<Integer> temp,int[] cand,int tar,int start){
        if(tar<0) return;
        else if(tar==0) res.add(new ArrayList<>(temp));
        else{
            for(int i=start;i<cand.length;i++){
                temp.add(cand[i]);
                backtracking(res,temp,cand,tar-cand[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res=new ArrayList<>();
        backtracking(res,new ArrayList<Integer>(),candidates,target,0);
        return res;
    }
}