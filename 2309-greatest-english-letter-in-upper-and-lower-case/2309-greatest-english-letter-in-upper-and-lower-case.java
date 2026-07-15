class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> set1 = new HashSet<>();
        HashSet<Character> set2 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i)))
                set1.add(s.charAt(i));
            else {
                set2.add(s.charAt(i));
            }
        }
        char ans = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                if (set1.contains(Character.toLowerCase(ch)) && ch > ans) {
                    ans = ch;
                }

            } else {
                if (set2.contains(Character.toUpperCase(ch)) && Character.toUpperCase(ch) > Character.toUpperCase(ans)) {
                    ans = Character.toUpperCase(ch);
                }
            }
        }
        if (ans == 0)
            return "";
        else
            return String.valueOf(ans);
    }
}