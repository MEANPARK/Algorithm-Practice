import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>();
        String city = "";
        
        if(cacheSize == 0) {
            return 5 * cities.length;
        }
        
        for(int i = 0; i < cities.length; i++) {
            city = cities[i].toLowerCase();
            
            if(map.getOrDefault(city, -1) != -1) {
                map.put(city, i);
                answer += 1;
            }
            else if(map.size() < cacheSize) {
                map.put(city, i);
                answer += 5;
            }
            else {
                answer += 5;
                int min = 300000;
                String minKey = "";
                Set<String> keySet = map.keySet();
                for(String str : keySet) {
                    int value = map.get(str);
                    if(min > value) {
                        min = value;
                        minKey = str;
                    }
                }
                map.remove(minKey);
                map.put(city, i);
            }
        }
        return answer;
    }
}