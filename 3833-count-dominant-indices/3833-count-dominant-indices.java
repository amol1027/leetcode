class Solution {
    public int dominantIndices(int[] nums) {
        int sum = 0;
        int count =0;
        for(int i : nums){
            sum+=i;
        }
        for(int i=0; i<nums.length; i++){
            sum-=nums[i];
            int rCount = nums.length-i-1;
            if(nums[i]*rCount >sum){
                count++;
            }
        }
        return count;
    }
}