class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        backtracking(nums,res,list, 0);
        return res;
    }
    public void backtracking(int[] nums, List<List<Integer>> res, List<Integer> list,int idx){
        if(list.size()>1){
            res.add(new ArrayList<>(list));
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(!list.isEmpty() && nums[i]<list.get(list.size()-1)){
                continue;
            }
            if(set.contains(nums[i])){
                continue;
            }
            set.add(nums[i]);
            list.add(nums[i]);
            backtracking(nums,res,list,i+1);
            list.remove(list.size()-1);
        }
    }
}