class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0;
        int r = 0;
        int res = 0;
        while (r < s.length()) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);

            while (map.get(c) > 2) {
                char lc = s.charAt(l);
                map.replace(lc, map.get(lc) - 1);
                if (map.get(lc) == 0) {
                    map.remove(lc);
                }
                l++;
            }
            res = Math.max(res, (r - l) + 1);
            r++;
        }
        return res;
    }
}