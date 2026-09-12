class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] < nums[minIndex]){
                minIndex = i;
            }
            if(nums[i] > nums[maxIndex]){
                maxIndex = i;
            }
        }
        int c1 = Math.max(minIndex,maxIndex)+1;
        int c2 = n - Math.min(minIndex,maxIndex);
        int c3 = Math.min(minIndex,maxIndex)+1+n-Math.max(minIndex, maxIndex);
        int res1 = Math.min(c1,c2);
        return Math.min(c3,res1);
    }
}