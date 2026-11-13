class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int res = 1;
        int dec = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                dec++;
            }else{
               
               dec = 1;
            }
            res = Math.max(dec,res);
        }
        dec = 1;
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]<nums[i+1]){
                dec++;
            }else{
               
               dec = 1;
            }
            res = Math.max(dec,res);
        }
        return res;
    }
}