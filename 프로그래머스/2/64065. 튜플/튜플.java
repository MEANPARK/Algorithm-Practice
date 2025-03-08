import java.util.*;

class Solution {
    public int[] solution(String s) {
        
        String[] str = s.substring(2,s.length()-2).split("\\},\\{");
        Map<String, Integer> map = new HashMap<>();
        for(String arr : str) {
            String[] letters = arr.split(",");
            for(int i = 0; i < letters.length; i++) {
                map.put(letters[i], map.getOrDefault(letters[i], 0)+1);
            }
        }
        
        int length = map.size();
        int[] answer = new int[length];
        Set<String> keySet = map.keySet();
        
        for(String key : keySet) {
            answer[length - map.get(key)] = Integer.parseInt(key);
        }
        
        return answer;
    }
}