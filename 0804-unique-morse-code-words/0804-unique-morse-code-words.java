class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] code={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(String s:words){
            StringBuilder sb=new StringBuilder();
            for(char c:s.toCharArray()){
                sb.append(code[c-'a']);
            }
            String temp=sb.toString();
            set.add(temp);
        }
        return set.size();
    }
}