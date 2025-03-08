import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length == 1){
            answer = new int[1];
            answer[0] = -1;
        }
        else {
            int min = Integer.MAX_VALUE;
            for(int i = 0; i < arr.length; i++) {
                min = Math.min(arr[i], min);
            }
            for(int i = 0, j = 0; i < arr.length; i++) {
                if(arr[i] == min) i++;
                if(i == arr.length) break;
                arr[j] = arr[i];
                j++;
            }
            answer = Arrays.copyOf(arr, arr.length-1);
        }
        return answer;
    }
}