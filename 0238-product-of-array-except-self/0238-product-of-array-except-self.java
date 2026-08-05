class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        for(int i:nums) prod*=i;
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0)
                ans[i]=(int)prod/nums[i];
            else{
                int m=1;
                for(int j=0;j<nums.length;j++){
                    
                    if(i!=j){
                        m*=nums[j];
                    }
                }
                ans[i]=m;
            }
        }
        return ans;
    }
}