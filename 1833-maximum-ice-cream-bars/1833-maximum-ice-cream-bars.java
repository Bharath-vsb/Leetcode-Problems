class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int max=0;
        for(int x:costs){
            if(max<x) max=x;
        }
        int[] freq=new int[max+1];
        for(int x:costs){
            freq[x]++;
        }
        int count=0;
        for(int price=1;price<=max;price++){
            while(coins>=price && freq[price]>0){
                coins-=price;
                freq[price]--;
                count++;
            }
        }
        return count;
    }
}