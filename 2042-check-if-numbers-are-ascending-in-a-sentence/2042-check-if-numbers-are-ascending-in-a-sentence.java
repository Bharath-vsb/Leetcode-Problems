class Solution {
    public boolean areNumbersAscending(String s) {
        int prev=0;
        String[] words=s.split(" ");
        for(String st:words){
            if(Character.isDigit(st.charAt(0))){
                int n=Integer.parseInt(st);
                if(n<=prev) return false;
                prev=n;
            }

        }
        return true;
    }
}