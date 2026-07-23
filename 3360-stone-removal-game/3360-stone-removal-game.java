class Solution {
    public boolean canAliceWin(int n) {
        if (n<10)
            return false;
        int remove = 10;
        boolean aliceTurn = true;
        while(remove>0){
            if(n<remove){
                if(aliceTurn){
                    return false;
                }
                return true;

            }
            n-=remove;
            remove--;
            aliceTurn=!aliceTurn;
        }
        return aliceTurn;
    }
}