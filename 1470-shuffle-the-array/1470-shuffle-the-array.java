class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int i=0;
        //int j=n;
        int ind=0;
        while(ind<nums.length){
            ans[ind]=nums[i];
            ind++;
            ans[ind]=nums[i+n];
            ind++;
            i++;
            
        }
        return ans;
    }
}