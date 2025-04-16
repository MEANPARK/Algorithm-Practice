import java.util.*;

class Solution {
    public ArrayList<Integer> solution(int n, int s) {
        ArrayList<Integer> answer = new ArrayList<>();
        if(s < n) {
            answer.add(-1);
            return answer;
        }

        int value = s / n;
        int exceed = s % n;
        
        for(int i = 0; i < n; i++) {
            if(i >= n - exceed) {
                answer.add(value + 1);    
            } else {
                answer.add(value);
            }
        }
        return answer;
    }
}