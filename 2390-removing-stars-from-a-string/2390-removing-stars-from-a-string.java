class Solution {
    public String removeStars(String s) {
        Stack<Character> stk = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                stk.push(s.charAt(i));
            }
            else{
                if(!stk.isEmpty()){
                    stk.pop();
                }
            }
        }
        StringBuilder res = new StringBuilder();
        for(char ch : stk)
        res.append(ch);

        return res.toString();
    }
}