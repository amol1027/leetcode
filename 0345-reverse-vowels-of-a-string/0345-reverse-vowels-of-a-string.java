class Solution {
    public String reverseVowels(String s) {
        int r = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        int l = s.length()-1;
        String set = "aeiouAEIOU";
        while(r<l){
            char rc = sb.charAt(r);
            char lc = sb.charAt(l);
            if(!set.contains(String.valueOf(rc))){
                r++;
                continue;
            }
            if(!set.contains(String.valueOf(lc))){
                l--;
                continue;
            }
            else{
                sb.setCharAt(r,lc);
                sb.setCharAt(l,rc);
                r++;
                l--;
            }
        }
        return sb.toString();
    }
}