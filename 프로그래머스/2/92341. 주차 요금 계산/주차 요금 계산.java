import java.util.*;

class Solution {
    public int[] solution(int[] fees, String[] records) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> result = new HashMap<>();
        
        for(int i = 0; i < records.length; i++) {
            String[] str = records[i].split(" ");
            String[] times = str[0].split(":");
            
            int minute = Integer.parseInt(times[0]) * 60 + Integer.parseInt(times[1]);
            
            if(map.getOrDefault(str[1], -1) == -1) {
                map.put(str[1], minute);
            }
            else {
                minute = minute - map.get(str[1]);
                map.remove(str[1]);
                result.put(str[1], result.getOrDefault(str[1], 0) + minute);
            }
        }
        
        if(map.size() > 0) {
            Set<String> keySet = map.keySet();
            for(String key : keySet) {
                int minute = (23 * 60 + 59) - map.get(key);
                result.put(key, result.getOrDefault(key, 0) + minute);
            }
        }
        
        int[] answer = new int[result.size()];
        int index = 0;
        
        List<String> resultKeySet = new ArrayList<>(result.keySet());

        Collections.sort(resultKeySet);
        
        for(String key : resultKeySet) {
            if(result.get(key) >= fees[0]) {
                answer[index] = fees[1] + (int)Math.ceil((((double)result.get(key) - (double)fees[0]) / fees[2])) * fees[3];
            }
            else {
                answer[index] = fees[1];
            }
            index++;
        }
        return answer;
    }
}