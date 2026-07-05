class Solution {
    public boolean detectCapitalUse(String word) {
        int cap = 0;
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i)))
                cap++;
        }
        if(cap==1 && Character.isUpperCase(word.charAt(0)) || cap==0 || cap==word.length())
            return true;
        else return false;
    }
}