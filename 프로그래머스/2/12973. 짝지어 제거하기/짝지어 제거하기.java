import java.util.Stack;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> st = new Stack<Character>();
        st.push(s.charAt(0));
        int length = s.length();
        int target = 1;
        while(target != length) {
            if(!st.isEmpty() && st.peek() == s.charAt(target)) {
                st.pop();
            }
            else {
                st.push(s.charAt(target));
            }
            target++;
        }
        
        if(st.isEmpty()) answer = 1;
        else answer = 0;

        return answer;
    }
}