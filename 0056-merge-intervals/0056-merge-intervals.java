class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1) return intervals;
        Arrays.sort(intervals,Comparator.comparingInt(i ->i[0]));

        List<int[]> res=new ArrayList<>();
        int[] newinter=intervals[0];
        res.add(newinter);
        for(int[] interval:intervals){
            if(interval[0]<=newinter[1]){
                newinter[1]=Math.max(interval[1],newinter[1]);
            }
            else{
                newinter=interval;
                res.add(newinter);
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}