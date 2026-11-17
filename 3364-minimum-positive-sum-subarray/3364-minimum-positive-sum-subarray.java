class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int res = Integer.MAX_VALUE;
        for(int i = 0; i<nums.size(); i++){
            int sum = 0;
            for(int j = i; j<nums.size(); j++){
                int len = j-i+1;
                sum+=nums.get(j);
                if(sum>0 && len>=l && len<=r)
                    res = Math.min(sum,res);
            }
            
        }
        return res==Integer.MAX_VALUE?-1:res;
    }
}