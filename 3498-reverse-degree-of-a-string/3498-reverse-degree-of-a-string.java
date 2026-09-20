class Solution {
    public int reverseDegree(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int i=26;
        int deg =0;

        for(char c = 'a'; c<='z'; c++){
            map.put(c,i);
            i--;
        }

        for(int j=0; j<s.length(); j++){
            if(map.containsKey(s.charAt(j))){
                deg+= map.get(s.charAt(j)) * (j+1);
            }
        }
        return deg;
    }
}