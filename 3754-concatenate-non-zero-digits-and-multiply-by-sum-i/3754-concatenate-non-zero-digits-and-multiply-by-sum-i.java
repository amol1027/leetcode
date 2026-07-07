class Solution {
    public long sumAndMultiply(int n) {
        int rem =0;
        long sum=0;
        long ans = 0;
        String revNum = new StringBuilder(String.valueOf(n)).reverse().toString();
        int num = Integer.parseInt(revNum);
        while(num>0){
            rem = num%10;
            if(rem != 0){
                sum += rem;
                ans = ans*10 + rem;
            }
            num/=10;
        }
        return ans*sum;
    }
}