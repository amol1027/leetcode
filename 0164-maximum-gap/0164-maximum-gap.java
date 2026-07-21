class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)
            return 0;
        Arrays.sort(nums);
        int maxSum=0;
        int j=1;
        for(int i=0; i<nums.length-1; i++){
            maxSum = Math.max(maxSum,nums[i+1]-nums[i]); 
        }
        return maxSum;
    }
}