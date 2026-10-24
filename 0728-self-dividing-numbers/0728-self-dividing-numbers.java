class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>(); 
        for(int i=left;i<=right;i++){
            if(i>0 && i<10){
                res.add(i);
            }
            else{
                boolean yes = true;
                int rem = 0;
                int temp = i;
                while(temp>0){
                    rem = temp%10;
                    if(rem!=0 && i%rem==0){
                        yes = true;
                    }else{
                        yes = false;
                        break;
                    }
                    temp = temp/10;
                }
                int last = 0;
                last = i%10;
                if(yes==true && last!=0){
                    res.add(i);
                }
            }
        }
        return res;
    }
}