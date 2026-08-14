class Solution {
    public int maximumLengthSubstring(String s) {
        char ch[]=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0;
        int max=0;
        for(int right=0;right<ch.length;right++){
            map.put(ch[right],map.getOrDefault(ch[right],0)+1);
            while(map.get(ch[right])>2){
                map.put(ch[left],map.getOrDefault(ch[left],0)-1);
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}