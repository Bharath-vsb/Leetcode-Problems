class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int freq[]=new int[1001];
        for(int x:nums1){
            freq[x]++;
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int n:nums2){
            if(freq[n]!=0){
                list.add(n);
                freq[n]--;
            }
        }
        int res[]=new int[list.size()];
        int i=0;
        for(Integer x:list){
            res[i++]=x;
        }
        return res;
    }
}