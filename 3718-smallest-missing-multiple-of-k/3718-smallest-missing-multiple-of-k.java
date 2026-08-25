class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int i=1; ; i++){
            int mul=i*k;
            if(!set.contains(mul)){
                return mul;
            }
        }
    }
}