class Solution {
    public int mostWordsFound(String[] sentences) {
        int res = 0;
        for(String str : sentences){
            String[] newStr = str.split(" ");
            if(newStr.length>res)
                res = newStr.length;
        }
        return res;
    }
}