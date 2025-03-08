import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> arrList = new ArrayList();
        for(int i : arr) {
            if(i % divisor == 0) arrList.add(i);
        }
        
        int[] answer;
        
        if(arrList.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            answer = new int[arrList.size()];
            arrList.sort(Comparator.naturalOrder());

            for(int i = 0; i < arrList.size(); i++) {
                answer[i] = arrList.get(i);
            }
        }
        
        return answer;
    }
}