class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
       int com = Integer.MAX_VALUE;
        for(int x:nums1){
            for(int y: nums2){
                if(x==y){
                   com = Math.min(com,x);
                }
            }
        }
        if(com!=Integer.MAX_VALUE)
            return com;
       else{
       if(nums1[0]<nums2[0]){
        return nums1[0] * 10 + nums2[0];
       }
       else{
        return nums2[0] * 10 + nums1[0];
       }
       }
    }
}