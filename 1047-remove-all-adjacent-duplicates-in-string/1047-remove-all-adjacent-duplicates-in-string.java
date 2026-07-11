class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>res = new Stack<>();
        for(int i=0; i<s.length(); i++){
            if(!res.isEmpty()&&res.peek()==s.charAt(i)){
                    res.pop();
                    }
            else{
                res.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch : res){
            sb.append(ch);
        }
        return sb.toString();
    }
}