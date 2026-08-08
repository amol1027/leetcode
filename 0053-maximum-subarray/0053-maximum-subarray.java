class Solution {
    public int maxSubArray(int[] nums) {
        int curr_sum = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i : nums){
            curr_sum+=i;
            max_sum=Math.max(max_sum,curr_sum);
            if(curr_sum<0){
                curr_sum = 0;
            }
            
        }
        return max_sum;
    }
}