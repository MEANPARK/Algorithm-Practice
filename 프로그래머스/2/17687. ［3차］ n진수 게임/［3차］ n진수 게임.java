import java.util.*;

class Solution {
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        StringBuilder result = new StringBuilder();
        
        int index = 0;
        String num = Integer.toString(index, n);
        index++;
        Queue<Character> que = new LinkedList<>();
        
        que.add(num.charAt(0));
        
        int order = 0;
        int target = p-1;
        int count = 0;
        while(!que.isEmpty()) {
            char c = que.poll();
            
            if(order == target) {
                result.append(c);
                target += m;
                count++;
            }
            
            if(count == t) break;
                
            if(count != t && que.isEmpty()) {
                num = Integer.toString(index, n);
                for(int i = 0; i < num.length(); i++) {
                    que.add(Character.toUpperCase(num.charAt(i)));
                }
                index++;
            }
            order++;
        }
        
        answer = result.toString();
        
        return answer;
    }
}