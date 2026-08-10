class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        int k=0;
        for(Integer x:map.keySet()){
            if(map.get(x)==1){
                res[k]=x;
                k++;
            }
        }
        return res;
    }
}