import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++) {
            if(i < participant.length-1) {
                map.put(completion[i], map.getOrDefault(completion[i], 0) - 1);
            }
            map.put(participant[i], map.getOrDefault(participant[i], 0) + 1);
        }
        
        for(int i = 0; i < participant.length; i++) {
            if(map.get(participant[i]) == 1) {
                answer = participant[i];
                break;
            }
        }
        
        
        return answer;
    }
}