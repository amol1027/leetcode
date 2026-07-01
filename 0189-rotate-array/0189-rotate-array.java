class Solution {
    public void rotate(int[] nums, int k) {
        
        int n=nums.length;
        k=k%n;
        sortArray(nums,0,n-1);
        sortArray(nums,0,k-1);
        sortArray(nums,k,n-1);
        
    }
    private void sortArray(int[] nums, int s, int l){
            while(s<l){
                int temp = nums[s];
                nums[s]=nums[l];
                nums[l]= temp;
                l--;
                s++;

            }
        }
}