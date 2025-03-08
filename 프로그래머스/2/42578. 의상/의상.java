import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }

        Set<String> ketSet = map.keySet();
        int c = 1;
        for(String s : ketSet) {
            c *= map.get(s)+1;
        }
        answer += c - 1;
        return answer;
    }
    
}