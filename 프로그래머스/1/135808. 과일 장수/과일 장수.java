import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int min = 10;
        int count = 0;
        
        Arrays.sort(score);
        
        for(int i = score.length-1; i >= score.length % m; i--) {
            min = Math.min(score[i], min);
            count++;
            if(count == m) {
                answer += min * m;
                count = 0;
                min = 10;
            }        
        }
        
        return answer;
    }
}