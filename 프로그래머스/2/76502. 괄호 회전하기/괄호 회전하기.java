import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        List<Character> list = new ArrayList<Character>();
        Stack<Character> st = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }
        
        for(int i = 0; i < s.length(); i++) {
            for(int j = 0; j < list.size(); j++) {
                if(st.isEmpty()) st.add(list.get(j));
                else {
                    if(st.peek() == '(' && list.get(j) == ')') st.pop();
                    else if(st.peek() == '{' && list.get(j) == '}') st.pop();
                    else if(st.peek() == '[' && list.get(j) == ']') st.pop();
                    else st.add(list.get(j));
                }
            }
            if(st.isEmpty()) answer++;
            list.add(list.remove(0));
            st.clear();
        }
        
        return answer;
    }
}