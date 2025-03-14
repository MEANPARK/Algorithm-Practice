import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        for(String key : keymap) {
            int index = 1;
            for(char c : key.toCharArray()) {
                if(map.getOrDefault(c, 0) == 0) {
                    map.put(c, index);
                }
                else if(map.get(c) > index) {
                    map.put(c, index);
                }
                index++;
            }
        }
        
        int aindex = 0;
        for(String target : targets) {
            for(char c : target.toCharArray()) {
                if(map.getOrDefault(c, 0) == 0) {
                    answer[aindex] = 0; // target에 존재하지 않으면 종료
                    break;
                }
                else {
                    answer[aindex] += map.get(c);
                }
            }
            if(answer[aindex] == 0) answer[aindex] = -1;
            aindex++;
        }
        return answer;
    }
}