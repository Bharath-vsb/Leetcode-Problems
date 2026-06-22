class Solution {

    public static void backtrack(int[] nums,int start, List<List<Integer>> res, List<Integer>temp)
    {
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,i+1,res,temp);
            temp.remove(temp.size()-1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res =new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backtrack(nums,0,res,temp);
        return res;
    }
}