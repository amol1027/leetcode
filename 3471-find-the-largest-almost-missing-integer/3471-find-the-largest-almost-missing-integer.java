class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxVal = Integer.MIN_VALUE;
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
            if (x > maxVal) {
                maxVal = x;
            }
        }
        int max = Integer.MIN_VALUE;
        if (k == 1) {
            for (int i : map.keySet()) {
                if (map.get(i) == 1) {
                    max = Math.max(i, max);
                }
            }
            if(max==Integer.MIN_VALUE)
                return -1;
            else
                return max;
        } else if (k == nums.length) {
            return maxVal;
        } else {
            int first = nums[0];
            int last = nums[nums.length - 1];

            if (map.get(first) == 1 && map.get(last) == 1)
                return Math.max(first,last);
            if(map.get(first)==1)
                return first;
            if(map.get(last)==1)
                return last;
        }
        return -1;
    }
}