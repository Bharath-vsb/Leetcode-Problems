class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s1=new Stack<>();
        Stack<Character> s2=new Stack<>();

        for(char c:s.toCharArray()){
            if(s1.isEmpty() && c=='#') continue;
            if(c=='#') s1.pop();
            else{
                s1.push(c);
            }
        }
        for(char c:t.toCharArray()){
            if(s2.isEmpty() && c=='#') continue;
            if(c=='#') s2.pop();
            else{
                s2.push(c);
            }
        }
        return s1.equals(s2);
    }
}