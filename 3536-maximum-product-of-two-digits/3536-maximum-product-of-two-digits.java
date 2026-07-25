class Solution {
    public int maxProduct(int n) {
        int f = n%10;
        n/=10;
        int s = n%10;
        n/=10;
        if(s>f){
            int temp = f;
            f =s;
            s = temp;
            
        }
        while(n>0){
            int a = n%10;
            n/=10;

            if(a>f){
                s = f;
                f =a;
            }else if(a>s){
                s=a;
            }
        }
        return f*s;
    }
}