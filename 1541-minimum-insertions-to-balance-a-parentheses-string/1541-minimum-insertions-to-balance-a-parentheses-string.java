class Solution {
    public int minInsertions(String s) {
        char[] ch=s.toCharArray();
        Stack<Character> st=new Stack<>();
        int count=0;
        for(int i=0;i<ch.length;i++){
            char c=ch[i];
            if(c=='('){
                st.push(c);
            }
            else{
                if(i+1<ch.length && ch[i+1]==')'){
                    i++;
                }
                else{
                    count++;
                }
                if(st.isEmpty()){
                    count++;
                }
                else{
                    st.pop();
                }
            }
        }
        return count+(st.size()*2);
    }
}