import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        boolean t = true; // 모두 할인 받을 수 있는 날인가?
        boolean le = false; // discount 날짜를 모두 확인해보았는가?
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < 10; i++) {
            map.put(discount[i], map.getOrDefault(discount[i], 0) +1);
        }
        
        for(int i = 0; i < discount.length; i++) {
            t = true;
            for(int j = 0; j < want.length; j++) {
                if(map.getOrDefault(want[j], 0) < number[j]) {
                    t = false;
                    break;
                }
            }
            if(!t && le) break;
            if(t) answer++;
            
            if(discount.length > i+10) map.put(discount[i+10], map.getOrDefault(discount[i+10], 0)+1);
            else le = true;
            map.put(discount[i], map.getOrDefault(discount[i], 0)-1);
        }
        return answer;
    }
}