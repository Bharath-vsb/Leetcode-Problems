class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
        
        System.arraycopy(num2,0,num1,m,n);
        Arrays.sort(num1);
  
    }
}