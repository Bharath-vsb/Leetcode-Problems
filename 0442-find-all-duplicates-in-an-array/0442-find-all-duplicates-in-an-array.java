class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int freq[]=new int[nums.length+1];
        for(int x:nums){
            freq[x]++;
        }
        for(int i=1;i<=nums.length;i++){
            if(freq[i]>1){
                res.add(i);
            }
        }
        return res;
    }
}