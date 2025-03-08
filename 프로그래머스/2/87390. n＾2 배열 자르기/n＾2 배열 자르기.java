import java.util.*;

class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right-left)+1];
        int k = 0;
        for(long i = left; i <= right; i++) {
            if((int)(i/n)+1 >= (int)(i%n)+1) answer[k] = (int)(i/n)+1;
            else answer[k] = (int)(i%n)+1;
            k++;
        }

        return answer;
    }
}