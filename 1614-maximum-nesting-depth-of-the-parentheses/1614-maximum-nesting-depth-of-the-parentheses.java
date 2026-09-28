class Solution {
    public int maxDepth(String s) {
        int openb = 0;
        int ans = 0;
        for(char c : s.toCharArray()){
            if(c == '('){
                openb++;
            }
            if(c == ')'){
                openb--;
            }
            ans = Math.max(openb, ans);
        }
        return ans;
    }
}