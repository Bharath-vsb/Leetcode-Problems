class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> res=new ArrayList<>();
        int n=words.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(words[j].indexOf(words[i])!=-1 && i!=j){
                    if(!res.contains(words[i]))res.add(words[i]);
                }
            }
        }
        return res;
    }
}