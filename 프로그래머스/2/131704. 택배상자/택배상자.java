import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        int target = 1;
        for(int i = 0; i < order.length; i++) {
            if(answer != i) break;
            
            if(!st.isEmpty()) {
                if(order[i] == st.peek()) {
                    answer++;
                    st.pop();
                }
            }
            
            if(order[i] == target){
                answer++;
                target++;
            }
            
            else if(order[i] > target) {    
                for(int j = target; j < order[i]; j++) {
                    st.add(j);
                }
                answer++;
                target = order[i]+1;
            }
            
        }
        return answer;
    }
}