class Solution {
    public int maxVowels(String s, int k) {
     int maxVowels = 0;
     int vowels = 0;
     Set<Character> set = new HashSet<>();
     set.add('a');
     set.add('e');
     set.add('i');
     set.add('o');
     set.add('u');
     for(int i=0; i<k; i++){
        if(set.contains(s.charAt(i)))
            vowels++;
     }
     maxVowels = Math.max(vowels,maxVowels);
     for(int i=k; i<s.length(); i++){
        if(set.contains(s.charAt(i-k)))
            vowels--;
        if(set.contains(s.charAt(i)))
            vowels++;
        maxVowels=Math.max(vowels,maxVowels);
     }
     return maxVowels;

    }
}