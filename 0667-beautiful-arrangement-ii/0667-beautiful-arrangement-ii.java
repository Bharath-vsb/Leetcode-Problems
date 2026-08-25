class Solution {
    public int[] constructArray(int n, int k) {
        int[] ans=new int[n];
        int low=1, high=k+1;
        int ind=0;
        while(low<=high){
            if(ind%2==0){
                ans[ind++]=low++;
            }
            else{
                ans[ind++]=high--;
            }
        }
        for(int i=k+2;i<=n;i++){
             ans[ind++]=i;
        }
        return ans;
    }
}