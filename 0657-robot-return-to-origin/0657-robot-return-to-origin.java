class Solution {
    public boolean judgeCircle(String moves) {
     return moves.replace("D","").length() == moves.replace("U","").length()&&
     moves.replace("L","").length() == moves.replace("R","").length();   
    }
}