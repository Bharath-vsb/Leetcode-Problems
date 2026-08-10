class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) == 1)
                return key;
        }
        return -1;
    }
}