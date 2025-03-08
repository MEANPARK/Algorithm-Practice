import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        int stagesLength = stages.length;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < stagesLength; i++) {
            map.put(stages[i], map.getOrDefault(stages[i], 0) + 1);
        }
        
        double total = stagesLength;
        double fail = 0;
        double[][] arr = new double[N][2];
        for(int i = 1; i <= N; i++) {
            fail = map.getOrDefault(i, 0);
            if(total == 0) {
                arr[i-1][0] = i;
                arr[i-1][1] = 0;
            }
            else {
                arr[i-1][0] = i;
                arr[i-1][1] = fail / total;
            }
            total -= fail;
        }
        
        Arrays.sort(arr, (o1, o2) -> Double.compare(o2[1], o1[1]));
        
        for(int i = 0; i < N; i++) {
            answer[i] = (int)arr[i][0];
        }
        
        return answer;
    }
}