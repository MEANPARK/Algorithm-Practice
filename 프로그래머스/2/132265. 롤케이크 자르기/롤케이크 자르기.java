import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        if(topping.length == 1) {
            return 0;
        }
        
        Map<Integer, Integer> mapA = new HashMap<>();
        Map<Integer, Integer> mapB = new HashMap<>();
        
        for(int i = 0; i < topping.length; i++) {
            mapA.put(topping[i], mapA.getOrDefault(topping[i], 0) + 1);
        }
        
        for(int i = 0; i < topping.length; i++) {
            mapA.put(topping[i], mapA.getOrDefault(topping[i], 0) - 1);
            mapB.put(topping[i], mapB.getOrDefault(topping[i], 0) + 1);
            
            if(mapA.getOrDefault(topping[i], 0) == 0) {
                mapA.remove(topping[i]);
            }
            
            if(mapA.size() == mapB.size()) {
                answer++;
            }
        }
       
        return answer;
    }
}