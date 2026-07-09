class Solution {
    public int arrangeCoins(int n) {
        long l = 0;
        long r = n;
        long ans = 0;
        long mid = 0;
        while(l<=r){
            mid = l+(r-l)/2;
            long coinCount = (mid*(mid+1))/2;
            if(coinCount<=n){
                ans = mid;
                l = mid+1;
            }else{
                r = mid-1;
            }
        }
        return(int)ans;
    }
}