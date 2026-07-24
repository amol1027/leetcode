class Solution {
    public int vowelConsonantScore(String s) {
        int vowel = 0;
        int con = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                char ch = Character.toLowerCase(s.charAt(i));
                if (ch == 'a' || ch == 'i' || ch == 'e' || ch == 'u' || ch == 'o') {
                    vowel++;
                } else {
                    con++;
                }
            }

        }
        if(vowel==0 || con==0)
        return 0;
        else
        return (vowel / con);
    }
}