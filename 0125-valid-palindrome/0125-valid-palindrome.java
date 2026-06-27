class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder();
        StringBuilder sb2=new StringBuilder();

        for(char i:s.toCharArray()){
            int temp=(int)i;
            if(temp>='a' && temp<='z'|| temp >= '0' && temp<='9'){
                
                sb.append(i);
            }
        }

        sb2.append(sb);
        sb.reverse();

        if(sb.toString().equals(sb2.toString())){
            return true;
        }
        return false;
    }
}