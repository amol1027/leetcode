class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            int sum = 0;
            while (i > 0) {
                int rem = i % 10;
                sum += rem;
                i=i/10;
            }
            min = Math.min(min, sum);
        }
        return min;
    }

}