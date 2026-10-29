class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int key1 = map.get(s.charAt(0));
        for(int i : map.values()){
            if(i!=key1){
                return false;
            }
        }
        return true;
    }
}