class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0; 
        HashSet hm = new HashSet<>();
        for(int i=0; i<jewels.length(); i++){
            hm.add(jewels.charAt(i));
        }
        for(int i=0; i<stones.length(); i++){
            if(hm.contains(stones.charAt(i)))
                count++;
        }
        return count;
    }
}