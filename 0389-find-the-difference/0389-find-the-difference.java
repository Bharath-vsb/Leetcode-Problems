class Solution {
    public char findTheDifference(String s, String t) {
        int[] freq=new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:t.toCharArray()){
            freq[c-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=00){
                return (char) (i+'a');
            }
        }
        return t.charAt(t.length()-1);
    }
}