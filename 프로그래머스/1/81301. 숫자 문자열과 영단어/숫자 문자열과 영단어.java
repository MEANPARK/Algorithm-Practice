import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String check = "";
        String trans = "";
        
        Map<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 65) check += s.charAt(i);
            else trans += s.charAt(i);
            
            if(map.containsKey(check)) {
                trans += String.valueOf(map.get(check));
                check = "";
            }
        }
        answer = Integer.parseInt(trans);
        return answer;
    }
}