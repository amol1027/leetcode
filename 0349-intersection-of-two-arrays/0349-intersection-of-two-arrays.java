class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> nums = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for(int num : nums1){
            nums.add(num);
        }
        for(int i=0; i<nums2.length; i++){
            if(nums.contains(nums2[i]))
                res.add(nums2[i]);
        }
        return res.stream()
            .mapToInt(Integer::intValue)
            .toArray();   
    }
}