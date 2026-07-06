class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int max = 0;
        for(int i: nums){
            if(i>max){
                max=i;
            }
        }
        int left =1;
        int right = max;
        while(left<right){
            int middle = left+(right-left)/2;
            if(isPossible(middle, nums, maxOperations)){
                right = middle;
            }else{
                left = middle+1;
            }
        }
        return left;
        
    }

    private boolean isPossible(int maxBalls, int[] nums, int maxOps){
        int totalOps =0;
        for(int i=0; i<nums.length; i++){
            int operation =(nums[i]-1)/maxBalls;
            totalOps+= operation;
            if(totalOps>maxOps)
                return false;
        }
        return true;
    } 
}