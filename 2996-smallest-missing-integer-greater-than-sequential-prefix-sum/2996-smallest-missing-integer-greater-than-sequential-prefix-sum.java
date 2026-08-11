class Solution {
    public int missingInteger(int[] nums) {
        int sum = nums[0];
        HashSet<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
        }
       if(!set.contains(sum))
        return sum;
        else{
             while(set.contains(sum)){
            sum++;
        }
        }
        return sum;
    }
}