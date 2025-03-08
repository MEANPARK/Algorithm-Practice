import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        int target = location;
        
        int max = 0;
        
        List<Integer> priorQue = new LinkedList<>();
        
        for(int i = 0; i < priorities.length; i++) {
            priorQue.add(priorities[i]);
            max = Math.max(priorities[i], max);
        }
        
        System.out.println(priorQue);
        
        int count = 0;
        while(priorQue.size() != 0) {
            if(max == priorQue.get(0)) {
                if(target == 0) break;
                max = 0;
                priorQue.remove(0);
                for(int i = 0; i < priorQue.size(); i++) {
                    max = Math.max(priorQue.get(i), max);
                }
                count++;
            }
            else {
                priorQue.add(priorQue.get(0));
                priorQue.remove(0);
                if(target == 0) {
                    target = priorQue.size();
                }
            }
            target--;
        }
        answer = count + 1;
        return answer;
    }
}