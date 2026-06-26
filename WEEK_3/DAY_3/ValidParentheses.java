class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        if(n%2!=0)return false;
        int i = 0;
        while (i < n) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if(st.empty())return false;
                if ((ch == ')' && st.peek() == '(') || (ch == '}' && st.peek() == '{')
                        || (ch == ']' && st.peek() == '[')) {
                    st.pop();
                }
                else return false;
            }
            i++;
        }
        if(st.empty())return true;
        return false;
    }
}
