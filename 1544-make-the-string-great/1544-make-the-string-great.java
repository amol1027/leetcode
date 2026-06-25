class Solution {
    public String makeGood(String s) {
        Stack<Character> stk = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (!stk.isEmpty()) {
                char top = stk.peek();
                char curr = s.charAt(i);
                if (Math.abs(top - curr) == 32)
                stk.pop();
                else
                stk.push(s.charAt(i));
            } else {
                stk.push(s.charAt(i));
            }

        }
        StringBuilder res = new StringBuilder();
        for (char ob : stk) {
            res.append(ob);
        }
        return res.toString();
    }
}