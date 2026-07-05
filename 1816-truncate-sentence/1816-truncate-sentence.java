class Solution {
    public String truncateSentence(String s, int k) {
       int count = 0;
       String regx = "\\s+";
       StringBuilder res = new StringBuilder();
       String[] frmt = s.split(regx);
       for(String str : frmt){
        if(count<k){
            res.append(str+(" "));
        count++;
        }
       }
       res.deleteCharAt(res.length()-1);
       return res.toString();
    }
}