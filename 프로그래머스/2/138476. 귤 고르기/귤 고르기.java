import java.util.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int answer = 0;
        
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i : tangerine) {
            map.put(i, map.getOrDefault(i, 0)+1);
        }

        ArrayList<Integer> count = new ArrayList<>();

        for(int i : map.keySet()){
            if(map.get(i) >= k) return 1;
            count.add(map.get(i));
        }

        Collections.sort(count);
        
        int sum = 0;
        for(int i = count.size()-1; i >= 0; i--) {
            sum += count.get(i);
            if(k <= sum) {
                answer += 1;
                break;
            }
            answer++;
        }
        
        
        return answer;
    }
}