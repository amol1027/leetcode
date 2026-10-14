class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] str = s.split(" ");
        for(String st : str){
            StringBuilder st1 = new StringBuilder(st).reverse();
            sb.append(st1+" ");
        }
        return sb.toString().strip();
    }
}