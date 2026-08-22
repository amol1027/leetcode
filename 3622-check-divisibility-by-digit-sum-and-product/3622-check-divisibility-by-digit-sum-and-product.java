class Solution {
    public boolean checkDivisibility(int n) {
       int sum=0;
       int prod = 1;
       int temp = n;
       int rem=0;
       while(n>0){
        rem = n%10;
        sum+=rem;
        prod*=rem;
        n=n/10;
       } 
       if(temp%(sum+prod)==0)
        return true;
        else return false;
    }
}