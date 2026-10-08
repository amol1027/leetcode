class Solution {
    public String removeOuterParentheses(String s) {
        int lvl=0;
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c == ')')
                lvl--;
            if(lvl>0)
                res.append(c);
            if(c == '(')
                lvl++;
        }
        return res.toString();
    }
}