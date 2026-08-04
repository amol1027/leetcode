class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums){
            set.add(num);
            min = Math.min(min,num);
            max = Math.max(max,num);
        }
        for(int i = min+1; i<max; i++){
            if(!set.contains(i)){
                res.add(i);
            }
        }
        return res;
    }
}