class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        getperms(nums,0,res);
        return res;
    }

    public static void getperms(int[] nums,int idx,List<List<Integer>> res){
        if(idx==nums.length){
            List<Integer> temp=new ArrayList<>();
            for(int num:nums){
                temp.add(num);
            }
            res.add(temp);
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);

            getperms(nums,idx+1,res);

            swap(nums,idx,i);
        }
    }

    public static void swap(int[] nums,int idx,int i){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}