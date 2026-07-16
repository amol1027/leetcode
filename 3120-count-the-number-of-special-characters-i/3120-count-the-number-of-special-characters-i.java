class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                set1.add(word.charAt(i));
            }
        }
        for(int i=0; i<word.length(); i++){
            if(Character.isLowerCase(word.charAt(i))){
                set2.add(word.charAt(i));
            }
        }
        
        int count=0;
        for(char ch : set1){
            if(set2.contains(Character.toLowerCase(ch))){
                count++;
            }
        }
        return count;
    }
}