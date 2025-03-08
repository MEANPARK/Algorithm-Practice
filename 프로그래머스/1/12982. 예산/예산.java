import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sumNum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        int length = d.length;
        for(int i = 0; i < length; i++) {
            arr.add(d[i]);
        }
        Collections.sort(arr);
        
        for(int i = 0; i < length; i++) {
            sumNum += arr.get(i);
            if(sumNum <= budget) answer++;
            else break;
        }
        
        return answer;
    }
}