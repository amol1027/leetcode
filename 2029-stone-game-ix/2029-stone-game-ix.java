class Solution {
    public boolean stoneGameIX(int[] stones) {
        int zeros=0;
        int ones = 0;
        int twos =0;
        for(int x: stones){
            int rem = x%3;
            if(rem==1){
                ones++;
            }else if(rem==0){
                zeros++;
            }else{
                twos++;
            }
        }
        if(zeros%2==0){
            return ones>0 && twos>0;
        }
        return Math.abs(ones-twos)>2;

    }
}