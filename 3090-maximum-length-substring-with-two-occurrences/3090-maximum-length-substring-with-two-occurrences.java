class Solution {
    public int maximumLengthSubstring(String s) {
        int[] freq=new int[26];
        char[] ch=s.toCharArray();
        int max=0;
        int left=0;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            freq[c-'a']++;
            while(freq[c-'a']>2){
                freq[ch[left]-'a']--;
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}