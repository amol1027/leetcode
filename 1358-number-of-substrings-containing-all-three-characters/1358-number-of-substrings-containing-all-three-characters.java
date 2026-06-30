class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0;
        int[] f =new int[3];
        int total=0;
        while(r<s.length()){
            char curr = s.charAt(r);
            f[curr-'a']++;
            while(hasAllChars(f)){
                total+=s.length()-r;
                char l_char = s.charAt(l);
                f[l_char-'a']--;
                l++;
            }
            r++;
        }
        return total;
    }
    private boolean hasAllChars(int[] f){
        return f[0]>0 && f[1]>0 && f[2]>0;
    }
}