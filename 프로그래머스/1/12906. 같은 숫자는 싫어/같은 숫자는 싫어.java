import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);
        int target = 0;
        for(int i = 0; i < arr.length; i++) {
            if(list.get(target) != arr[i]) {
                list.add(arr[i]);
                target++;
            }
        }
        int size = list.size();
        int[] answer = new int[size];
        for(int i = 0; i < size; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}