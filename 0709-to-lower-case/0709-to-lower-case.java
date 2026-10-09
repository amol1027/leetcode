class Solution {
    public String toLowerCase(String s) {
        StringBuilder res = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c>=65 && c<= 90){
                res.append((char)(c+32));
            }else{
                res.append(c);
            }
        }
        return res.toString();
    }
}