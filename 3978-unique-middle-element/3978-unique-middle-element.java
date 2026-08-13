class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count = 0;
        int mid = nums[nums.length/2];
        for(int i: nums){
            if(i==mid){
                count++;
            }
        }
        if(count==1){
            return true;
        }else{
            return false;
        }
    }
}