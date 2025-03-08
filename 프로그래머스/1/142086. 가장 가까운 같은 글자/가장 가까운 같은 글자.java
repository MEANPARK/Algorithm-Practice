import java.util.Map;
import java.util.HashMap;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        int length = s.length();
        
        Map<Character, Integer> hashMap = new HashMap<>();
        
        for(int i = 0; i < length; i++) {
            if(!hashMap.containsKey(s.charAt(i))) {
                answer[i] = -1;
                hashMap.put(s.charAt(i), i);
            }
            else {
                answer[i] = i - hashMap.get(s.charAt(i));
                hashMap.put(s.charAt(i), i);
            }
        }
        return answer;
    }
}