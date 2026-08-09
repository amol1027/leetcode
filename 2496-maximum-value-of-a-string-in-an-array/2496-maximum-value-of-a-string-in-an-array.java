class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for (String str : strs) {
            boolean isDigits = true;
            for (int i = 0; i < str.length(); i++) {
                if (!Character.isDigit(str.charAt(i))) {
                    isDigits = false;
                    break;
                }
            }
            int value = isDigits ? Integer.parseInt(str) : str.length();
            max = Math.max(max, value);
        }
        return max;
    }
}