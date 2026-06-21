class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()) return "";

        int freq[]=new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int right=0;
        int left=0;
        int minlen=Integer.MAX_VALUE;
        int minst=0;
        int needed=t.length();
        while(right<s.length()){

            char r=s.charAt(right);
            if(freq[r]>0) needed--;
            freq[r]--;

            while(needed==0){
                if(right-left+1<minlen){
                    minlen=right-left+1;
                    minst=left;
                }

                char l=s.charAt(left);
                freq[l]++;
                if(freq[l]>0) needed++;
                
                left++;
            }
            right++;
            
        }
        if(minlen==Integer.MAX_VALUE) return "";
        return s.substring(minst,minst+minlen);
    }
}