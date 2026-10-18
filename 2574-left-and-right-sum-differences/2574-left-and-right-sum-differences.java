class Solution {
    public int[] leftRightDifference(int[] nums) {
        int lsum = 0;
        int rsum = 0;
        for(int i : nums){
            rsum += i;
        }
        int ans[] = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            rsum-=nums[i];
            ans[i] = Math.abs(lsum-rsum);
            lsum+=nums[i];
        }
        return ans;
    }
}