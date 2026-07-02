class Solution {
    public int passwordStrength(String password) {
       HashSet<Character> hs = new HashSet<>();
       int count = 0;
        for(int i = 0; i<password.length(); i++){
            if(!hs.contains(password.charAt(i))){
                hs.add(password.charAt(i));
            }
        }
        for(char ch: hs){
            if(ch=='!'||ch=='@'||ch=='#'||ch=='$'){
                count+=5;
            }
            else if(ch>='a'&&ch<='z'){
                count+=1;
            }
            else if(ch>='0'&&ch<='9'){
                count+=3;
            }
            else{
                count+=2;
            }
        }
        return count;
    }
}