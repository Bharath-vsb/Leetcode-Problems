class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> map=new HashMap<>();
        for(int i=0;i<s.length();i++){

            char m=s.charAt(i);
            char k=t.charAt(i);

            if(!map.containsKey(m)){
                if(!map.containsValue(k)){
                    map.put(m,k);
                }
                else{
                    return false;
                }
            }
            else{
                char mapped=map.get(m);
                if(mapped!=k){
                    return false;
                }
            }
        }
        return true;
    }
}