class Solution {
    void finalStack(Stack<Character> st, String s) {
        for(char c : s.toCharArray()) {
            if(c == '#') {
                if(!st.isEmpty()) {
                    st.pop();
                }
            } else {
                st.push(c);
            }
        }
    }
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        finalStack(st1, s);
        finalStack(st2, t);
        return st1.toString().equals(st2.toString());
    }
}