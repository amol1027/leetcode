class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String regx = "\\s+";
        String[] res = sentence.split(regx);
        int ans = 1;
        for(String str: res){
            if(str.startsWith(searchWord))
                return ans;
            ans++;
        }
        
        return -1;
    }
}