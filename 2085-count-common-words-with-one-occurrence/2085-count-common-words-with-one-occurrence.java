class Solution {
    public int countWords(String[] words1, String[] words2) {
        HashMap<String,Integer> map=new HashMap<>();
        for(String i:words1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        HashMap<String,Integer> map1=new HashMap<>();
        for(String i:words2){
            map1.put(i,map1.getOrDefault(i,0)+1);
        }

        int count=0;
        for(String i:words1){
            if(map.get(i)==1 && map1.getOrDefault(i,0)==1) count++;
        }
        return count;

    }
}