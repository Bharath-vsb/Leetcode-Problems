class Solution {
    public String getPermutation(int n, int k) {
        int fact=1;
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=n;i++){
            fact*=i;
            list.add(i);
        }
        StringBuilder sb=new StringBuilder();
        k--;
        for(int i=0;i<n;i++){
            fact/=(n-i);
            int index=(k/fact);
            sb.append(list.remove(index));
            k%=fact;
        }
        return sb.toString();
    }
}