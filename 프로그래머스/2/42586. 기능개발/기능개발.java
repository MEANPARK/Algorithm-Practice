import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int count = 1;
        int temp = 0;
        int value = (int)Math.ceil((double)(100 - progresses[0]) / speeds[0]);
        
        for(int i = 1; i < progresses.length; i++) {
            temp = (int)Math.ceil((double)(100 - progresses[i]) / speeds[i]);
            if(value >= temp) count++;
            else {
                value = temp;
                arr.add(count);
                count = 1;
            } 
        }
        arr.add(count);
        
        int[] answer = new int[arr.size()];
        for(int i = 0 ; i < arr.size(); i++) {
            answer[i] = arr.get(i);
        }
        return answer;
    }
}