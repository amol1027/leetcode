class Solution {
    public int firstStableIndex(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            int sum = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int j = 0;
            while(j<=i){
                max = Math.max(max,nums[j]);
                j++;
            }
            j = nums.length-1;
            while(j>=i){
                min = Math.min(min,nums[j]);
                j--;
            }
            sum = max-min;
            if(sum <= k){
               
                return i;
            }
        }
        return -1;
    }
}