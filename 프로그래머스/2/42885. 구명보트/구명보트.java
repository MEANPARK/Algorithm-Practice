import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        boolean[] flag = new boolean[people.length];
        Arrays.fill(flag, false);      
        int index = 0;
            
        Arrays.sort(people);
        
        for(int i = people.length-1; i >= 0; i--) {
            if(flag[i]) continue;
            
            if(people[i] + people[index] <= limit) {
                flag[i] = true;
                flag[index] = true;
                index++;
                answer++;
            }
            else {
                flag[i] = true;
                answer++;
            }
        }
        return answer;
    }
}