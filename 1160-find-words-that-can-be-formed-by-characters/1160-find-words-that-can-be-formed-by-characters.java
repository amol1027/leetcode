class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character,Integer> map = new HashMap<>();
        int res=0;
        for(char ch : chars.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(String st: words){
            int len = 0;
            Map<Character,Integer> temp = new HashMap<>();
            for(char ch : st.toCharArray()){
                temp.put(ch,temp.getOrDefault(ch,0)+1);
            }
            for(int i=0; i<st.length(); i++){
                int n1 = 0;
                int n2 = 0;
                if(temp.get(st.charAt(i))!=null)
                n1 = temp.get(st.charAt(i));
                if(map.get(st.charAt(i))!=null)
                n2 = map.get(st.charAt(i));
                if(n1 > n2){
                    break;
                }
                len++;
            }
            if(len==st.length()){
                res+=st.length();
            }
        }
        return res;
    }
}