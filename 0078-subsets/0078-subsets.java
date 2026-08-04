class Solution {

    public static void backtracking(List<List<Integer>> res,List<Integer> temp, int idx,int[] nums){
        if(idx==nums.length){
            res.add(new ArrayList(temp));
            return;
        }
        temp.add(nums[idx]);
        backtracking(res,temp,idx+1,nums);
        temp.remove(temp.size()-1);
        backtracking(res,temp,idx+1,nums);
    }


    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtracking(res,temp,0,nums);
        return res;
    }
}